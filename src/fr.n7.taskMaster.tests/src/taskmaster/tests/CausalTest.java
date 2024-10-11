/**
 */
package taskmaster.tests;

import junit.textui.TestRunner;

import taskmaster.Causal;
import taskmaster.TaskmasterFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Causal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CausalTest extends RequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CausalTest.class);
	}

	/**
	 * Constructs a new Causal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CausalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Causal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Causal getFixture() {
		return (Causal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskmasterFactory.eINSTANCE.createCausal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CausalTest
