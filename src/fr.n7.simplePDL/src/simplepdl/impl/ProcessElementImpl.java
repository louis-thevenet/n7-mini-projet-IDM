/** */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import simplepdl.ProcessElement;
import simplepdl.SimplepdlPackage;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link simplepdl.impl.ProcessElementImpl#getProcess <em>Process</em>}
 * </ul>
 *
 * @generated
 */
public abstract class ProcessElementImpl extends MinimalEObjectImpl.Container
    implements ProcessElement {
  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected simplepdl.Process process;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected ProcessElementImpl() {
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
    return SimplepdlPackage.Literals.PROCESS_ELEMENT;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public simplepdl.Process getProcess() {
    if (process != null && process.eIsProxy()) {
      InternalEObject oldProcess = (InternalEObject) process;
      process = (simplepdl.Process) eResolveProxy(oldProcess);
      if (process != oldProcess) {
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(
                  this,
                  Notification.RESOLVE,
                  SimplepdlPackage.PROCESS_ELEMENT__PROCESS,
                  oldProcess,
                  process));
      }
    }
    return process;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public simplepdl.Process basicGetProcess() {
    return process;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setProcess(simplepdl.Process newProcess) {
    simplepdl.Process oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this,
              Notification.SET,
              SimplepdlPackage.PROCESS_ELEMENT__PROCESS,
              oldProcess,
              process));
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
      case SimplepdlPackage.PROCESS_ELEMENT__PROCESS:
        if (resolve) return getProcess();
        return basicGetProcess();
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
      case SimplepdlPackage.PROCESS_ELEMENT__PROCESS:
        setProcess((simplepdl.Process) newValue);
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
      case SimplepdlPackage.PROCESS_ELEMENT__PROCESS:
        setProcess((simplepdl.Process) null);
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
      case SimplepdlPackage.PROCESS_ELEMENT__PROCESS:
        return process != null;
    }
    return super.eIsSet(featureID);
  }
} // ProcessElementImpl
