/** generated by Xtext 2.32.0 */
package fr.n7.pDL3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 *
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 *
 * <ul>
 *   <li>each class,
 *   <li>each feature of each class,
 *   <li>each enum,
 *   <li>and each data type
 * </ul>
 *
 * <!-- end-user-doc -->
 *
 * @see fr.n7.pDL3.PDL3Factory
 * @model kind="package"
 * @generated
 */
public interface PDL3Package extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  String eNAME = "pDL3";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  String eNS_URI = "http://www.n7.fr/PDL3";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  String eNS_PREFIX = "pDL3";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  PDL3Package eINSTANCE = fr.n7.pDL3.impl.PDL3PackageImpl.init();

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.ProcessImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Process Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int PROCESS__PROCESS_ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.ResourceUsagesImpl <em>Resource
   * Usages</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.ResourceUsagesImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResourceUsages()
   * @generated
   */
  int RESOURCE_USAGES = 1;

  /**
   * The number of structural features of the '<em>Resource Usages</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE_USAGES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.ResourceUsageImpl <em>Resource Usage</em>}'
   * class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.ResourceUsageImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResourceUsage()
   * @generated
   */
  int RESOURCE_USAGE = 2;

  /**
   * The feature id for the '<em><b>Work Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE_USAGE__WORK_DEFINITION = RESOURCE_USAGES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE_USAGE__RESOURCE = RESOURCE_USAGES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Needed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE_USAGE__NEEDED = RESOURCE_USAGES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Resource Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE_USAGE_FEATURE_COUNT = RESOURCE_USAGES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.ResourcesImpl <em>Resources</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.ResourcesImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResources()
   * @generated
   */
  int RESOURCES = 3;

  /**
   * The number of structural features of the '<em>Resources</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.ResourceImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = RESOURCES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Total</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE__TOTAL = RESOURCES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = RESOURCES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.WorkDefinitionsImpl <em>Work
   * Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.WorkDefinitionsImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkDefinitions()
   * @generated
   */
  int WORK_DEFINITIONS = 5;

  /**
   * The number of structural features of the '<em>Work Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_DEFINITIONS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.WorkDefinitionImpl <em>Work
   * Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.WorkDefinitionImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkDefinition()
   * @generated
   */
  int WORK_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_DEFINITION__NAME = WORK_DEFINITIONS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Work Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_DEFINITION_FEATURE_COUNT = WORK_DEFINITIONS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.WorkSequencesImpl <em>Work Sequences</em>}'
   * class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.WorkSequencesImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkSequences()
   * @generated
   */
  int WORK_SEQUENCES = 7;

  /**
   * The number of structural features of the '<em>Work Sequences</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_SEQUENCES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.impl.WorkSequenceImpl <em>Work Sequence</em>}'
   * class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.impl.WorkSequenceImpl
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkSequence()
   * @generated
   */
  int WORK_SEQUENCE = 8;

  /**
   * The feature id for the '<em><b>Link To Predecessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__LINK_TO_PREDECESSOR = WORK_SEQUENCES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Link Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__LINK_TYPE = WORK_SEQUENCES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Link To Sucessor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE__LINK_TO_SUCESSOR = WORK_SEQUENCES_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Work Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   */
  int WORK_SEQUENCE_FEATURE_COUNT = WORK_SEQUENCES_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link fr.n7.pDL3.WorkSequenceKind <em>Work Sequence Kind</em>}'
   * enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see fr.n7.pDL3.WorkSequenceKind
   * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkSequenceKind()
   * @generated
   */
  int WORK_SEQUENCE_KIND = 9;

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Process</em>'.
   * @see fr.n7.pDL3.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL3.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.pDL3.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link
   * fr.n7.pDL3.Process#getProcessElements <em>Process Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the containment reference list '<em>Process Elements</em>'.
   * @see fr.n7.pDL3.Process#getProcessElements()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_ProcessElements();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.ResourceUsages <em>Resource Usages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Resource Usages</em>'.
   * @see fr.n7.pDL3.ResourceUsages
   * @generated
   */
  EClass getResourceUsages();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.ResourceUsage <em>Resource Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Resource Usage</em>'.
   * @see fr.n7.pDL3.ResourceUsage
   * @generated
   */
  EClass getResourceUsage();

  /**
   * Returns the meta object for the reference '{@link fr.n7.pDL3.ResourceUsage#getWorkDefinition
   * <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the reference '<em>Work Definition</em>'.
   * @see fr.n7.pDL3.ResourceUsage#getWorkDefinition()
   * @see #getResourceUsage()
   * @generated
   */
  EReference getResourceUsage_WorkDefinition();

  /**
   * Returns the meta object for the reference '{@link fr.n7.pDL3.ResourceUsage#getResource
   * <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the reference '<em>Resource</em>'.
   * @see fr.n7.pDL3.ResourceUsage#getResource()
   * @see #getResourceUsage()
   * @generated
   */
  EReference getResourceUsage_Resource();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL3.ResourceUsage#getNeeded
   * <em>Needed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Needed</em>'.
   * @see fr.n7.pDL3.ResourceUsage#getNeeded()
   * @see #getResourceUsage()
   * @generated
   */
  EAttribute getResourceUsage_Needed();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.Resources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Resources</em>'.
   * @see fr.n7.pDL3.Resources
   * @generated
   */
  EClass getResources();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Resource</em>'.
   * @see fr.n7.pDL3.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL3.Resource#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.pDL3.Resource#getName()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL3.Resource#getTotal
   * <em>Total</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Total</em>'.
   * @see fr.n7.pDL3.Resource#getTotal()
   * @see #getResource()
   * @generated
   */
  EAttribute getResource_Total();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.WorkDefinitions <em>Work
   * Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Work Definitions</em>'.
   * @see fr.n7.pDL3.WorkDefinitions
   * @generated
   */
  EClass getWorkDefinitions();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.WorkDefinition <em>Work Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Work Definition</em>'.
   * @see fr.n7.pDL3.WorkDefinition
   * @generated
   */
  EClass getWorkDefinition();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL3.WorkDefinition#getName
   * <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.pDL3.WorkDefinition#getName()
   * @see #getWorkDefinition()
   * @generated
   */
  EAttribute getWorkDefinition_Name();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.WorkSequences <em>Work Sequences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Work Sequences</em>'.
   * @see fr.n7.pDL3.WorkSequences
   * @generated
   */
  EClass getWorkSequences();

  /**
   * Returns the meta object for class '{@link fr.n7.pDL3.WorkSequence <em>Work Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for class '<em>Work Sequence</em>'.
   * @see fr.n7.pDL3.WorkSequence
   * @generated
   */
  EClass getWorkSequence();

  /**
   * Returns the meta object for the reference '{@link fr.n7.pDL3.WorkSequence#getLinkToPredecessor
   * <em>Link To Predecessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the reference '<em>Link To Predecessor</em>'.
   * @see fr.n7.pDL3.WorkSequence#getLinkToPredecessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_LinkToPredecessor();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.pDL3.WorkSequence#getLinkType <em>Link
   * Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the attribute '<em>Link Type</em>'.
   * @see fr.n7.pDL3.WorkSequence#getLinkType()
   * @see #getWorkSequence()
   * @generated
   */
  EAttribute getWorkSequence_LinkType();

  /**
   * Returns the meta object for the reference '{@link fr.n7.pDL3.WorkSequence#getLinkToSucessor
   * <em>Link To Sucessor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for the reference '<em>Link To Sucessor</em>'.
   * @see fr.n7.pDL3.WorkSequence#getLinkToSucessor()
   * @see #getWorkSequence()
   * @generated
   */
  EReference getWorkSequence_LinkToSucessor();

  /**
   * Returns the meta object for enum '{@link fr.n7.pDL3.WorkSequenceKind <em>Work Sequence
   * Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the meta object for enum '<em>Work Sequence Kind</em>'.
   * @see fr.n7.pDL3.WorkSequenceKind
   * @generated
   */
  EEnum getWorkSequenceKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PDL3Factory getPDL3Factory();

  /**
   *
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   *
   * <ul>
   *   <li>each class,
   *   <li>each feature of each class,
   *   <li>each enum,
   *   <li>and each data type
   * </ul>
   *
   * <!-- end-user-doc -->
   *
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.ProcessImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Process Elements</b></em>' containment reference list
     * feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EReference PROCESS__PROCESS_ELEMENTS = eINSTANCE.getProcess_ProcessElements();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.ResourceUsagesImpl <em>Resource
     * Usages</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.ResourceUsagesImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResourceUsages()
     * @generated
     */
    EClass RESOURCE_USAGES = eINSTANCE.getResourceUsages();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.ResourceUsageImpl <em>Resource
     * Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.ResourceUsageImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResourceUsage()
     * @generated
     */
    EClass RESOURCE_USAGE = eINSTANCE.getResourceUsage();

    /**
     * The meta object literal for the '<em><b>Work Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EReference RESOURCE_USAGE__WORK_DEFINITION = eINSTANCE.getResourceUsage_WorkDefinition();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EReference RESOURCE_USAGE__RESOURCE = eINSTANCE.getResourceUsage_Resource();

    /**
     * The meta object literal for the '<em><b>Needed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute RESOURCE_USAGE__NEEDED = eINSTANCE.getResourceUsage_Needed();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.ResourcesImpl <em>Resources</em>}'
     * class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.ResourcesImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResources()
     * @generated
     */
    EClass RESOURCES = eINSTANCE.getResources();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.ResourceImpl <em>Resource</em>}'
     * class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.ResourceImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

    /**
     * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute RESOURCE__TOTAL = eINSTANCE.getResource_Total();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.WorkDefinitionsImpl <em>Work
     * Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.WorkDefinitionsImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkDefinitions()
     * @generated
     */
    EClass WORK_DEFINITIONS = eINSTANCE.getWorkDefinitions();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.WorkDefinitionImpl <em>Work
     * Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.WorkDefinitionImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkDefinition()
     * @generated
     */
    EClass WORK_DEFINITION = eINSTANCE.getWorkDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute WORK_DEFINITION__NAME = eINSTANCE.getWorkDefinition_Name();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.WorkSequencesImpl <em>Work
     * Sequences</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.WorkSequencesImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkSequences()
     * @generated
     */
    EClass WORK_SEQUENCES = eINSTANCE.getWorkSequences();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.impl.WorkSequenceImpl <em>Work
     * Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.impl.WorkSequenceImpl
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkSequence()
     * @generated
     */
    EClass WORK_SEQUENCE = eINSTANCE.getWorkSequence();

    /**
     * The meta object literal for the '<em><b>Link To Predecessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EReference WORK_SEQUENCE__LINK_TO_PREDECESSOR = eINSTANCE.getWorkSequence_LinkToPredecessor();

    /**
     * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EAttribute WORK_SEQUENCE__LINK_TYPE = eINSTANCE.getWorkSequence_LinkType();

    /**
     * The meta object literal for the '<em><b>Link To Sucessor</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    EReference WORK_SEQUENCE__LINK_TO_SUCESSOR = eINSTANCE.getWorkSequence_LinkToSucessor();

    /**
     * The meta object literal for the '{@link fr.n7.pDL3.WorkSequenceKind <em>Work Sequence
     * Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see fr.n7.pDL3.WorkSequenceKind
     * @see fr.n7.pDL3.impl.PDL3PackageImpl#getWorkSequenceKind()
     * @generated
     */
    EEnum WORK_SEQUENCE_KIND = eINSTANCE.getWorkSequenceKind();
  }
} // PDL3Package
