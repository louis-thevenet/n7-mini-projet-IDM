/** */
package taskmaster;

/**
 *
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:
 *
 * <ul>
 *   <li>{@link taskmaster.Physical#getRequested <em>Requested</em>}
 *   <li>{@link taskmaster.Physical#getTarget <em>Target</em>}
 * </ul>
 *
 * @see taskmaster.TaskmasterPackage#getPhysical()
 * @model
 * @generated
 */
public interface Physical extends Requirement {
  /**
   * Returns the value of the '<em><b>Requested</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Requested</em>' attribute.
   * @see #setRequested(int)
   * @see taskmaster.TaskmasterPackage#getPhysical_Requested()
   * @model required="true"
   * @generated
   */
  int getRequested();

  /**
   * Sets the value of the '{@link taskmaster.Physical#getRequested <em>Requested</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Requested</em>' attribute.
   * @see #getRequested()
   * @generated
   */
  void setRequested(int value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Supply)
   * @see taskmaster.TaskmasterPackage#getPhysical_Target()
   * @model
   * @generated
   */
  Supply getTarget();

  /**
   * Sets the value of the '{@link taskmaster.Physical#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Supply value);
} // Physical
