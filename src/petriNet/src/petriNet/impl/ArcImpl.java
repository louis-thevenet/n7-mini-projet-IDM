/** */
package petriNet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import petriNet.Arc;
import petriNet.ArcType;
import petriNet.LinkDirection;
import petriNet.PetriNetPackage;
import petriNet.Place;
import petriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.ArcImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getArcType <em>Arc Type</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getLinkDirection <em>Link Direction</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getLinkToPlace <em>Link To Place</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getLinkToTransition <em>Link To Transition</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends NetElementImpl implements Arc {
  /**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
  protected static final int WEIGHT_EDEFAULT = 1;

  /**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
  protected int weight = WEIGHT_EDEFAULT;

  /**
	 * The default value of the '{@link #getArcType() <em>Arc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArcType()
	 * @generated
	 * @ordered
	 */
  protected static final ArcType ARC_TYPE_EDEFAULT = ArcType.ARC;

  /**
	 * The cached value of the '{@link #getArcType() <em>Arc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArcType()
	 * @generated
	 * @ordered
	 */
  protected ArcType arcType = ARC_TYPE_EDEFAULT;

  /**
	 * The default value of the '{@link #getLinkDirection() <em>Link Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinkDirection()
	 * @generated
	 * @ordered
	 */
  protected static final LinkDirection LINK_DIRECTION_EDEFAULT = LinkDirection.PLACE_TO_TRANSITION;

  /**
	 * The cached value of the '{@link #getLinkDirection() <em>Link Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinkDirection()
	 * @generated
	 * @ordered
	 */
  protected LinkDirection linkDirection = LINK_DIRECTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getLinkToPlace() <em>Link To Place</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinkToPlace()
	 * @generated
	 * @ordered
	 */
  protected Place linkToPlace;

  /**
	 * The cached value of the '{@link #getLinkToTransition() <em>Link To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLinkToTransition()
	 * @generated
	 * @ordered
	 */
  protected Transition linkToTransition;

  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ArcImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return PetriNetPackage.Literals.ARC;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int getWeight() {
		return weight;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__WEIGHT, oldWeight, weight));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ArcType getArcType() {
		return arcType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setArcType(ArcType newArcType) {
		ArcType oldArcType = arcType;
		arcType = newArcType == null ? ARC_TYPE_EDEFAULT : newArcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__ARC_TYPE, oldArcType, arcType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public LinkDirection getLinkDirection() {
		return linkDirection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setLinkDirection(LinkDirection newLinkDirection) {
		LinkDirection oldLinkDirection = linkDirection;
		linkDirection = newLinkDirection == null ? LINK_DIRECTION_EDEFAULT : newLinkDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__LINK_DIRECTION, oldLinkDirection, linkDirection));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Place getLinkToPlace() {
		if (linkToPlace != null && linkToPlace.eIsProxy()) {
			InternalEObject oldLinkToPlace = (InternalEObject)linkToPlace;
			linkToPlace = (Place)eResolveProxy(oldLinkToPlace);
			if (linkToPlace != oldLinkToPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__LINK_TO_PLACE, oldLinkToPlace, linkToPlace));
			}
		}
		return linkToPlace;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Place basicGetLinkToPlace() {
		return linkToPlace;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLinkToPlace(Place newLinkToPlace, NotificationChain msgs) {
		Place oldLinkToPlace = linkToPlace;
		linkToPlace = newLinkToPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__LINK_TO_PLACE, oldLinkToPlace, newLinkToPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setLinkToPlace(Place newLinkToPlace) {
		if (newLinkToPlace != linkToPlace) {
			NotificationChain msgs = null;
			if (linkToPlace != null)
				msgs = ((InternalEObject)linkToPlace).eInverseRemove(this, PetriNetPackage.PLACE__ARCS, Place.class, msgs);
			if (newLinkToPlace != null)
				msgs = ((InternalEObject)newLinkToPlace).eInverseAdd(this, PetriNetPackage.PLACE__ARCS, Place.class, msgs);
			msgs = basicSetLinkToPlace(newLinkToPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__LINK_TO_PLACE, newLinkToPlace, newLinkToPlace));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Transition getLinkToTransition() {
		if (linkToTransition != null && linkToTransition.eIsProxy()) {
			InternalEObject oldLinkToTransition = (InternalEObject)linkToTransition;
			linkToTransition = (Transition)eResolveProxy(oldLinkToTransition);
			if (linkToTransition != oldLinkToTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__LINK_TO_TRANSITION, oldLinkToTransition, linkToTransition));
			}
		}
		return linkToTransition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Transition basicGetLinkToTransition() {
		return linkToTransition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLinkToTransition(
      Transition newLinkToTransition, NotificationChain msgs) {
		Transition oldLinkToTransition = linkToTransition;
		linkToTransition = newLinkToTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__LINK_TO_TRANSITION, oldLinkToTransition, newLinkToTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setLinkToTransition(Transition newLinkToTransition) {
		if (newLinkToTransition != linkToTransition) {
			NotificationChain msgs = null;
			if (linkToTransition != null)
				msgs = ((InternalEObject)linkToTransition).eInverseRemove(this, PetriNetPackage.TRANSITION__ARCS, Transition.class, msgs);
			if (newLinkToTransition != null)
				msgs = ((InternalEObject)newLinkToTransition).eInverseAdd(this, PetriNetPackage.TRANSITION__ARCS, Transition.class, msgs);
			msgs = basicSetLinkToTransition(newLinkToTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__LINK_TO_TRANSITION, newLinkToTransition, newLinkToTransition));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getName() {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(
      InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.ARC__LINK_TO_PLACE:
				if (linkToPlace != null)
					msgs = ((InternalEObject)linkToPlace).eInverseRemove(this, PetriNetPackage.PLACE__ARCS, Place.class, msgs);
				return basicSetLinkToPlace((Place)otherEnd, msgs);
			case PetriNetPackage.ARC__LINK_TO_TRANSITION:
				if (linkToTransition != null)
					msgs = ((InternalEObject)linkToTransition).eInverseRemove(this, PetriNetPackage.TRANSITION__ARCS, Transition.class, msgs);
				return basicSetLinkToTransition((Transition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(
      InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.ARC__LINK_TO_PLACE:
				return basicSetLinkToPlace(null, msgs);
			case PetriNetPackage.ARC__LINK_TO_TRANSITION:
				return basicSetLinkToTransition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.ARC__WEIGHT:
				return getWeight();
			case PetriNetPackage.ARC__ARC_TYPE:
				return getArcType();
			case PetriNetPackage.ARC__LINK_DIRECTION:
				return getLinkDirection();
			case PetriNetPackage.ARC__LINK_TO_PLACE:
				if (resolve) return getLinkToPlace();
				return basicGetLinkToPlace();
			case PetriNetPackage.ARC__LINK_TO_TRANSITION:
				if (resolve) return getLinkToTransition();
				return basicGetLinkToTransition();
			case PetriNetPackage.ARC__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.ARC__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case PetriNetPackage.ARC__ARC_TYPE:
				setArcType((ArcType)newValue);
				return;
			case PetriNetPackage.ARC__LINK_DIRECTION:
				setLinkDirection((LinkDirection)newValue);
				return;
			case PetriNetPackage.ARC__LINK_TO_PLACE:
				setLinkToPlace((Place)newValue);
				return;
			case PetriNetPackage.ARC__LINK_TO_TRANSITION:
				setLinkToTransition((Transition)newValue);
				return;
			case PetriNetPackage.ARC__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID) {
		switch (featureID) {
			case PetriNetPackage.ARC__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case PetriNetPackage.ARC__ARC_TYPE:
				setArcType(ARC_TYPE_EDEFAULT);
				return;
			case PetriNetPackage.ARC__LINK_DIRECTION:
				setLinkDirection(LINK_DIRECTION_EDEFAULT);
				return;
			case PetriNetPackage.ARC__LINK_TO_PLACE:
				setLinkToPlace((Place)null);
				return;
			case PetriNetPackage.ARC__LINK_TO_TRANSITION:
				setLinkToTransition((Transition)null);
				return;
			case PetriNetPackage.ARC__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriNetPackage.ARC__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case PetriNetPackage.ARC__ARC_TYPE:
				return arcType != ARC_TYPE_EDEFAULT;
			case PetriNetPackage.ARC__LINK_DIRECTION:
				return linkDirection != LINK_DIRECTION_EDEFAULT;
			case PetriNetPackage.ARC__LINK_TO_PLACE:
				return linkToPlace != null;
			case PetriNetPackage.ARC__LINK_TO_TRANSITION:
				return linkToTransition != null;
			case PetriNetPackage.ARC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (weight: ");
		result.append(weight);
		result.append(", arcType: ");
		result.append(arcType);
		result.append(", linkDirection: ");
		result.append(linkDirection);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
} // ArcImpl
