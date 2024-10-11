/** */
package taskmaster.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import taskmaster.Causal;
import taskmaster.Event;
import taskmaster.EventBundle;
import taskmaster.Physical;
import taskmaster.Requirement;
import taskmaster.Supply;
import taskmaster.TaskmasterFactory;
import taskmaster.TaskmasterPackage;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskmasterPackageImpl extends EPackageImpl implements TaskmasterPackage {
  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass eventBundleEClass = null;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass supplyEClass = null;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass eventEClass = null;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass causalEClass = null;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private EClass physicalEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link
   * org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI value.
   *
   * <p>Note: the correct way to create the package is via the static factory method {@link #init
   * init()}, which also performs initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see taskmaster.TaskmasterPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TaskmasterPackageImpl() {
    super(eNS_URI, TaskmasterFactory.eINSTANCE);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon
   * which it depends.
   *
   * <p>This method is used to initialize {@link TaskmasterPackage#eINSTANCE} when that field is
   * accessed. Clients should not invoke it directly. Instead, they should simply access that field
   * to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TaskmasterPackage init() {
    if (isInited)
      return (TaskmasterPackage) EPackage.Registry.INSTANCE.getEPackage(TaskmasterPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredTaskmasterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    TaskmasterPackageImpl theTaskmasterPackage =
        registeredTaskmasterPackage instanceof TaskmasterPackageImpl
            ? (TaskmasterPackageImpl) registeredTaskmasterPackage
            : new TaskmasterPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theTaskmasterPackage.createPackageContents();

    // Initialize created meta-data
    theTaskmasterPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTaskmasterPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TaskmasterPackage.eNS_URI, theTaskmasterPackage);
    return theTaskmasterPackage;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getEventBundle() {
    return eventBundleEClass;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getEventBundle_Name() {
    return (EAttribute) eventBundleEClass.getEStructuralFeatures().get(0);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getEventBundle_Supplies() {
    return (EReference) eventBundleEClass.getEStructuralFeatures().get(1);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getEventBundle_Events() {
    return (EReference) eventBundleEClass.getEStructuralFeatures().get(2);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getSupply() {
    return supplyEClass;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getSupply_Consumable() {
    return (EAttribute) supplyEClass.getEStructuralFeatures().get(0);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getSupply_Name() {
    return (EAttribute) supplyEClass.getEStructuralFeatures().get(1);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getSupply_Available() {
    return (EAttribute) supplyEClass.getEStructuralFeatures().get(2);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getSupply_Bundle() {
    return (EReference) supplyEClass.getEStructuralFeatures().get(3);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getEvent() {
    return eventEClass;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getEvent_Name() {
    return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getEvent_Bundle() {
    return (EReference) eventEClass.getEStructuralFeatures().get(1);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getEvent_Requirements() {
    return (EReference) eventEClass.getEStructuralFeatures().get(2);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getRequirement() {
    return requirementEClass;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getRequirement_Event() {
    return (EReference) requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getCausal() {
    return causalEClass;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getCausal_Target() {
    return (EReference) causalEClass.getEStructuralFeatures().get(0);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EClass getPhysical() {
    return physicalEClass;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EAttribute getPhysical_Requested() {
    return (EAttribute) physicalEClass.getEStructuralFeatures().get(0);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public EReference getPhysical_Target() {
    return (EReference) physicalEClass.getEStructuralFeatures().get(1);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public TaskmasterFactory getTaskmasterFactory() {
    return (TaskmasterFactory) getEFactoryInstance();
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package. This method is guarded to have no affect on any
   * invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    eventBundleEClass = createEClass(EVENT_BUNDLE);
    createEAttribute(eventBundleEClass, EVENT_BUNDLE__NAME);
    createEReference(eventBundleEClass, EVENT_BUNDLE__SUPPLIES);
    createEReference(eventBundleEClass, EVENT_BUNDLE__EVENTS);

    supplyEClass = createEClass(SUPPLY);
    createEAttribute(supplyEClass, SUPPLY__CONSUMABLE);
    createEAttribute(supplyEClass, SUPPLY__NAME);
    createEAttribute(supplyEClass, SUPPLY__AVAILABLE);
    createEReference(supplyEClass, SUPPLY__BUNDLE);

    eventEClass = createEClass(EVENT);
    createEAttribute(eventEClass, EVENT__NAME);
    createEReference(eventEClass, EVENT__BUNDLE);
    createEReference(eventEClass, EVENT__REQUIREMENTS);

    requirementEClass = createEClass(REQUIREMENT);
    createEReference(requirementEClass, REQUIREMENT__EVENT);

    causalEClass = createEClass(CAUSAL);
    createEReference(causalEClass, CAUSAL__TARGET);

    physicalEClass = createEClass(PHYSICAL);
    createEAttribute(physicalEClass, PHYSICAL__REQUESTED);
    createEReference(physicalEClass, PHYSICAL__TARGET);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model. This method is guarded to have
   * no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    causalEClass.getESuperTypes().add(this.getRequirement());
    physicalEClass.getESuperTypes().add(this.getRequirement());

    // Initialize classes, features, and operations; add parameters
    initEClass(
        eventBundleEClass,
        EventBundle.class,
        "EventBundle",
        !IS_ABSTRACT,
        !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(
        getEventBundle_Name(),
        ecorePackage.getEString(),
        "name",
        null,
        0,
        1,
        EventBundle.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_UNSETTABLE,
        !IS_ID,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEReference(
        getEventBundle_Supplies(),
        this.getSupply(),
        this.getSupply_Bundle(),
        "supplies",
        null,
        0,
        -1,
        EventBundle.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        IS_COMPOSITE,
        !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEReference(
        getEventBundle_Events(),
        this.getEvent(),
        this.getEvent_Bundle(),
        "events",
        null,
        0,
        -1,
        EventBundle.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        IS_COMPOSITE,
        !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);

    initEClass(
        supplyEClass,
        Supply.class,
        "Supply",
        !IS_ABSTRACT,
        !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(
        getSupply_Consumable(),
        ecorePackage.getEBoolean(),
        "consumable",
        null,
        1,
        1,
        Supply.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_UNSETTABLE,
        !IS_ID,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(
        getSupply_Name(),
        ecorePackage.getEString(),
        "name",
        null,
        1,
        1,
        Supply.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_UNSETTABLE,
        !IS_ID,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(
        getSupply_Available(),
        ecorePackage.getEInt(),
        "available",
        null,
        0,
        1,
        Supply.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_UNSETTABLE,
        !IS_ID,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEReference(
        getSupply_Bundle(),
        this.getEventBundle(),
        this.getEventBundle_Supplies(),
        "bundle",
        null,
        1,
        1,
        Supply.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);

    initEClass(
        eventEClass,
        Event.class,
        "Event",
        !IS_ABSTRACT,
        !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(
        getEvent_Name(),
        ecorePackage.getEString(),
        "name",
        null,
        1,
        1,
        Event.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_UNSETTABLE,
        !IS_ID,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEReference(
        getEvent_Bundle(),
        this.getEventBundle(),
        this.getEventBundle_Events(),
        "bundle",
        null,
        1,
        1,
        Event.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEReference(
        getEvent_Requirements(),
        this.getRequirement(),
        this.getRequirement_Event(),
        "requirements",
        null,
        0,
        -1,
        Event.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        IS_COMPOSITE,
        !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);

    initEClass(
        requirementEClass,
        Requirement.class,
        "Requirement",
        IS_ABSTRACT,
        !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(
        getRequirement_Event(),
        this.getEvent(),
        this.getEvent_Requirements(),
        "event",
        null,
        1,
        1,
        Requirement.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_COMPOSITE,
        !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);

    initEClass(
        causalEClass,
        Causal.class,
        "Causal",
        !IS_ABSTRACT,
        !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(
        getCausal_Target(),
        this.getEvent(),
        null,
        "target",
        null,
        1,
        1,
        Causal.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_COMPOSITE,
        IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);

    initEClass(
        physicalEClass,
        Physical.class,
        "Physical",
        !IS_ABSTRACT,
        !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(
        getPhysical_Requested(),
        ecorePackage.getEInt(),
        "requested",
        null,
        1,
        1,
        Physical.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_UNSETTABLE,
        !IS_ID,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);
    initEReference(
        getPhysical_Target(),
        this.getSupply(),
        null,
        "target",
        null,
        0,
        1,
        Physical.class,
        !IS_TRANSIENT,
        !IS_VOLATILE,
        IS_CHANGEABLE,
        !IS_COMPOSITE,
        IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE,
        IS_UNIQUE,
        !IS_DERIVED,
        IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }
} // TaskmasterPackageImpl
