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
import petriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.TransitionImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petriNet.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.impl.TransitionImpl#getTempsMin <em>Temps Min</em>}</li>
 *   <li>{@link petriNet.impl.TransitionImpl#getTempsMax <em>Temps Max</em>}</li>
 *   <li>{@link petriNet.impl.TransitionImpl#isTempsMaxBorne <em>Temps Max Borne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NetElementImpl implements Transition {
  /**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
  protected EList<Arc> arcs;

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
	 * The default value of the '{@link #getTempsMin() <em>Temps Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMin()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPS_MIN_EDEFAULT = 0;

		/**
	 * The cached value of the '{@link #getTempsMin() <em>Temps Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMin()
	 * @generated
	 * @ordered
	 */
	protected int tempsMin = TEMPS_MIN_EDEFAULT;

		/**
	 * The default value of the '{@link #getTempsMax() <em>Temps Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMax()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPS_MAX_EDEFAULT = 0;

		/**
	 * The cached value of the '{@link #getTempsMax() <em>Temps Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsMax()
	 * @generated
	 * @ordered
	 */
	protected int tempsMax = TEMPS_MAX_EDEFAULT;

		/**
	 * The default value of the '{@link #isTempsMaxBorne() <em>Temps Max Borne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTempsMaxBorne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPS_MAX_BORNE_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isTempsMaxBorne() <em>Temps Max Borne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTempsMaxBorne()
	 * @generated
	 * @ordered
	 */
	protected boolean tempsMaxBorne = TEMPS_MAX_BORNE_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TransitionImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return PetriNetPackage.Literals.TRANSITION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EList<Arc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetriNetPackage.TRANSITION__ARCS, PetriNetPackage.ARC__LINK_TO_TRANSITION);
		}
		return arcs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTempsMin() {
		return tempsMin;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempsMin(int newTempsMin) {
		int oldTempsMin = tempsMin;
		tempsMin = newTempsMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__TEMPS_MIN, oldTempsMin, tempsMin));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTempsMax() {
		return tempsMax;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempsMax(int newTempsMax) {
		int oldTempsMax = tempsMax;
		tempsMax = newTempsMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__TEMPS_MAX, oldTempsMax, tempsMax));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTempsMaxBorne() {
		return tempsMaxBorne;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTempsMaxBorne(boolean newTempsMaxBorne) {
		boolean oldTempsMaxBorne = tempsMaxBorne;
		tempsMaxBorne = newTempsMaxBorne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__TEMPS_MAX_BORNE, oldTempsMaxBorne, tempsMaxBorne));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(
      InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.TRANSITION__ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArcs()).basicAdd(otherEnd, msgs);
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
			case PetriNetPackage.TRANSITION__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
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
			case PetriNetPackage.TRANSITION__ARCS:
				return getArcs();
			case PetriNetPackage.TRANSITION__NAME:
				return getName();
			case PetriNetPackage.TRANSITION__TEMPS_MIN:
				return getTempsMin();
			case PetriNetPackage.TRANSITION__TEMPS_MAX:
				return getTempsMax();
			case PetriNetPackage.TRANSITION__TEMPS_MAX_BORNE:
				return isTempsMaxBorne();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.TRANSITION__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case PetriNetPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case PetriNetPackage.TRANSITION__TEMPS_MIN:
				setTempsMin((Integer)newValue);
				return;
			case PetriNetPackage.TRANSITION__TEMPS_MAX:
				setTempsMax((Integer)newValue);
				return;
			case PetriNetPackage.TRANSITION__TEMPS_MAX_BORNE:
				setTempsMaxBorne((Boolean)newValue);
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
			case PetriNetPackage.TRANSITION__ARCS:
				getArcs().clear();
				return;
			case PetriNetPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetriNetPackage.TRANSITION__TEMPS_MIN:
				setTempsMin(TEMPS_MIN_EDEFAULT);
				return;
			case PetriNetPackage.TRANSITION__TEMPS_MAX:
				setTempsMax(TEMPS_MAX_EDEFAULT);
				return;
			case PetriNetPackage.TRANSITION__TEMPS_MAX_BORNE:
				setTempsMaxBorne(TEMPS_MAX_BORNE_EDEFAULT);
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
			case PetriNetPackage.TRANSITION__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PetriNetPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetriNetPackage.TRANSITION__TEMPS_MIN:
				return tempsMin != TEMPS_MIN_EDEFAULT;
			case PetriNetPackage.TRANSITION__TEMPS_MAX:
				return tempsMax != TEMPS_MAX_EDEFAULT;
			case PetriNetPackage.TRANSITION__TEMPS_MAX_BORNE:
				return tempsMaxBorne != TEMPS_MAX_BORNE_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", tempsMin: ");
		result.append(tempsMin);
		result.append(", tempsMax: ");
		result.append(tempsMax);
		result.append(", tempsMaxBorne: ");
		result.append(tempsMaxBorne);
		result.append(')');
		return result.toString();
	}
} // TransitionImpl
