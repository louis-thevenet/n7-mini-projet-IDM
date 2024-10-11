/**
 */
package taskmaster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmaster.Requirement#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see taskmaster.TaskmasterPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link taskmaster.Event#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' container reference.
	 * @see #setEvent(Event)
	 * @see taskmaster.TaskmasterPackage#getRequirement_Event()
	 * @see taskmaster.Event#getRequirements
	 * @model opposite="requirements" required="true" transient="false"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link taskmaster.Requirement#getEvent <em>Event</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' container reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // Requirement
