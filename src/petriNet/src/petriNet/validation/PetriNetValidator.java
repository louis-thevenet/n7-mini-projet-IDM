package petriNet.validation;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import petriNet.Arc;
import petriNet.ArcType;
import petriNet.LinkDirection;
import petriNet.NetElement;
import petriNet.PetriNet;
import petriNet.Place;
import petriNet.Transition;
import petriNet.util.PetriNetSwitch;


/**
 * RÃ©alise la validation d'un EObject issu de SimplePDL (en thÃ©orie, d'un process). Cet classe
 * visite le modÃ¨le et utilise les caseXXX pour rediriger l'algo vers la bonne mÃ©thode. Attention,
 * lorsqu'une classe est un parent il faut aller faire la visite des enfants manuellement (cf.
 * caseProcess typiquement).
 *
 * <p>La classe Switch exige un paramÃ¨tre de gÃ©nÃ©ricitÃ© (et gÃ¨re une partie de la visite Ã
 * base de comparaison Ã  null). Ici le paramÃ¨tre est un boolÃ©en mais en rÃ©alitÃ© on ne s'en sert
 * pas...
 *
 * @author Guillaume Dupont
 * @version 0.1
 */
public class PetriNetValidator extends PetriNetSwitch<Boolean> {
  /** Expression rÃ©guliÃ¨re qui correspond Ã  un identifiant bien formÃ©. */
  private static final String IDENT_REGEX = "^[A-Za-z_][A-Za-z0-9_]*$";

  /** RÃ©sultat de la validation (Ã©tat interne rÃ©initialisÃ© Ã  chaque nouvelle validation). */
  private ValidationResult result = null;

  /** Construire un validateur */
  public PetriNetValidator() {}

  /**
   * Lancer la validation et compiler les rÃ©sultats dans un ValidationResult. Cette mÃ©thode se
   * charge de crÃ©er un rÃ©sultat de validation vide puis de visiter les process prÃ©sents dans la
   * ressource.
   *
   * @param resource resource Ã  valider
   * @return rÃ©sultat de validation
   */
  public ValidationResult validate(Resource resource) {
    this.result = new ValidationResult();

    for (EObject object : resource.getContents()) {
      this.doSwitch(object);
    }

    return this.result;
  }

  /**
   * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une Place.
   *
   * @param object Ã©lÃ©ment visitÃ©
   * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite vers les
   *     classes parentes, le cas Ã©chÃ©ant)
   */
  @Override
  public Boolean casePetriNet(PetriNet object) {
	  for (NetElement elt : object.getNetElements()) {
		  doSwitch(elt);
	  }
   

    return null;
  }
  
  /**
   * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une Place.
   *
   * @param object Ã©lÃ©ment visitÃ©
   * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite vers les
   *     classes parentes, le cas Ã©chÃ©ant)
   */
  @Override
  public Boolean casePlace(Place object) {
  
    this.result.recordIfFailed(
    		(object.getTokens()>=0),
            object,
            "La place possède un nombre de jetons strictement négatif");


    return null;
  }
  
  /**
   * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est un Arc.
   *
   * @param object Ã©lÃ©ment visitÃ©
   * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite vers les
   *     classes parentes, le cas Ã©chÃ©ant)
   */
  @Override
  public Boolean caseArc(Arc object) {
    this.result.recordIfFailed(
    		(object.getWeight()>=0),
            object,
            "L'arc possède un poids strictement négatif");

    
    if (object.getArcType() == ArcType.READ_ARC) {   
	    this.result.recordIfFailed(
	    		 (object.getLinkDirection() == LinkDirection.PLACE_TO_TRANSITION),
	            object,
	            "L'arc est un read-arc mais relie une transition à une place");
    }

    return null;
  }

  /**
   * MÃ©thode appelÃ©e lorsque l'objet visitÃ© est une Transition.
   *
   * @param object Ã©lÃ©ment visitÃ©
   * @return rÃ©sultat de validation (null ici, ce qui permet de poursuivre la visite vers les
   *     classes parentes, le cas Ã©chÃ©ant)
   */
  @Override
  public Boolean caseTransition(Transition object) {
  
    this.result.recordIfFailed(
    		(object.isTempsMaxBorne() || object.getTempsMin() <= object.getTempsMax()),
    		object,
            "Contrainte temporelle invalide, tempsMin > TempsMax");


    return null;
  }

  
  /**
   * Cas par dÃ©faut, lorsque l'objet visitÃ© ne correspond pas Ã  un des autres cas. Cette mÃ©thode
   * est aussi appelÃ©e lorsqu'une mÃ©thode renvoie null (comme une sorte de fallback). On pourrait
   * implÃ©menter le switch diffÃ©remment, en ne renvoyant null dans les autres mÃ©thodes que si la
   * contrainte ne sert Ã  rien, et se servir de cette mÃ©thode pour identifier les Ã©lÃ©ments
   * Ã©trangers (qui de toute faÃ§on ne doivent pas exister). C'est aussi la mÃ©thode appelÃ©e si on
   * ne redÃ©fini pas un des caseXXX.
   *
   * @param object objet visitÃ©
   * @return rÃ©sultat, null ici
   */
  @Override
  public Boolean defaultCase(EObject object) {
    return null;
  }
}
