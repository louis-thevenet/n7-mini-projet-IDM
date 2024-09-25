/**
 */
package petriNet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see petriNet.PetriNetPackage#getLinkType()
 * @model
 * @generated
 */
public enum LinkType implements Enumerator {
	/**
	 * The '<em><b>Place To Transition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_TO_TRANSITION_VALUE
	 * @generated
	 * @ordered
	 */
	PLACE_TO_TRANSITION(0, "placeToTransition", "placeToTransition"),

	/**
	 * The '<em><b>Transition To Place</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSITION_TO_PLACE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITION_TO_PLACE(1, "transitionToPlace", "transitionToPlace");

	/**
	 * The '<em><b>Place To Transition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLACE_TO_TRANSITION
	 * @model name="placeToTransition"
	 * @generated
	 * @ordered
	 */
	public static final int PLACE_TO_TRANSITION_VALUE = 0;

	/**
	 * The '<em><b>Transition To Place</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSITION_TO_PLACE
	 * @model name="transitionToPlace"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITION_TO_PLACE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LinkType[] VALUES_ARRAY =
		new LinkType[] {
			PLACE_TO_TRANSITION,
			TRANSITION_TO_PLACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LinkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Link Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LinkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Link Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LinkType get(int value) {
		switch (value) {
			case PLACE_TO_TRANSITION_VALUE: return PLACE_TO_TRANSITION;
			case TRANSITION_TO_PLACE_VALUE: return TRANSITION_TO_PLACE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LinkType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LinkType
