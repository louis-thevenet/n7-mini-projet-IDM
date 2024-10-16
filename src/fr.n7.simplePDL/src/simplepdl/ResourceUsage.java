/** */
package simplepdl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.ResourceUsage#getNeed <em>Need</em>}</li>
 *   <li>{@link simplepdl.ResourceUsage#getResource <em>Resource</em>}</li>
 *   <li>{@link simplepdl.ResourceUsage#getName <em>Name</em>}</li>
 *   <li>{@link simplepdl.ResourceUsage#getLinkToWorkDefinition <em>Link To Work Definition</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getResourceUsage()
 * @model
 * @generated
 */
public interface ResourceUsage extends ProcessElement {
  /**
	 * Returns the value of the '<em><b>Need</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Need</em>' attribute.
	 * @see #setNeed(int)
	 * @see simplepdl.SimplepdlPackage#getResourceUsage_Need()
	 * @model
	 * @generated
	 */
  int getNeed();

  /**
	 * Sets the value of the '{@link simplepdl.ResourceUsage#getNeed <em>Need</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need</em>' attribute.
	 * @see #getNeed()
	 * @generated
	 */
  void setNeed(int value);

  /**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see simplepdl.SimplepdlPackage#getResourceUsage_Resource()
	 * @model
	 * @generated
	 */
  Resource getResource();

  /**
	 * Sets the value of the '{@link simplepdl.ResourceUsage#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
  void setResource(Resource value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see simplepdl.SimplepdlPackage#getResourceUsage_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link simplepdl.ResourceUsage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Link To Work Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getResourceUsed <em>Resource Used</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Work Definition</em>' reference.
	 * @see #setLinkToWorkDefinition(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getResourceUsage_LinkToWorkDefinition()
	 * @see simplepdl.WorkDefinition#getResourceUsed
	 * @model opposite="resourceUsed"
	 * @generated
	 */
  WorkDefinition getLinkToWorkDefinition();

  /**
	 * Sets the value of the '{@link simplepdl.ResourceUsage#getLinkToWorkDefinition <em>Link To Work Definition</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Work Definition</em>' reference.
	 * @see #getLinkToWorkDefinition()
	 * @generated
	 */
  void setLinkToWorkDefinition(WorkDefinition value);
} // ResourceUsage
