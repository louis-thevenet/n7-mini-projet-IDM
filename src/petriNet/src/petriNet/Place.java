/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link petriNet.Place#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petriNet.Place#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NetElement {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' attribute.
	 * @see #setTokens(int)
	 * @see petriNet.PetriNetPackage#getPlace_Tokens()
	 * @model
	 * @generated
	 */
	int getTokens();

	/**
	 * Sets the value of the '{@link petriNet.Place#getTokens <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tokens</em>' attribute.
	 * @see #getTokens()
	 * @generated
	 */
	void setTokens(int value);

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getLinkToPlace <em>Link To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' reference list.
	 * @see petriNet.PetriNetPackage#getPlace_Arcs()
	 * @see petriNet.Arc#getLinkToPlace
	 * @model opposite="linkToPlace"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Place
