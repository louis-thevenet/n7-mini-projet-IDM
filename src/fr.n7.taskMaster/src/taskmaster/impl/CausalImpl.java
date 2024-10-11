/** */
package taskmaster.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import taskmaster.Causal;
import taskmaster.Event;
import taskmaster.TaskmasterPackage;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Causal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link taskmaster.impl.CausalImpl#getTarget <em>Target</em>}
 * </ul>
 *
 * @generated
 */
public class CausalImpl extends RequirementImpl implements Causal {
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected Event target;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected CausalImpl() {
    super();
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return TaskmasterPackage.Literals.CAUSAL;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Event getTarget() {
    if (target != null && target.eIsProxy()) {
      InternalEObject oldTarget = (InternalEObject) target;
      target = (Event) eResolveProxy(oldTarget);
      if (target != oldTarget) {
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(
                  this, Notification.RESOLVE, TaskmasterPackage.CAUSAL__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public Event basicGetTarget() {
    return target;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setTarget(Event newTarget) {
    Event oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, TaskmasterPackage.CAUSAL__TARGET, oldTarget, target));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TaskmasterPackage.CAUSAL__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case TaskmasterPackage.CAUSAL__TARGET:
        setTarget((Event) newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case TaskmasterPackage.CAUSAL__TARGET:
        setTarget((Event) null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case TaskmasterPackage.CAUSAL__TARGET:
        return target != null;
    }
    return super.eIsSet(featureID);
  }
} // CausalImpl
