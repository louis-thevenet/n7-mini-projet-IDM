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
import org.eclipse.emf.ecore.util.InternalEList;
import taskmaster.Event;
import taskmaster.EventBundle;
import taskmaster.Supply;
import taskmaster.TaskmasterPackage;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link taskmaster.impl.EventBundleImpl#getName <em>Name</em>}
 *   <li>{@link taskmaster.impl.EventBundleImpl#getSupplies <em>Supplies</em>}
 *   <li>{@link taskmaster.impl.EventBundleImpl#getEvents <em>Events</em>}
 * </ul>
 *
 * @generated
 */
public class EventBundleImpl extends MinimalEObjectImpl.Container implements EventBundle {
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
   * The cached value of the '{@link #getSupplies() <em>Supplies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getSupplies()
   * @generated
   * @ordered
   */
  protected EList<Supply> supplies;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected EventBundleImpl() {
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
    return TaskmasterPackage.Literals.EVENT_BUNDLE;
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
              this, Notification.SET, TaskmasterPackage.EVENT_BUNDLE__NAME, oldName, name));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<Supply> getSupplies() {
    if (supplies == null) {
      supplies =
          new EObjectContainmentWithInverseEList<Supply>(
              Supply.class,
              this,
              TaskmasterPackage.EVENT_BUNDLE__SUPPLIES,
              TaskmasterPackage.SUPPLY__BUNDLE);
    }
    return supplies;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<Event> getEvents() {
    if (events == null) {
      events =
          new EObjectContainmentWithInverseEList<Event>(
              Event.class,
              this,
              TaskmasterPackage.EVENT_BUNDLE__EVENTS,
              TaskmasterPackage.EVENT__BUNDLE);
    }
    return events;
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
      case TaskmasterPackage.EVENT_BUNDLE__SUPPLIES:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getSupplies())
            .basicAdd(otherEnd, msgs);
      case TaskmasterPackage.EVENT_BUNDLE__EVENTS:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getEvents())
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
      case TaskmasterPackage.EVENT_BUNDLE__SUPPLIES:
        return ((InternalEList<?>) getSupplies()).basicRemove(otherEnd, msgs);
      case TaskmasterPackage.EVENT_BUNDLE__EVENTS:
        return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
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
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TaskmasterPackage.EVENT_BUNDLE__NAME:
        return getName();
      case TaskmasterPackage.EVENT_BUNDLE__SUPPLIES:
        return getSupplies();
      case TaskmasterPackage.EVENT_BUNDLE__EVENTS:
        return getEvents();
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
      case TaskmasterPackage.EVENT_BUNDLE__NAME:
        setName((String) newValue);
        return;
      case TaskmasterPackage.EVENT_BUNDLE__SUPPLIES:
        getSupplies().clear();
        getSupplies().addAll((Collection<? extends Supply>) newValue);
        return;
      case TaskmasterPackage.EVENT_BUNDLE__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>) newValue);
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
      case TaskmasterPackage.EVENT_BUNDLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TaskmasterPackage.EVENT_BUNDLE__SUPPLIES:
        getSupplies().clear();
        return;
      case TaskmasterPackage.EVENT_BUNDLE__EVENTS:
        getEvents().clear();
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
      case TaskmasterPackage.EVENT_BUNDLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TaskmasterPackage.EVENT_BUNDLE__SUPPLIES:
        return supplies != null && !supplies.isEmpty();
      case TaskmasterPackage.EVENT_BUNDLE__EVENTS:
        return events != null && !events.isEmpty();
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
} // EventBundleImpl
