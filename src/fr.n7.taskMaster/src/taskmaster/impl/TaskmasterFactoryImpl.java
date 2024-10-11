/**
 */
package taskmaster.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import taskmaster.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskmasterFactoryImpl extends EFactoryImpl implements TaskmasterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskmasterFactory init() {
		try {
			TaskmasterFactory theTaskmasterFactory = (TaskmasterFactory)EPackage.Registry.INSTANCE.getEFactory(TaskmasterPackage.eNS_URI);
			if (theTaskmasterFactory != null) {
				return theTaskmasterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskmasterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskmasterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TaskmasterPackage.EVENT_BUNDLE: return createEventBundle();
			case TaskmasterPackage.SUPPLY: return createSupply();
			case TaskmasterPackage.EVENT: return createEvent();
			case TaskmasterPackage.CAUSAL: return createCausal();
			case TaskmasterPackage.PHYSICAL: return createPhysical();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventBundle createEventBundle() {
		EventBundleImpl eventBundle = new EventBundleImpl();
		return eventBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supply createSupply() {
		SupplyImpl supply = new SupplyImpl();
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Causal createCausal() {
		CausalImpl causal = new CausalImpl();
		return causal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Physical createPhysical() {
		PhysicalImpl physical = new PhysicalImpl();
		return physical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskmasterPackage getTaskmasterPackage() {
		return (TaskmasterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskmasterPackage getPackage() {
		return TaskmasterPackage.eINSTANCE;
	}

} //TaskmasterFactoryImpl
