/**
 */
package taskmaster;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmaster.EventBundle#getName <em>Name</em>}</li>
 *   <li>{@link taskmaster.EventBundle#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link taskmaster.EventBundle#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see taskmaster.TaskmasterPackage#getEventBundle()
 * @model
 * @generated
 */
public interface EventBundle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see taskmaster.TaskmasterPackage#getEventBundle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taskmaster.EventBundle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Supplies</b></em>' containment reference list.
	 * The list contents are of type {@link taskmaster.Supply}.
	 * It is bidirectional and its opposite is '{@link taskmaster.Supply#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies</em>' containment reference list.
	 * @see taskmaster.TaskmasterPackage#getEventBundle_Supplies()
	 * @see taskmaster.Supply#getBundle
	 * @model opposite="bundle" containment="true"
	 * @generated
	 */
	EList<Supply> getSupplies();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link taskmaster.Event}.
	 * It is bidirectional and its opposite is '{@link taskmaster.Event#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see taskmaster.TaskmasterPackage#getEventBundle_Events()
	 * @see taskmaster.Event#getBundle
	 * @model opposite="bundle" containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // EventBundle
