/** */
package simplepdl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import simplepdl.ResourceUsage;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getLinksToPredecessors <em>Links To
 *       Predecessors</em>}
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getLinksToSuccessors <em>Links To Successors</em>}
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getName <em>Name</em>}
 *   <li>{@link simplepdl.impl.WorkDefinitionImpl#getResourceUsed <em>Resource Used</em>}
 * </ul>
 *
 * @generated
 */
public class WorkDefinitionImpl extends ProcessElementImpl implements WorkDefinition {
  /**
   * The cached value of the '{@link #getLinksToPredecessors() <em>Links To Predecessors</em>}'
   * reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getLinksToPredecessors()
   * @generated
   * @ordered
   */
  protected EList<WorkSequence> linksToPredecessors;

  /**
   * The cached value of the '{@link #getLinksToSuccessors() <em>Links To Successors</em>}'
   * reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getLinksToSuccessors()
   * @generated
   * @ordered
   */
  protected EList<WorkSequence> linksToSuccessors;

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
   * The cached value of the '{@link #getResourceUsed() <em>Resource Used</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getResourceUsed()
   * @generated
   * @ordered
   */
  protected EList<ResourceUsage> resourceUsed;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected WorkDefinitionImpl() {
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
    return SimplepdlPackage.Literals.WORK_DEFINITION;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<WorkSequence> getLinksToPredecessors() {
    if (linksToPredecessors == null) {
      linksToPredecessors =
          new EObjectWithInverseResolvingEList<WorkSequence>(
              WorkSequence.class,
              this,
              SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS,
              SimplepdlPackage.WORK_SEQUENCE__SUCCESSOR);
    }
    return linksToPredecessors;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<WorkSequence> getLinksToSuccessors() {
    if (linksToSuccessors == null) {
      linksToSuccessors =
          new EObjectWithInverseResolvingEList<WorkSequence>(
              WorkSequence.class,
              this,
              SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS,
              SimplepdlPackage.WORK_SEQUENCE__PREDECESSOR);
    }
    return linksToSuccessors;
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
              this, Notification.SET, SimplepdlPackage.WORK_DEFINITION__NAME, oldName, name));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<ResourceUsage> getResourceUsed() {
    if (resourceUsed == null) {
      resourceUsed =
          new EObjectWithInverseResolvingEList<ResourceUsage>(
              ResourceUsage.class,
              this,
              SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED,
              SimplepdlPackage.RESOURCE_USAGE__LINK_TO_WORK_DEFINITION);
    }
    return resourceUsed;
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
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToPredecessors())
            .basicAdd(otherEnd, msgs);
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getLinksToSuccessors())
            .basicAdd(otherEnd, msgs);
      case SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getResourceUsed())
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
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        return ((InternalEList<?>) getLinksToPredecessors()).basicRemove(otherEnd, msgs);
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        return ((InternalEList<?>) getLinksToSuccessors()).basicRemove(otherEnd, msgs);
      case SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED:
        return ((InternalEList<?>) getResourceUsed()).basicRemove(otherEnd, msgs);
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
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        return getLinksToPredecessors();
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        return getLinksToSuccessors();
      case SimplepdlPackage.WORK_DEFINITION__NAME:
        return getName();
      case SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED:
        return getResourceUsed();
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
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        getLinksToPredecessors().clear();
        getLinksToPredecessors().addAll((Collection<? extends WorkSequence>) newValue);
        return;
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        getLinksToSuccessors().clear();
        getLinksToSuccessors().addAll((Collection<? extends WorkSequence>) newValue);
        return;
      case SimplepdlPackage.WORK_DEFINITION__NAME:
        setName((String) newValue);
        return;
      case SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED:
        getResourceUsed().clear();
        getResourceUsed().addAll((Collection<? extends ResourceUsage>) newValue);
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
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        getLinksToPredecessors().clear();
        return;
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        getLinksToSuccessors().clear();
        return;
      case SimplepdlPackage.WORK_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED:
        getResourceUsed().clear();
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
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_PREDECESSORS:
        return linksToPredecessors != null && !linksToPredecessors.isEmpty();
      case SimplepdlPackage.WORK_DEFINITION__LINKS_TO_SUCCESSORS:
        return linksToSuccessors != null && !linksToSuccessors.isEmpty();
      case SimplepdlPackage.WORK_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SimplepdlPackage.WORK_DEFINITION__RESOURCE_USED:
        return resourceUsed != null && !resourceUsed.isEmpty();
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
} // WorkDefinitionImpl
