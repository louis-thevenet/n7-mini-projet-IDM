/** */
package taskmaster.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import taskmaster.Event;
import taskmaster.Requirement;
import taskmaster.TaskmasterPackage;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link taskmaster.impl.RequirementImpl#getEvent <em>Event</em>}
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected RequirementImpl() {
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
    return TaskmasterPackage.Literals.REQUIREMENT;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Event getEvent() {
    if (eContainerFeatureID() != TaskmasterPackage.REQUIREMENT__EVENT) return null;
    return (Event) eInternalContainer();
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
    msgs =
        eBasicSetContainer((InternalEObject) newEvent, TaskmasterPackage.REQUIREMENT__EVENT, msgs);
    return msgs;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setEvent(Event newEvent) {
    if (newEvent != eInternalContainer()
        || (eContainerFeatureID() != TaskmasterPackage.REQUIREMENT__EVENT && newEvent != null)) {
      if (EcoreUtil.isAncestor(this, newEvent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newEvent != null)
        msgs =
            ((InternalEObject) newEvent)
                .eInverseAdd(this, TaskmasterPackage.EVENT__REQUIREMENTS, Event.class, msgs);
      msgs = basicSetEvent(newEvent, msgs);
      if (msgs != null) msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, TaskmasterPackage.REQUIREMENT__EVENT, newEvent, newEvent));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(
      InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TaskmasterPackage.REQUIREMENT__EVENT:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return basicSetEvent((Event) otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(
      InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TaskmasterPackage.REQUIREMENT__EVENT:
        return basicSetEvent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case TaskmasterPackage.REQUIREMENT__EVENT:
        return eInternalContainer()
            .eInverseRemove(this, TaskmasterPackage.EVENT__REQUIREMENTS, Event.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case TaskmasterPackage.REQUIREMENT__EVENT:
        return getEvent();
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
      case TaskmasterPackage.REQUIREMENT__EVENT:
        setEvent((Event) newValue);
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
      case TaskmasterPackage.REQUIREMENT__EVENT:
        setEvent((Event) null);
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
      case TaskmasterPackage.REQUIREMENT__EVENT:
        return getEvent() != null;
    }
    return super.eIsSet(featureID);
  }
} // RequirementImpl
