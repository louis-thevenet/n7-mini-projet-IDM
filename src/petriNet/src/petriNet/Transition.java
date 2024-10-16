/** */
package petriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Transition#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petriNet.Transition#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.Transition#getTempsMin <em>Temps Min</em>}</li>
 *   <li>{@link petriNet.Transition#getTempsMax <em>Temps Max</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NetElement {
  /**
	 * Returns the value of the '<em><b>Arcs</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getLinkToTransition <em>Link To Transition</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' reference list.
	 * @see petriNet.PetriNetPackage#getTransition_Arcs()
	 * @see petriNet.Arc#getLinkToTransition
	 * @model opposite="linkToTransition"
	 * @generated
	 */
  EList<Arc> getArcs();

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link petriNet.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

		/**
	 * Returns the value of the '<em><b>Temps Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Min</em>' attribute.
	 * @see #setTempsMin(int)
	 * @see petriNet.PetriNetPackage#getTransition_TempsMin()
	 * @model
	 * @generated
	 */
	int getTempsMin();

		/**
	 * Sets the value of the '{@link petriNet.Transition#getTempsMin <em>Temps Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Min</em>' attribute.
	 * @see #getTempsMin()
	 * @generated
	 */
	void setTempsMin(int value);

		/**
	 * Returns the value of the '<em><b>Temps Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Max</em>' attribute.
	 * @see #setTempsMax(int)
	 * @see petriNet.PetriNetPackage#getTransition_TempsMax()
	 * @model
	 * @generated
	 */
	int getTempsMax();

		/**
	 * Sets the value of the '{@link petriNet.Transition#getTempsMax <em>Temps Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Max</em>' attribute.
	 * @see #getTempsMax()
	 * @generated
	 */
	void setTempsMax(int value);
} // Transition
