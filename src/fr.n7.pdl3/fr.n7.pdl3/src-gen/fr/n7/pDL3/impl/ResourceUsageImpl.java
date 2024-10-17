/** generated by Xtext 2.32.0 */
package fr.n7.pDL3.impl;

import fr.n7.pDL3.PDL3Package;
import fr.n7.pDL3.Resource;
import fr.n7.pDL3.ResourceUsage;
import fr.n7.pDL3.WorkDefinition;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link fr.n7.pDL3.impl.ResourceUsageImpl#getWorkDefinition <em>Work Definition</em>}
 *   <li>{@link fr.n7.pDL3.impl.ResourceUsageImpl#getResource <em>Resource</em>}
 *   <li>{@link fr.n7.pDL3.impl.ResourceUsageImpl#getNeeded <em>Needed</em>}
 * </ul>
 *
 * @generated
 */
public class ResourceUsageImpl extends ResourceUsagesImpl implements ResourceUsage {
  /**
   * The cached value of the '{@link #getWorkDefinition() <em>Work Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getWorkDefinition()
   * @generated
   * @ordered
   */
  protected WorkDefinition workDefinition;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected Resource resource;

  /**
   * The default value of the '{@link #getNeeded() <em>Needed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getNeeded()
   * @generated
   * @ordered
   */
  protected static final int NEEDED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNeeded() <em>Needed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getNeeded()
   * @generated
   * @ordered
   */
  protected int needed = NEEDED_EDEFAULT;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected ResourceUsageImpl() {
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
    return PDL3Package.Literals.RESOURCE_USAGE;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public WorkDefinition getWorkDefinition() {
    if (workDefinition != null && workDefinition.eIsProxy()) {
      InternalEObject oldWorkDefinition = (InternalEObject) workDefinition;
      workDefinition = (WorkDefinition) eResolveProxy(oldWorkDefinition);
      if (workDefinition != oldWorkDefinition) {
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(
                  this,
                  Notification.RESOLVE,
                  PDL3Package.RESOURCE_USAGE__WORK_DEFINITION,
                  oldWorkDefinition,
                  workDefinition));
      }
    }
    return workDefinition;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public WorkDefinition basicGetWorkDefinition() {
    return workDefinition;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setWorkDefinition(WorkDefinition newWorkDefinition) {
    WorkDefinition oldWorkDefinition = workDefinition;
    workDefinition = newWorkDefinition;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this,
              Notification.SET,
              PDL3Package.RESOURCE_USAGE__WORK_DEFINITION,
              oldWorkDefinition,
              workDefinition));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Resource getResource() {
    if (resource != null && resource.eIsProxy()) {
      InternalEObject oldResource = (InternalEObject) resource;
      resource = (Resource) eResolveProxy(oldResource);
      if (resource != oldResource) {
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(
                  this,
                  Notification.RESOLVE,
                  PDL3Package.RESOURCE_USAGE__RESOURCE,
                  oldResource,
                  resource));
      }
    }
    return resource;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public Resource basicGetResource() {
    return resource;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setResource(Resource newResource) {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, PDL3Package.RESOURCE_USAGE__RESOURCE, oldResource, resource));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public int getNeeded() {
    return needed;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setNeeded(int newNeeded) {
    int oldNeeded = needed;
    needed = newNeeded;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, PDL3Package.RESOURCE_USAGE__NEEDED, oldNeeded, needed));
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
      case PDL3Package.RESOURCE_USAGE__WORK_DEFINITION:
        if (resolve) return getWorkDefinition();
        return basicGetWorkDefinition();
      case PDL3Package.RESOURCE_USAGE__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
      case PDL3Package.RESOURCE_USAGE__NEEDED:
        return getNeeded();
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
      case PDL3Package.RESOURCE_USAGE__WORK_DEFINITION:
        setWorkDefinition((WorkDefinition) newValue);
        return;
      case PDL3Package.RESOURCE_USAGE__RESOURCE:
        setResource((Resource) newValue);
        return;
      case PDL3Package.RESOURCE_USAGE__NEEDED:
        setNeeded((Integer) newValue);
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
      case PDL3Package.RESOURCE_USAGE__WORK_DEFINITION:
        setWorkDefinition((WorkDefinition) null);
        return;
      case PDL3Package.RESOURCE_USAGE__RESOURCE:
        setResource((Resource) null);
        return;
      case PDL3Package.RESOURCE_USAGE__NEEDED:
        setNeeded(NEEDED_EDEFAULT);
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
      case PDL3Package.RESOURCE_USAGE__WORK_DEFINITION:
        return workDefinition != null;
      case PDL3Package.RESOURCE_USAGE__RESOURCE:
        return resource != null;
      case PDL3Package.RESOURCE_USAGE__NEEDED:
        return needed != NEEDED_EDEFAULT;
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
    result.append(" (needed: ");
    result.append(needed);
    result.append(')');
    return result.toString();
  }
} // ResourceUsageImpl
