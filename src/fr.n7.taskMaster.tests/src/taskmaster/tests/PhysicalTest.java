/**
 */
package taskmaster.tests;

import junit.textui.TestRunner;

import taskmaster.Physical;
import taskmaster.TaskmasterFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhysicalTest extends RequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhysicalTest.class);
	}

	/**
	 * Constructs a new Physical test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Physical test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Physical getFixture() {
		return (Physical)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TaskmasterFactory.eINSTANCE.createPhysical());
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

} //PhysicalTest
