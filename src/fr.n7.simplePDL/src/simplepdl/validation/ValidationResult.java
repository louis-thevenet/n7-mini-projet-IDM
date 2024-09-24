package simplepdl.validation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Classe qui reprÃ©sente un rÃ©sultat de validation, c'est-Ã -dire une liste
 * d'erreurs avec message et objet concernÃ©.
 * @author Guillaume Dupont
 * @version 0.1
 */
public class ValidationResult {
	/**
	 * Classe interne qui reprÃ©sente une erreur, avec l'objet source de l'erreur
	 * et le message associÃ©.
	 */
	public static class ValidationError {
		/** Source de l'erreur (objet visitÃ© au moment oÃ¹ l'erreur est enregistrÃ©e) */
		public final EObject object;
		/** Message d'erreur */
		public final String error;
		
		/**
		 * Construit une erreur avec son objet associÃ© et son message.
		 * @param object objet de l'erreur au moment de l'enregistrement
		 * @param error message d'erreur
		 */
		public ValidationError(EObject object, String error) {
			this.object = object;
			this.error = error;
		}
		
		/**
		 * Transforme l'erreur en chaÃ®ne de caractÃ¨re.
		 * @return chaÃ®ne reprÃ©sentant l'erreur
		 */
		@Override
		public String toString() {
			return "Erreur dans " + Utils.guessName(this.object) + ": "
					+ this.error;
		}
	}
	
	/** Liste des erreurs enregistrÃ©es dans ce rÃ©sultat (prÃ©sumÃ©ment mise Ã  jour par un validateur) */
	private List<ValidationError> recordedErrors = new ArrayList<>();
	
	/**
	 * Construit un rÃ©sultat de validation.
	 */
	public ValidationResult() {}
	
	/**
	 * Enregistre une erreur, avec son objet source et son message d'erreur.
	 * @param object source de l'erreur (un objet du mÃ©ta-modÃ¨le)
	 * @param error message d'erreur associÃ©
	 */
	public void recordError(EObject object, String error) {
		this.recordedErrors.add(new ValidationError(object, error));
	}
	
	/**
	 * Enregistre une erreur si et seulement si le test est Ã©chouÃ© (le boolÃ©en est Ã  faux).
	 * Cette mÃ©thode permet d'Ã©crire les contraintes de maniÃ¨re un peu plus lisibles.
	 * @param test boolÃ©en qui dÃ©termine si l'erreur est Ã  enregitrer ou non
	 * @param object objet en cours de visite qui est la source de l'erreur (le cas Ã©chÃ©ant)
	 * @param error message d'erreur
	 */
	public void recordIfFailed(boolean test, EObject object, String error) {
		if (!test) {
			this.recordError(object, error);
		}
	}
	
	/**
	 * RÃ©cupÃ¨re la liste (non-modifiable) des erreurs enregistrÃ©es dans le rÃ©sultat.
	 * @return liste (non-modifiable) des erreurs enregistrÃ©es
	 */
	public List<ValidationError> getRecordedErrors() {
		return Collections.unmodifiableList(this.recordedErrors);
	}
	
	/**
	 * RÃ©cupÃ¨re la liste des erreurs enregistrÃ©es dans le rÃ©sultat et associÃ©es Ã  une
	 * classe donnÃ©e.
	 * @param filter classe spÃ©cifique dont on veut les erreurs
	 * @return erreurs associÃ©es Ã  la classe (potentiellement vide si pas d'erreur)
	 */
	public List<ValidationError> getRecordedErrorsFor(EClass filter) {
		return this.recordedErrors.stream().filter(v -> v.object.eClass().equals(filter)).toList();
	}
	
	/**
	 * RÃ©cupÃ¨re la liste des erreurs enregistrÃ©es dans le rÃ©sultat et associÃ©es Ã  une
	 * classe donnÃ©e, sous la forme d'un identifiant de classe (gÃ©nÃ©ralement dÃ©fini dans le 
	 * package associÃ© au mÃ©ta-modÃ¨le).
	 * @param classId identifiant de la classe spÃ©cifique dont on veut les erreurs
	 * @return erreurs associÃ©es Ã  la classe (potentiellement vide si pas d'erreur)
	 */
	public List<ValidationError> getRecordedErrorsFor(int classId) {
		return this.recordedErrors.stream().filter(v -> v.object.eClass().getClassifierID() == classId).toList();
	}
}
