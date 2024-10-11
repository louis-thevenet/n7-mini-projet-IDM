/**
 */
package taskmaster;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see taskmaster.TaskmasterFactory
 * @model kind="package"
 * @generated
 */
public interface TaskmasterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskmaster";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://taskmaster";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taskmaster";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskmasterPackage eINSTANCE = taskmaster.impl.TaskmasterPackageImpl.init();

	/**
	 * The meta object id for the '{@link taskmaster.impl.EventBundleImpl <em>Event Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmaster.impl.EventBundleImpl
	 * @see taskmaster.impl.TaskmasterPackageImpl#getEventBundle()
	 * @generated
	 */
	int EVENT_BUNDLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUNDLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Supplies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUNDLE__SUPPLIES = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUNDLE__EVENTS = 2;

	/**
	 * The number of structural features of the '<em>Event Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUNDLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BUNDLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taskmaster.impl.SupplyImpl <em>Supply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmaster.impl.SupplyImpl
	 * @see taskmaster.impl.TaskmasterPackageImpl#getSupply()
	 * @generated
	 */
	int SUPPLY = 1;

	/**
	 * The feature id for the '<em><b>Consumable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__CONSUMABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__AVAILABLE = 2;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY__BUNDLE = 3;

	/**
	 * The number of structural features of the '<em>Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Supply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taskmaster.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmaster.impl.EventImpl
	 * @see taskmaster.impl.TaskmasterPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__BUNDLE = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__REQUIREMENTS = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taskmaster.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmaster.impl.RequirementImpl
	 * @see taskmaster.impl.TaskmasterPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EVENT = 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link taskmaster.impl.CausalImpl <em>Causal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmaster.impl.CausalImpl
	 * @see taskmaster.impl.TaskmasterPackageImpl#getCausal()
	 * @generated
	 */
	int CAUSAL = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__EVENT = REQUIREMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL__TARGET = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Causal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Causal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSAL_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link taskmaster.impl.PhysicalImpl <em>Physical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see taskmaster.impl.PhysicalImpl
	 * @see taskmaster.impl.TaskmasterPackageImpl#getPhysical()
	 * @generated
	 */
	int PHYSICAL = 5;

	/**
	 * The feature id for the '<em><b>Event</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__EVENT = REQUIREMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Requested</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__REQUESTED = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__TARGET = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link taskmaster.EventBundle <em>Event Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Bundle</em>'.
	 * @see taskmaster.EventBundle
	 * @generated
	 */
	EClass getEventBundle();

	/**
	 * Returns the meta object for the attribute '{@link taskmaster.EventBundle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taskmaster.EventBundle#getName()
	 * @see #getEventBundle()
	 * @generated
	 */
	EAttribute getEventBundle_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmaster.EventBundle#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplies</em>'.
	 * @see taskmaster.EventBundle#getSupplies()
	 * @see #getEventBundle()
	 * @generated
	 */
	EReference getEventBundle_Supplies();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmaster.EventBundle#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see taskmaster.EventBundle#getEvents()
	 * @see #getEventBundle()
	 * @generated
	 */
	EReference getEventBundle_Events();

	/**
	 * Returns the meta object for class '{@link taskmaster.Supply <em>Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supply</em>'.
	 * @see taskmaster.Supply
	 * @generated
	 */
	EClass getSupply();

	/**
	 * Returns the meta object for the attribute '{@link taskmaster.Supply#isConsumable <em>Consumable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumable</em>'.
	 * @see taskmaster.Supply#isConsumable()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_Consumable();

	/**
	 * Returns the meta object for the attribute '{@link taskmaster.Supply#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taskmaster.Supply#getName()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_Name();

	/**
	 * Returns the meta object for the attribute '{@link taskmaster.Supply#getAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see taskmaster.Supply#getAvailable()
	 * @see #getSupply()
	 * @generated
	 */
	EAttribute getSupply_Available();

	/**
	 * Returns the meta object for the container reference '{@link taskmaster.Supply#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bundle</em>'.
	 * @see taskmaster.Supply#getBundle()
	 * @see #getSupply()
	 * @generated
	 */
	EReference getSupply_Bundle();

	/**
	 * Returns the meta object for class '{@link taskmaster.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see taskmaster.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link taskmaster.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see taskmaster.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the container reference '{@link taskmaster.Event#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Bundle</em>'.
	 * @see taskmaster.Event#getBundle()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Bundle();

	/**
	 * Returns the meta object for the containment reference list '{@link taskmaster.Event#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see taskmaster.Event#getRequirements()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Requirements();

	/**
	 * Returns the meta object for class '{@link taskmaster.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see taskmaster.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the container reference '{@link taskmaster.Requirement#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Event</em>'.
	 * @see taskmaster.Requirement#getEvent()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Event();

	/**
	 * Returns the meta object for class '{@link taskmaster.Causal <em>Causal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Causal</em>'.
	 * @see taskmaster.Causal
	 * @generated
	 */
	EClass getCausal();

	/**
	 * Returns the meta object for the reference '{@link taskmaster.Causal#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see taskmaster.Causal#getTarget()
	 * @see #getCausal()
	 * @generated
	 */
	EReference getCausal_Target();

	/**
	 * Returns the meta object for class '{@link taskmaster.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical</em>'.
	 * @see taskmaster.Physical
	 * @generated
	 */
	EClass getPhysical();

	/**
	 * Returns the meta object for the attribute '{@link taskmaster.Physical#getRequested <em>Requested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requested</em>'.
	 * @see taskmaster.Physical#getRequested()
	 * @see #getPhysical()
	 * @generated
	 */
	EAttribute getPhysical_Requested();

	/**
	 * Returns the meta object for the reference '{@link taskmaster.Physical#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see taskmaster.Physical#getTarget()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskmasterFactory getTaskmasterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link taskmaster.impl.EventBundleImpl <em>Event Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmaster.impl.EventBundleImpl
		 * @see taskmaster.impl.TaskmasterPackageImpl#getEventBundle()
		 * @generated
		 */
		EClass EVENT_BUNDLE = eINSTANCE.getEventBundle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_BUNDLE__NAME = eINSTANCE.getEventBundle_Name();

		/**
		 * The meta object literal for the '<em><b>Supplies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BUNDLE__SUPPLIES = eINSTANCE.getEventBundle_Supplies();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BUNDLE__EVENTS = eINSTANCE.getEventBundle_Events();

		/**
		 * The meta object literal for the '{@link taskmaster.impl.SupplyImpl <em>Supply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmaster.impl.SupplyImpl
		 * @see taskmaster.impl.TaskmasterPackageImpl#getSupply()
		 * @generated
		 */
		EClass SUPPLY = eINSTANCE.getSupply();

		/**
		 * The meta object literal for the '<em><b>Consumable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__CONSUMABLE = eINSTANCE.getSupply_Consumable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__NAME = eINSTANCE.getSupply_Name();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLY__AVAILABLE = eINSTANCE.getSupply_Available();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLY__BUNDLE = eINSTANCE.getSupply_Bundle();

		/**
		 * The meta object literal for the '{@link taskmaster.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmaster.impl.EventImpl
		 * @see taskmaster.impl.TaskmasterPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__BUNDLE = eINSTANCE.getEvent_Bundle();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__REQUIREMENTS = eINSTANCE.getEvent_Requirements();

		/**
		 * The meta object literal for the '{@link taskmaster.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmaster.impl.RequirementImpl
		 * @see taskmaster.impl.TaskmasterPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__EVENT = eINSTANCE.getRequirement_Event();

		/**
		 * The meta object literal for the '{@link taskmaster.impl.CausalImpl <em>Causal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmaster.impl.CausalImpl
		 * @see taskmaster.impl.TaskmasterPackageImpl#getCausal()
		 * @generated
		 */
		EClass CAUSAL = eINSTANCE.getCausal();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAUSAL__TARGET = eINSTANCE.getCausal_Target();

		/**
		 * The meta object literal for the '{@link taskmaster.impl.PhysicalImpl <em>Physical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see taskmaster.impl.PhysicalImpl
		 * @see taskmaster.impl.TaskmasterPackageImpl#getPhysical()
		 * @generated
		 */
		EClass PHYSICAL = eINSTANCE.getPhysical();

		/**
		 * The meta object literal for the '<em><b>Requested</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL__REQUESTED = eINSTANCE.getPhysical_Requested();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__TARGET = eINSTANCE.getPhysical_Target();

	}

} //TaskmasterPackage
