/** generated by Xtext 2.32.0 */
package fr.n7.pDL1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 *
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:
 *
 * <ul>
 *   <li>{@link fr.n7.pDL1.Process#getName <em>Name</em>}
 *   <li>{@link fr.n7.pDL1.Process#getProcessElements <em>Process Elements</em>}
 * </ul>
 *
 * @see fr.n7.pDL1.PDL1Package#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.pDL1.PDL1Package#getProcess_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.pDL1.Process#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Process Elements</b></em>' containment reference list. The
   * list contents are of type {@link fr.n7.pDL1.ProcessElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Process Elements</em>' containment reference list.
   * @see fr.n7.pDL1.PDL1Package#getProcess_ProcessElements()
   * @model containment="true"
   * @generated
   */
  EList<ProcessElement> getProcessElements();
} // Process
