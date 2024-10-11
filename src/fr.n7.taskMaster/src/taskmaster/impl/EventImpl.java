/** */
package taskmaster.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import taskmaster.Event;
import taskmaster.EventBundle;
import taskmaster.Requirement;
import taskmaster.TaskmasterPackage;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link taskmaster.impl.EventImpl#getName <em>Name</em>}
 *   <li>{@link taskmaster.impl.EventImpl#getBundle <em>Bundle</em>}
 *   <li>{@link taskmaster.impl.EventImpl#getRequirements <em>Requirements</em>}
 * </ul>
 *
 * @generated
 */
public class EventImpl extends MinimalEObjectImpl.Container implements Event {
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment
   * reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected EList<Requirement> requirements;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected EventImpl() {
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
    return TaskmasterPackage.Literals.EVENT;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, TaskmasterPackage.EVENT__NAME, oldName, name));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EventBundle getBundle() {
    if (eContainerFeatureID() != TaskmasterPackage.EVENT__BUNDLE) return null;
    return (EventBundle) eInternalContainer();
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public NotificationChain basicSetBundle(EventBundle newBundle, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject) newBundle, TaskmasterPackage.EVENT__BUNDLE, msgs);
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
  public void setBundle(EventBundle newBundle) {
    if (newBundle != eInternalContainer()
        || (eContainerFeatureID() != TaskmasterPackage.EVENT__BUNDLE && newBundle != null)) {
      if (EcoreUtil.isAncestor(this, newBundle))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newBundle != null)
        msgs =
            ((InternalEObject) newBundle)
                .eInverseAdd(this, TaskmasterPackage.EVENT_BUNDLE__EVENTS, EventBundle.class, msgs);
      msgs = basicSetBundle(newBundle, msgs);
      if (msgs != null) msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, TaskmasterPackage.EVENT__BUNDLE, newBundle, newBundle));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<Requirement> getRequirements() {
    if (requirements == null) {
      requirements =
          new EObjectContainmentWithInverseEList<Requirement>(
              Requirement.class,
              this,
              TaskmasterPackage.EVENT__REQUIREMENTS,
              TaskmasterPackage.REQUIREMENT__EVENT);
    }
    return requirements;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(
      InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TaskmasterPackage.EVENT__BUNDLE:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return basicSetBundle((EventBundle) otherEnd, msgs);
      case TaskmasterPackage.EVENT__REQUIREMENTS:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequirements())
            .basicAdd(otherEnd, msgs);
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
      case TaskmasterPackage.EVENT__BUNDLE:
        return basicSetBundle(null, msgs);
      case TaskmasterPackage.EVENT__REQUIREMENTS:
        return ((InternalEList<?>) getRequirements()).basicRemove(otherEnd, msgs);
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
      case TaskmasterPackage.EVENT__BUNDLE:
        return eInternalContainer()
            .eInverseRemove(this, TaskmasterPackage.EVENT_BUNDLE__EVENTS, EventBundle.class, msgs);
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
      case TaskmasterPackage.EVENT__NAME:
        return getName();
      case TaskmasterPackage.EVENT__BUNDLE:
        return getBundle();
      case TaskmasterPackage.EVENT__REQUIREMENTS:
        return getRequirements();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case TaskmasterPackage.EVENT__NAME:
        setName((String) newValue);
        return;
      case TaskmasterPackage.EVENT__BUNDLE:
        setBundle((EventBundle) newValue);
        return;
      case TaskmasterPackage.EVENT__REQUIREMENTS:
        getRequirements().clear();
        getRequirements().addAll((Collection<? extends Requirement>) newValue);
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
      case TaskmasterPackage.EVENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TaskmasterPackage.EVENT__BUNDLE:
        setBundle((EventBundle) null);
        return;
      case TaskmasterPackage.EVENT__REQUIREMENTS:
        getRequirements().clear();
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
      case TaskmasterPackage.EVENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TaskmasterPackage.EVENT__BUNDLE:
        return getBundle() != null;
      case TaskmasterPackage.EVENT__REQUIREMENTS:
        return requirements != null && !requirements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }
} // EventImpl
