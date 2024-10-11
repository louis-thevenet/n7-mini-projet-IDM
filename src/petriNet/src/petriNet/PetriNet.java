/** */
package petriNet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 *
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:
 *
 * <ul>
 *   <li>{@link petriNet.PetriNet#getNetElements <em>Net Elements</em>}
 *   <li>{@link petriNet.PetriNet#getName <em>Name</em>}
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
  /**
   * Returns the value of the '<em><b>Net Elements</b></em>' containment reference list. The list
   * contents are of type {@link petriNet.NetElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Net Elements</em>' containment reference list.
   * @see petriNet.PetriNetPackage#getPetriNet_NetElements()
   * @model containment="true"
   * @generated
   */
  EList<NetElement> getNetElements();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see petriNet.PetriNetPackage#getPetriNet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link petriNet.PetriNet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);
} // PetriNet
