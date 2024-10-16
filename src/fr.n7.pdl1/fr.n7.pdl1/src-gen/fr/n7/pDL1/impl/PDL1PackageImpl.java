/**
 * generated by Xtext 2.32.0
 */
package fr.n7.pDL1.impl;

import fr.n7.pDL1.Guidance;
import fr.n7.pDL1.PDL1Factory;
import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.ProcessElement;
import fr.n7.pDL1.WorkDefinition;
import fr.n7.pDL1.WorkSequence;
import fr.n7.pDL1.WorkSequenceType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PDL1PackageImpl extends EPackageImpl implements PDL1Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass guidanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum workSequenceTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.n7.pDL1.PDL1Package#eNS_URI
   * @see #init()
   * @generated
   */
  private PDL1PackageImpl()
  {
    super(eNS_URI, PDL1Factory.eINSTANCE);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link PDL1Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PDL1Package init()
  {
    if (isInited) return (PDL1Package)EPackage.Registry.INSTANCE.getEPackage(PDL1Package.eNS_URI);

    // Obtain or create and register package
    Object registeredPDL1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
    PDL1PackageImpl thePDL1Package = registeredPDL1Package instanceof PDL1PackageImpl ? (PDL1PackageImpl)registeredPDL1Package : new PDL1PackageImpl();

    isInited = true;

    // Create package meta-data objects
    thePDL1Package.createPackageContents();

    // Initialize created meta-data
    thePDL1Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePDL1Package.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PDL1Package.eNS_URI, thePDL1Package);
    return thePDL1Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProcess()
  {
    return processEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProcess_Name()
  {
    return (EAttribute)processEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getProcess_ProcessElements()
  {
    return (EReference)processEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProcessElement()
  {
    return processElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWorkDefinition()
  {
    return workDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWorkDefinition_Name()
  {
    return (EAttribute)workDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWorkSequence()
  {
    return workSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWorkSequence_LinkType()
  {
    return (EAttribute)workSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWorkSequence_Predecessor()
  {
    return (EReference)workSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWorkSequence_Successor()
  {
    return (EReference)workSequenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGuidance()
  {
    return guidanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGuidance_Texte()
  {
    return (EAttribute)guidanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getWorkSequenceType()
  {
    return workSequenceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PDL1Factory getPDL1Factory()
  {
    return (PDL1Factory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    processEClass = createEClass(PROCESS);
    createEAttribute(processEClass, PROCESS__NAME);
    createEReference(processEClass, PROCESS__PROCESS_ELEMENTS);

    processElementEClass = createEClass(PROCESS_ELEMENT);

    workDefinitionEClass = createEClass(WORK_DEFINITION);
    createEAttribute(workDefinitionEClass, WORK_DEFINITION__NAME);

    workSequenceEClass = createEClass(WORK_SEQUENCE);
    createEAttribute(workSequenceEClass, WORK_SEQUENCE__LINK_TYPE);
    createEReference(workSequenceEClass, WORK_SEQUENCE__PREDECESSOR);
    createEReference(workSequenceEClass, WORK_SEQUENCE__SUCCESSOR);

    guidanceEClass = createEClass(GUIDANCE);
    createEAttribute(guidanceEClass, GUIDANCE__TEXTE);

    // Create enums
    workSequenceTypeEEnum = createEEnum(WORK_SEQUENCE_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    workDefinitionEClass.getESuperTypes().add(this.getProcessElement());
    workSequenceEClass.getESuperTypes().add(this.getProcessElement());
    guidanceEClass.getESuperTypes().add(this.getProcessElement());

    // Initialize classes and features; add operations and parameters
    initEClass(processEClass, fr.n7.pDL1.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, fr.n7.pDL1.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProcess_ProcessElements(), this.getProcessElement(), null, "processElements", null, 0, -1, fr.n7.pDL1.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processElementEClass, ProcessElement.class, "ProcessElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(workDefinitionEClass, WorkDefinition.class, "WorkDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, WorkDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workSequenceEClass, WorkSequence.class, "WorkSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkSequence_LinkType(), this.getWorkSequenceType(), "linkType", null, 0, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkSequence_Predecessor(), this.getWorkDefinition(), null, "predecessor", null, 0, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkSequence_Successor(), this.getWorkDefinition(), null, "successor", null, 0, 1, WorkSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(guidanceEClass, Guidance.class, "Guidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGuidance_Texte(), ecorePackage.getEString(), "texte", null, 0, 1, Guidance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(workSequenceTypeEEnum, WorkSequenceType.class, "WorkSequenceType");
    addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.START2START);
    addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.FINISH2START);
    addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.START2FINISH);
    addEEnumLiteral(workSequenceTypeEEnum, WorkSequenceType.FINISH2FINISH);

    // Create resource
    createResource(eNS_URI);
  }

} //PDL1PackageImpl
