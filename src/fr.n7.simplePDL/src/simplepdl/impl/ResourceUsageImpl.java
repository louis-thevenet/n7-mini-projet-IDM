/** */
package simplepdl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import simplepdl.Resource;
import simplepdl.ResourceUsage;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link simplepdl.impl.ResourceUsageImpl#getNeed <em>Need</em>}
 *   <li>{@link simplepdl.impl.ResourceUsageImpl#getResource <em>Resource</em>}
 *   <li>{@link simplepdl.impl.ResourceUsageImpl#getName <em>Name</em>}
 *   <li>{@link simplepdl.impl.ResourceUsageImpl#getLinkToWorkDefinition <em>Link To Work
 *       Definition</em>}
 * </ul>
 *
 * @generated
 */
public class ResourceUsageImpl extends ProcessElementImpl implements ResourceUsage {
  /**
   * The default value of the '{@link #getNeed() <em>Need</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getNeed()
   * @generated
   * @ordered
   */
  protected static final int NEED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNeed() <em>Need</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getNeed()
   * @generated
   * @ordered
   */
  protected int need = NEED_EDEFAULT;

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
   * The cached value of the '{@link #getLinkToWorkDefinition() <em>Link To Work Definition</em>}'
   * reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getLinkToWorkDefinition()
   * @generated
   * @ordered
   */
  protected WorkDefinition linkToWorkDefinition;

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
    return SimplepdlPackage.Literals.RESOURCE_USAGE;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public int getNeed() {
    return need;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setNeed(int newNeed) {
    int oldNeed = need;
    need = newNeed;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, SimplepdlPackage.RESOURCE_USAGE__NEED, oldNeed, need));
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
                  SimplepdlPackage.RESOURCE_USAGE__RESOURCE,
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
              this,
              Notification.SET,
              SimplepdlPackage.RESOURCE_USAGE__RESOURCE,
              oldResource,
              resource));
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
              this, Notification.SET, SimplepdlPackage.RESOURCE_USAGE__NAME, oldName, name));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public WorkDefinition getLinkToWorkDefinition() {
    if (linkToWorkDefinition != null && linkToWorkDefinition.eIsProxy()) {
      InternalEObject oldLinkToWorkDefinition = (InternalEObject) linkToWorkDefinition;
      linkToWorkDefinition = (WorkDefinition) eResolveProxy(oldLinkToWorkDefinition);
      if (linkToWorkDefinition != oldLinkToWorkDefinition) {
        if (eNotificationRequired())
          eNotify(
              new ENotificationImpl(
                  this,
                  Notification.RESOLVE,
                  SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION,
                  oldLinkToWorkDefinition,
                  linkToWorkDefinition));
      }
    }
    return linkToWorkDefinition;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public WorkDefinition basicGetLinkToWorkDefinition() {
    return linkToWorkDefinition;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public NotificationChain basicSetLinkToWorkDefinition(
      WorkDefinition newLinkToWorkDefinition, NotificationChain msgs) {
    WorkDefinition oldLinkToWorkDefinition = linkToWorkDefinition;
    linkToWorkDefinition = newLinkToWorkDefinition;
    if (eNotificationRequired()) {
      ENotificationImpl notification =
          new ENotificationImpl(
              this,
              Notification.SET,
              SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION,
              oldLinkToWorkDefinition,
              newLinkToWorkDefinition);
      if (msgs == null) msgs = notification;
      else msgs.add(notification);
    }
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
  public void setLinkToWorkDefinition(WorkDefinition newLinkToWorkDefinition) {
    if (newLinkToWorkDefinition != linkToWorkDefinition) {
      NotificationChain msgs = null;
      if (linkToWorkDefinition != null)
        msgs =
            ((InternalEObject) linkToWorkDefinition)
                .eInverseRemove(
                    this,
                    SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED,
                    WorkDefinition.class,
                    msgs);
      if (newLinkToWorkDefinition != null)
        msgs =
            ((InternalEObject) newLinkToWorkDefinition)
                .eInverseAdd(
                    this,
                    SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED,
                    WorkDefinition.class,
                    msgs);
      msgs = basicSetLinkToWorkDefinition(newLinkToWorkDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this,
              Notification.SET,
              SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION,
              newLinkToWorkDefinition,
              newLinkToWorkDefinition));
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
      case SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION:
        if (linkToWorkDefinition != null)
          msgs =
              ((InternalEObject) linkToWorkDefinition)
                  .eInverseRemove(
                      this,
                      SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED,
                      WorkDefinition.class,
                      msgs);
        return basicSetLinkToWorkDefinition((WorkDefinition) otherEnd, msgs);
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
      case SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION:
        return basicSetLinkToWorkDefinition(null, msgs);
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
      case SimplepdlPackage.RESOURCE_USAGE__NEED:
        return getNeed();
      case SimplepdlPackage.RESOURCE_USAGE__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
      case SimplepdlPackage.RESOURCE_USAGE__NAME:
        return getName();
      case SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION:
        if (resolve) return getLinkToWorkDefinition();
        return basicGetLinkToWorkDefinition();
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
      case SimplepdlPackage.RESOURCE_USAGE__NEED:
        setNeed((Integer) newValue);
        return;
      case SimplepdlPackage.RESOURCE_USAGE__RESOURCE:
        setResource((Resource) newValue);
        return;
      case SimplepdlPackage.RESOURCE_USAGE__NAME:
        setName((String) newValue);
        return;
      case SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION:
        setLinkToWorkDefinition((WorkDefinition) newValue);
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
      case SimplepdlPackage.RESOURCE_USAGE__NEED:
        setNeed(NEED_EDEFAULT);
        return;
      case SimplepdlPackage.RESOURCE_USAGE__RESOURCE:
        setResource((Resource) null);
        return;
      case SimplepdlPackage.RESOURCE_USAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION:
        setLinkToWorkDefinition((WorkDefinition) null);
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
      case SimplepdlPackage.RESOURCE_USAGE__NEED:
        return need != NEED_EDEFAULT;
      case SimplepdlPackage.RESOURCE_USAGE__RESOURCE:
        return resource != null;
      case SimplepdlPackage.RESOURCE_USAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION:
        return linkToWorkDefinition != null;
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
    result.append(" (need: ");
    result.append(need);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }
} // ResourceUsageImpl
