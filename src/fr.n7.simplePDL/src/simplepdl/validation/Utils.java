package simplepdl.validation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * Classe utilitaire qui permet surtout de rÃ©cupÃ©rer le nom d'un EObject pour
 * l'afficher de maniÃ¨re <i>user-friendly</i>.
 * 
 * @author Guillaume Dupont
 * @version 0.1
 */
public final class Utils {
	/**
	 * Classe utilitaire donc constructeur inaccessible.
	 */
	private Utils() {}
	
	/**
	 * Noms possibles pour un attribut qui reprÃ©sente un nom/une identification d'un
	 * EObject. Si l'EObject dont on veut le nom possÃ¨de un attribut comme dans cet
	 * ensemble, alors on l'utilisera pour l'afficher (sinon on se contente de l'affichage
	 * par dÃ©faut offert par toString().
	 */
	private static final Set<String> NamingAttributes = Set.of(
			"name", "nom", "id"
		);

	/**
	 * "Devine" le nom d'un EObject en examinant ses attributs.
	 * Si l'objet a un attribut dont le nom fait partie des noms acceptÃ©s (de
	 * l'attribut static NamingAttributes) alors on utilise cette valeur, sinon on
	 * se contente de ce qui est retournÃ© par toString().
	 * 
	 * Dans tous les cas, le nom affichÃ© est le nom de l'object tel que devinÃ© (ou 
	 * rien) suivi du retour de toString(), qui donne des informations intÃ©ressantes pour le
	 * dÃ©bogage.
	 * 
	 * @param object objet dont on veut deviner le nom
	 * @return nom devinÃ© de l'objet
	 */
	public static String guessName(EObject object) {
		List<EAttribute> attributes = object.eClass().getEAttributes();
		
		Iterator<EAttribute> it = attributes.iterator();
		String name = null;
		while (it.hasNext() && name == null) {
			EAttribute a = it.next();
			if (NamingAttributes.contains(a.getName())) {
				name = object.eGet(a).toString() + " [" + object.toString() + "]";
			}
		}
		
		if (name == null) {
			name = object.toString();
		}

		return name;
	}

}
