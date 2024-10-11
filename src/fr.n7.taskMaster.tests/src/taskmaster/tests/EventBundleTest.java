/** */
package taskmaster.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import taskmaster.EventBundle;
import taskmaster.TaskmasterFactory;

/**
 *
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Bundle</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EventBundleTest extends TestCase {

  /**
   * The fixture for this Event Bundle test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected EventBundle fixture = null;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public static void main(String[] args) {
    TestRunner.run(EventBundleTest.class);
  }

  /**
   * Constructs a new Event Bundle test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public EventBundleTest(String name) {
    super(name);
  }

  /**
   * Sets the fixture for this Event Bundle test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected void setFixture(EventBundle fixture) {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Event Bundle test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected EventBundle getFixture() {
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
    setFixture(TaskmasterFactory.eINSTANCE.createEventBundle());
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
} // EventBundleTest
