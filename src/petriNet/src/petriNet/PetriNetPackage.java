/**
 */
package petriNet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see petriNet.PetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface PetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petriNet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petriNet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriNetPackage eINSTANCE = petriNet.impl.PetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link petriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PetriNetImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 0;

	/**
	 * The feature id for the '<em><b>Net Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NET_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.NetElementImpl <em>Net Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.NetElementImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getNetElement()
	 * @generated
	 */
	int NET_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Net Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.PlaceImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TOKENS = NET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ARCS = NET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = NET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = NET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = NET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.TransitionImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ARCS = NET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.impl.ArcImpl
	 * @see petriNet.impl.PetriNetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__WEIGHT = NET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ARC_TYPE = NET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LINK_DIRECTION = NET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link To Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LINK_TO_PLACE = NET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link To Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__LINK_TO_TRANSITION = NET_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = NET_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = NET_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = NET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link petriNet.LinkDirection <em>Link Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.LinkDirection
	 * @see petriNet.impl.PetriNetPackageImpl#getLinkDirection()
	 * @generated
	 */
	int LINK_DIRECTION = 5;

	/**
	 * The meta object id for the '{@link petriNet.ArcType <em>Arc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petriNet.ArcType
	 * @see petriNet.impl.PetriNetPackageImpl#getArcType()
	 * @generated
	 */
	int ARC_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link petriNet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see petriNet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link petriNet.PetriNet#getNetElements <em>Net Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net Elements</em>'.
	 * @see petriNet.PetriNet#getNetElements()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_NetElements();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.PetriNet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.PetriNet#getName()
	 * @see #getPetriNet()
	 * @generated
	 */
	EAttribute getPetriNet_Name();

	/**
	 * Returns the meta object for class '{@link petriNet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see petriNet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Place#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tokens</em>'.
	 * @see petriNet.Place#getTokens()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Tokens();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Place#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see petriNet.Place#getArcs()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_Arcs();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for class '{@link petriNet.NetElement <em>Net Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net Element</em>'.
	 * @see petriNet.NetElement
	 * @generated
	 */
	EClass getNetElement();

	/**
	 * Returns the meta object for class '{@link petriNet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petriNet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link petriNet.Transition#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arcs</em>'.
	 * @see petriNet.Transition#getArcs()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Arcs();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link petriNet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see petriNet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see petriNet.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Weight();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arc Type</em>'.
	 * @see petriNet.Arc#getArcType()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_ArcType();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getLinkDirection <em>Link Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Direction</em>'.
	 * @see petriNet.Arc#getLinkDirection()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_LinkDirection();

	/**
	 * Returns the meta object for the reference '{@link petriNet.Arc#getLinkToPlace <em>Link To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To Place</em>'.
	 * @see petriNet.Arc#getLinkToPlace()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_LinkToPlace();

	/**
	 * Returns the meta object for the reference '{@link petriNet.Arc#getLinkToTransition <em>Link To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link To Transition</em>'.
	 * @see petriNet.Arc#getLinkToTransition()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_LinkToTransition();

	/**
	 * Returns the meta object for the attribute '{@link petriNet.Arc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petriNet.Arc#getName()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Name();

	/**
	 * Returns the meta object for enum '{@link petriNet.LinkDirection <em>Link Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Direction</em>'.
	 * @see petriNet.LinkDirection
	 * @generated
	 */
	EEnum getLinkDirection();

	/**
	 * Returns the meta object for enum '{@link petriNet.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arc Type</em>'.
	 * @see petriNet.ArcType
	 * @generated
	 */
	EEnum getArcType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriNetFactory getPetriNetFactory();

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
		 * The meta object literal for the '{@link petriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PetriNetImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Net Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__NET_ELEMENTS = eINSTANCE.getPetriNet_NetElements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET__NAME = eINSTANCE.getPetriNet_Name();

		/**
		 * The meta object literal for the '{@link petriNet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.PlaceImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__ARCS = eINSTANCE.getPlace_Arcs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '{@link petriNet.impl.NetElementImpl <em>Net Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.NetElementImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getNetElement()
		 * @generated
		 */
		EClass NET_ELEMENT = eINSTANCE.getNetElement();

		/**
		 * The meta object literal for the '{@link petriNet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.TransitionImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ARCS = eINSTANCE.getTransition_Arcs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link petriNet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.impl.ArcImpl
		 * @see petriNet.impl.PetriNetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '<em><b>Arc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__ARC_TYPE = eINSTANCE.getArc_ArcType();

		/**
		 * The meta object literal for the '<em><b>Link Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__LINK_DIRECTION = eINSTANCE.getArc_LinkDirection();

		/**
		 * The meta object literal for the '<em><b>Link To Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__LINK_TO_PLACE = eINSTANCE.getArc_LinkToPlace();

		/**
		 * The meta object literal for the '<em><b>Link To Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__LINK_TO_TRANSITION = eINSTANCE.getArc_LinkToTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__NAME = eINSTANCE.getArc_Name();

		/**
		 * The meta object literal for the '{@link petriNet.LinkDirection <em>Link Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.LinkDirection
		 * @see petriNet.impl.PetriNetPackageImpl#getLinkDirection()
		 * @generated
		 */
		EEnum LINK_DIRECTION = eINSTANCE.getLinkDirection();

		/**
		 * The meta object literal for the '{@link petriNet.ArcType <em>Arc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petriNet.ArcType
		 * @see petriNet.impl.PetriNetPackageImpl#getArcType()
		 * @generated
		 */
		EEnum ARC_TYPE = eINSTANCE.getArcType();

	}

} //PetriNetPackage
