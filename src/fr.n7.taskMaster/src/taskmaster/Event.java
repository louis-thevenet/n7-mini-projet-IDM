/**
 */
package taskmaster;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmaster.Event#getName <em>Name</em>}</li>
 *   <li>{@link taskmaster.Event#getBundle <em>Bundle</em>}</li>
 *   <li>{@link taskmaster.Event#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see taskmaster.TaskmasterPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see taskmaster.TaskmasterPackage#getEvent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taskmaster.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link taskmaster.EventBundle#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' container reference.
	 * @see #setBundle(EventBundle)
	 * @see taskmaster.TaskmasterPackage#getEvent_Bundle()
	 * @see taskmaster.EventBundle#getEvents
	 * @model opposite="events" required="true" transient="false"
	 * @generated
	 */
	EventBundle getBundle();

	/**
	 * Sets the value of the '{@link taskmaster.Event#getBundle <em>Bundle</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' container reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(EventBundle value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link taskmaster.Requirement}.
	 * It is bidirectional and its opposite is '{@link taskmaster.Requirement#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see taskmaster.TaskmasterPackage#getEvent_Requirements()
	 * @see taskmaster.Requirement#getEvent
	 * @model opposite="event" containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // Event
