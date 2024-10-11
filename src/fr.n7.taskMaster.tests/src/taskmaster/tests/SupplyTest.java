/** */
package taskmaster.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import taskmaster.Supply;
import taskmaster.TaskmasterFactory;

/**
 *
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Supply</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SupplyTest extends TestCase {

  /**
   * The fixture for this Supply test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected Supply fixture = null;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(SupplyTest.class);
  }

  /**
   * Constructs a new Supply test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public SupplyTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Supply test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected void setFixture(Supply fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Supply test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected Supply getFixture() {
    return fixture;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception {
    setFixture(TaskmasterFactory.eINSTANCE.createSupply());
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception {
    setFixture(null);
  }
} // SupplyTest
