/** */
package petriNet.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import petriNet.Arc;
import petriNet.PetriNetPackage;
import petriNet.Place;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link petriNet.impl.PlaceImpl#getTokens <em>Tokens</em>}
 *   <li>{@link petriNet.impl.PlaceImpl#getArcs <em>Arcs</em>}
 *   <li>{@link petriNet.impl.PlaceImpl#getName <em>Name</em>}
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends NetElementImpl implements Place {
  /**
   * The default value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getTokens()
   * @generated
   * @ordered
   */
  protected static final int TOKENS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getTokens()
   * @generated
   * @ordered
   */
  protected int tokens = TOKENS_EDEFAULT;

  /**
   * The cached value of the '{@link #getArcs() <em>Arcs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getArcs()
   * @generated
   * @ordered
   */
  protected EList<Arc> arcs;

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
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected PlaceImpl() {
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
    return PetriNetPackage.Literals.PLACE;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public int getTokens() {
    return tokens;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void setTokens(int newTokens) {
    int oldTokens = tokens;
    tokens = newTokens;
    if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this, Notification.SET, PetriNetPackage.PLACE__TOKENS, oldTokens, tokens));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EList<Arc> getArcs() {
    if (arcs == null) {
      arcs =
          new EObjectWithInverseResolvingEList<Arc>(
              Arc.class, this, PetriNetPackage.PLACE__ARCS, PetriNetPackage.ARC__LINK_TO_PLACE);
    }
    return arcs;
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
              this, Notification.SET, PetriNetPackage.PLACE__NAME, oldName, name));
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
      case PetriNetPackage.PLACE__ARCS:
        return ((InternalEList<InternalEObject>) (InternalEList<?>) getArcs())
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
      case PetriNetPackage.PLACE__ARCS:
        return ((InternalEList<?>) getArcs()).basicRemove(otherEnd, msgs);
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
      case PetriNetPackage.PLACE__TOKENS:
        return getTokens();
      case PetriNetPackage.PLACE__ARCS:
        return getArcs();
      case PetriNetPackage.PLACE__NAME:
        return getName();
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
      case PetriNetPackage.PLACE__TOKENS:
        setTokens((Integer) newValue);
        return;
      case PetriNetPackage.PLACE__ARCS:
        getArcs().clear();
        getArcs().addAll((Collection<? extends Arc>) newValue);
        return;
      case PetriNetPackage.PLACE__NAME:
        setName((String) newValue);
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
      case PetriNetPackage.PLACE__TOKENS:
        setTokens(TOKENS_EDEFAULT);
        return;
      case PetriNetPackage.PLACE__ARCS:
        getArcs().clear();
        return;
      case PetriNetPackage.PLACE__NAME:
        setName(NAME_EDEFAULT);
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
      case PetriNetPackage.PLACE__TOKENS:
        return tokens != TOKENS_EDEFAULT;
      case PetriNetPackage.PLACE__ARCS:
        return arcs != null && !arcs.isEmpty();
      case PetriNetPackage.PLACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (tokens: ");
    result.append(tokens);
    result.append(", Name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }
} // PlaceImpl
