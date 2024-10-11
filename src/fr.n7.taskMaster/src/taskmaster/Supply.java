/**
 */
package taskmaster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link taskmaster.Supply#isConsumable <em>Consumable</em>}</li>
 *   <li>{@link taskmaster.Supply#getName <em>Name</em>}</li>
 *   <li>{@link taskmaster.Supply#getAvailable <em>Available</em>}</li>
 *   <li>{@link taskmaster.Supply#getBundle <em>Bundle</em>}</li>
 * </ul>
 *
 * @see taskmaster.TaskmasterPackage#getSupply()
 * @model
 * @generated
 */
public interface Supply extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumable</em>' attribute.
	 * @see #setConsumable(boolean)
	 * @see taskmaster.TaskmasterPackage#getSupply_Consumable()
	 * @model required="true"
	 * @generated
	 */
	boolean isConsumable();

	/**
	 * Sets the value of the '{@link taskmaster.Supply#isConsumable <em>Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumable</em>' attribute.
	 * @see #isConsumable()
	 * @generated
	 */
	void setConsumable(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see taskmaster.TaskmasterPackage#getSupply_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link taskmaster.Supply#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(int)
	 * @see taskmaster.TaskmasterPackage#getSupply_Available()
	 * @model
	 * @generated
	 */
	int getAvailable();

	/**
	 * Sets the value of the '{@link taskmaster.Supply#getAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #getAvailable()
	 * @generated
	 */
	void setAvailable(int value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link taskmaster.EventBundle#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundle</em>' container reference.
	 * @see #setBundle(EventBundle)
	 * @see taskmaster.TaskmasterPackage#getSupply_Bundle()
	 * @see taskmaster.EventBundle#getSupplies
	 * @model opposite="supplies" required="true" transient="false"
	 * @generated
	 */
	EventBundle getBundle();

	/**
	 * Sets the value of the '{@link taskmaster.Supply#getBundle <em>Bundle</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' container reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(EventBundle value);

} // Supply
