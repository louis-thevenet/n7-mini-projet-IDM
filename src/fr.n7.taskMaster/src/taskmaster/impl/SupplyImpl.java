/**
 */
package taskmaster.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import taskmaster.EventBundle;
import taskmaster.Supply;
import taskmaster.TaskmasterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmaster.impl.SupplyImpl#isConsumable <em>Consumable</em>}</li>
 *   <li>{@link taskmaster.impl.SupplyImpl#getName <em>Name</em>}</li>
 *   <li>{@link taskmaster.impl.SupplyImpl#getAvailable <em>Available</em>}</li>
 *   <li>{@link taskmaster.impl.SupplyImpl#getBundle <em>Bundle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyImpl extends MinimalEObjectImpl.Container implements Supply {
	/**
	 * The default value of the '{@link #isConsumable() <em>Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsumable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSUMABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConsumable() <em>Consumable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsumable()
	 * @generated
	 * @ordered
	 */
	protected boolean consumable = CONSUMABLE_EDEFAULT;

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
	 * The default value of the '{@link #getAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailable()
	 * @generated
	 * @ordered
	 */
	protected int available = AVAILABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmasterPackage.Literals.SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConsumable() {
		return consumable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumable(boolean newConsumable) {
		boolean oldConsumable = consumable;
		consumable = newConsumable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmasterPackage.SUPPLY__CONSUMABLE, oldConsumable, consumable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmasterPackage.SUPPLY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvailable() {
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailable(int newAvailable) {
		int oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmasterPackage.SUPPLY__AVAILABLE, oldAvailable, available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventBundle getBundle() {
		if (eContainerFeatureID() != TaskmasterPackage.SUPPLY__BUNDLE) return null;
		return (EventBundle)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundle(EventBundle newBundle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBundle, TaskmasterPackage.SUPPLY__BUNDLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundle(EventBundle newBundle) {
		if (newBundle != eInternalContainer() || (eContainerFeatureID() != TaskmasterPackage.SUPPLY__BUNDLE && newBundle != null)) {
			if (EcoreUtil.isAncestor(this, newBundle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBundle != null)
				msgs = ((InternalEObject)newBundle).eInverseAdd(this, TaskmasterPackage.EVENT_BUNDLE__SUPPLIES, EventBundle.class, msgs);
			msgs = basicSetBundle(newBundle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmasterPackage.SUPPLY__BUNDLE, newBundle, newBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskmasterPackage.SUPPLY__BUNDLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBundle((EventBundle)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaskmasterPackage.SUPPLY__BUNDLE:
				return basicSetBundle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TaskmasterPackage.SUPPLY__BUNDLE:
				return eInternalContainer().eInverseRemove(this, TaskmasterPackage.EVENT_BUNDLE__SUPPLIES, EventBundle.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskmasterPackage.SUPPLY__CONSUMABLE:
				return isConsumable();
			case TaskmasterPackage.SUPPLY__NAME:
				return getName();
			case TaskmasterPackage.SUPPLY__AVAILABLE:
				return getAvailable();
			case TaskmasterPackage.SUPPLY__BUNDLE:
				return getBundle();
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
			case TaskmasterPackage.SUPPLY__CONSUMABLE:
				setConsumable((Boolean)newValue);
				return;
			case TaskmasterPackage.SUPPLY__NAME:
				setName((String)newValue);
				return;
			case TaskmasterPackage.SUPPLY__AVAILABLE:
				setAvailable((Integer)newValue);
				return;
			case TaskmasterPackage.SUPPLY__BUNDLE:
				setBundle((EventBundle)newValue);
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
			case TaskmasterPackage.SUPPLY__CONSUMABLE:
				setConsumable(CONSUMABLE_EDEFAULT);
				return;
			case TaskmasterPackage.SUPPLY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TaskmasterPackage.SUPPLY__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
				return;
			case TaskmasterPackage.SUPPLY__BUNDLE:
				setBundle((EventBundle)null);
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
			case TaskmasterPackage.SUPPLY__CONSUMABLE:
				return consumable != CONSUMABLE_EDEFAULT;
			case TaskmasterPackage.SUPPLY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TaskmasterPackage.SUPPLY__AVAILABLE:
				return available != AVAILABLE_EDEFAULT;
			case TaskmasterPackage.SUPPLY__BUNDLE:
				return getBundle() != null;
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
		result.append(" (consumable: ");
		result.append(consumable);
		result.append(", name: ");
		result.append(name);
		result.append(", available: ");
		result.append(available);
		result.append(')');
		return result.toString();
	}

} //SupplyImpl
