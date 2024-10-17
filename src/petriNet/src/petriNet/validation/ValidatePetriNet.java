package petriNet.validation;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import petriNet.PetriNetPackage;

/**
 * RÃ©alise la validation de modÃ¨les conformes Ã  PetriNet Ã  l'aide du validateur et affiche le
 * rÃ©sultat.
 *
 * <p>Les modÃ¨les sont donnÃ©s dans les arguments de la ligne de commande, et le rÃ©sultat est
 * affichÃ© dans le terminal.
 *
 * @author Louis Thevenet
 * @version 0.1
 */
public class ValidatePetriNet {

  /**
   * Afficher une lsite d'erreur avec un prÃ©fixe. Le prÃ©fixe est affichÃ© avec juste "OK" Ã  la
   * suite si la liste est vide, et sinon la liste est affichÃ© avec une erreur par ligne, la source
   * de l'erreur et le message associÃ©.
   *
   * @param prefix prÃ©fixe Ã  afficher avant la liste (potentielle) d'erreurs
   * @param errors erreurs Ã  afficher
   */
  private static void afficherErreurs(
      String prefix, List<ValidationResult.ValidationError> errors) {
    System.out.print(prefix + ":");
    if (errors.isEmpty()) {
      System.out.println(" OK");
    } else {
      System.out.println(" " + errors.size() + " erreurs trouvÃ©es");
      for (ValidationResult.ValidationError error : errors) {
        System.out.println("=> " + error.toString());
      }
    }
  }

  /**
   * Affiche les erreurs pour les divers Ã©lÃ©ments du mÃ©ta-modÃ¨le.
   *
   * @param resultat rÃ©sultat de la validation calculÃ© auparavant
   */
  private static void afficherResultat(ValidationResult resultat) {
    afficherErreurs("- PetriNet", resultat.getRecordedErrorsFor(PetriNetPackage.PETRI_NET));
    afficherErreurs("- Arc", resultat.getRecordedErrorsFor(PetriNetPackage.ARC));
    afficherErreurs("- Place", resultat.getRecordedErrorsFor(PetriNetPackage.PLACE));
    afficherErreurs("- Transition", resultat.getRecordedErrorsFor(PetriNetPackage.TRANSITION));
  }

  /**
   * Fonction principale. Charge le mÃ©ta-modÃ¨le et les modÃ¨les passÃ©s en paramÃ¨tre sur la ligne
   * de commande, lance la validation pour chaque modÃ¨le et affiche le rÃ©sultat.
   *
   * @param args arguments de la ligne de commande
   */
  public static void main(String... args) {
    // On a besoin de rÃ©cupÃ©rer l'eINSTANCE pour qu'elle soit correctement instanciÃ©e.
    // C'est cette Ã©tape qui "charge le mÃ©ta-modÃ¨le".
    // Bien sÃ»r, on n'utilise pas directement packageInstance, d'oÃ¹ le warning "unused" qui
    // est supprimÃ© avec l'annotation.
    @SuppressWarnings("unused")
    PetriNetPackage packageInstance = PetriNetPackage.eINSTANCE;

    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    ResourceSet resSet = new ResourceSetImpl();

    PetriNetValidator validator = new PetriNetValidator();

    for (String model : args) {
      URI modelURI = URI.createURI(model);
      Resource resource = resSet.getResource(modelURI, true);
      ValidationResult resultat = validator.validate(resource);

      System.out.println("RÃ©sultat de validation pour " + model + ":");
      afficherResultat(resultat);
    }

    System.out.println("Fini.");
  }
}
