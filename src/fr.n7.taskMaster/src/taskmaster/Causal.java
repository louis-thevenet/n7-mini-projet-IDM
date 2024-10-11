/** */
package taskmaster;

/**
 *
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Causal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are supported:
 *
 * <ul>
 *   <li>{@link taskmaster.Causal#getTarget <em>Target</em>}
 * </ul>
 *
 * @see taskmaster.TaskmasterPackage#getCausal()
 * @model
 * @generated
 */
public interface Causal extends Requirement {
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Event)
   * @see taskmaster.TaskmasterPackage#getCausal_Target()
   * @model required="true"
   * @generated
   */
  Event getTarget();

  /**
   * Sets the value of the '{@link taskmaster.Causal#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Event value);
} // Causal
