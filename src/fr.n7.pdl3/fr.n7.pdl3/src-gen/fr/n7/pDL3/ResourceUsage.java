/** generated by Xtext 2.32.0 */
package fr.n7.pDL3;

/**
 *
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:
 *
 * <ul>
 *   <li>{@link fr.n7.pDL3.ResourceUsage#getWorkDefinition <em>Work Definition</em>}
 *   <li>{@link fr.n7.pDL3.ResourceUsage#getResource <em>Resource</em>}
 *   <li>{@link fr.n7.pDL3.ResourceUsage#getNeeded <em>Needed</em>}
 * </ul>
 *
 * @see fr.n7.pDL3.PDL3Package#getResourceUsage()
 * @model
 * @generated
 */
public interface ResourceUsage extends ResourceUsages {
  /**
   * Returns the value of the '<em><b>Work Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Work Definition</em>' reference.
   * @see #setWorkDefinition(WorkDefinition)
   * @see fr.n7.pDL3.PDL3Package#getResourceUsage_WorkDefinition()
   * @model
   * @generated
   */
  WorkDefinition getWorkDefinition();

  /**
   * Sets the value of the '{@link fr.n7.pDL3.ResourceUsage#getWorkDefinition <em>Work
   * Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Work Definition</em>' reference.
   * @see #getWorkDefinition()
   * @generated
   */
  void setWorkDefinition(WorkDefinition value);

  /**
   * Returns the value of the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Resource</em>' reference.
   * @see #setResource(Resource)
   * @see fr.n7.pDL3.PDL3Package#getResourceUsage_Resource()
   * @model
   * @generated
   */
  Resource getResource();

  /**
   * Sets the value of the '{@link fr.n7.pDL3.ResourceUsage#getResource <em>Resource</em>}'
   * reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Resource</em>' reference.
   * @see #getResource()
   * @generated
   */
  void setResource(Resource value);

  /**
   * Returns the value of the '<em><b>Needed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Needed</em>' attribute.
   * @see #setNeeded(int)
   * @see fr.n7.pDL3.PDL3Package#getResourceUsage_Needed()
   * @model
   * @generated
   */
  int getNeeded();

  /**
   * Sets the value of the '{@link fr.n7.pDL3.ResourceUsage#getNeeded <em>Needed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Needed</em>' attribute.
   * @see #getNeeded()
   * @generated
   */
  void setNeeded(int value);
} // ResourceUsage
