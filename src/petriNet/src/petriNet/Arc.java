/** */
package petriNet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Arc#getWeight <em>Weight</em>}</li>
 *   <li>{@link petriNet.Arc#getArcType <em>Arc Type</em>}</li>
 *   <li>{@link petriNet.Arc#getLinkDirection <em>Link Direction</em>}</li>
 *   <li>{@link petriNet.Arc#getLinkToPlace <em>Link To Place</em>}</li>
 *   <li>{@link petriNet.Arc#getLinkToTransition <em>Link To Transition</em>}</li>
 *   <li>{@link petriNet.Arc#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends NetElement {
  /**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see petriNet.PetriNetPackage#getArc_Weight()
	 * @model default="1"
	 * @generated
	 */
  int getWeight();

  /**
	 * Sets the value of the '{@link petriNet.Arc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
  void setWeight(int value);

  /**
	 * Returns the value of the '<em><b>Arc Type</b></em>' attribute.
	 * The literals are from the enumeration {@link petriNet.ArcType}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Arc Type</em>' attribute.
	 * @see petriNet.ArcType
	 * @see #setArcType(ArcType)
	 * @see petriNet.PetriNetPackage#getArc_ArcType()
	 * @model
	 * @generated
	 */
  ArcType getArcType();

  /**
	 * Sets the value of the '{@link petriNet.Arc#getArcType <em>Arc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc Type</em>' attribute.
	 * @see petriNet.ArcType
	 * @see #getArcType()
	 * @generated
	 */
  void setArcType(ArcType value);

  /**
	 * Returns the value of the '<em><b>Link Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link petriNet.LinkDirection}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Direction</em>' attribute.
	 * @see petriNet.LinkDirection
	 * @see #setLinkDirection(LinkDirection)
	 * @see petriNet.PetriNetPackage#getArc_LinkDirection()
	 * @model
	 * @generated
	 */
  LinkDirection getLinkDirection();

  /**
	 * Sets the value of the '{@link petriNet.Arc#getLinkDirection <em>Link Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Direction</em>' attribute.
	 * @see petriNet.LinkDirection
	 * @see #getLinkDirection()
	 * @generated
	 */
  void setLinkDirection(LinkDirection value);

  /**
	 * Returns the value of the '<em><b>Link To Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Place#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Place</em>' reference.
	 * @see #setLinkToPlace(Place)
	 * @see petriNet.PetriNetPackage#getArc_LinkToPlace()
	 * @see petriNet.Place#getArcs
	 * @model opposite="arcs"
	 * @generated
	 */
  Place getLinkToPlace();

  /**
	 * Sets the value of the '{@link petriNet.Arc#getLinkToPlace <em>Link To Place</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Place</em>' reference.
	 * @see #getLinkToPlace()
	 * @generated
	 */
  void setLinkToPlace(Place value);

  /**
	 * Returns the value of the '<em><b>Link To Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Transition#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Transition</em>' reference.
	 * @see #setLinkToTransition(Transition)
	 * @see petriNet.PetriNetPackage#getArc_LinkToTransition()
	 * @see petriNet.Transition#getArcs
	 * @model opposite="arcs"
	 * @generated
	 */
  Transition getLinkToTransition();

  /**
	 * Sets the value of the '{@link petriNet.Arc#getLinkToTransition <em>Link To Transition</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Transition</em>' reference.
	 * @see #getLinkToTransition()
	 * @generated
	 */
  void setLinkToTransition(Transition value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getArc_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link petriNet.Arc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);
} // Arc
