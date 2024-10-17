/** */
package simplepdl.tests;

import junit.textui.TestRunner;
import simplepdl.ResourceUsage;
import simplepdl.SimplepdlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceUsageTest extends ProcessElementTest {

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args) {
		TestRunner.run(ResourceUsageTest.class);
	}

  /**
	 * Constructs a new Resource Usage test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ResourceUsageTest(String name) {
		super(name);
	}

  /**
	 * Returns the fixture for this Resource Usage test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ResourceUsage getFixture() {
		return (ResourceUsage)fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception {
		setFixture(SimplepdlFactory.eINSTANCE.createResourceUsage());
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
} // ResourceUsageTest
