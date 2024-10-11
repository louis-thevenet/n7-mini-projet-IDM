/**
 */
package taskmaster.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import taskmaster.Physical;
import taskmaster.Supply;
import taskmaster.TaskmasterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link taskmaster.impl.PhysicalImpl#getRequested <em>Requested</em>}</li>
 *   <li>{@link taskmaster.impl.PhysicalImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalImpl extends RequirementImpl implements Physical {
	/**
	 * The default value of the '{@link #getRequested() <em>Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequested()
	 * @generated
	 * @ordered
	 */
	protected static final int REQUESTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRequested() <em>Requested</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequested()
	 * @generated
	 * @ordered
	 */
	protected int requested = REQUESTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Supply target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaskmasterPackage.Literals.PHYSICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRequested() {
		return requested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequested(int newRequested) {
		int oldRequested = requested;
		requested = newRequested;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmasterPackage.PHYSICAL__REQUESTED, oldRequested, requested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supply getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Supply)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaskmasterPackage.PHYSICAL__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Supply newTarget) {
		Supply oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaskmasterPackage.PHYSICAL__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaskmasterPackage.PHYSICAL__REQUESTED:
				return getRequested();
			case TaskmasterPackage.PHYSICAL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case TaskmasterPackage.PHYSICAL__REQUESTED:
				setRequested((Integer)newValue);
				return;
			case TaskmasterPackage.PHYSICAL__TARGET:
				setTarget((Supply)newValue);
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
			case TaskmasterPackage.PHYSICAL__REQUESTED:
				setRequested(REQUESTED_EDEFAULT);
				return;
			case TaskmasterPackage.PHYSICAL__TARGET:
				setTarget((Supply)null);
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
			case TaskmasterPackage.PHYSICAL__REQUESTED:
				return requested != REQUESTED_EDEFAULT;
			case TaskmasterPackage.PHYSICAL__TARGET:
				return target != null;
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
		result.append(" (requested: ");
		result.append(requested);
		result.append(')');
		return result.toString();
	}

} //PhysicalImpl
