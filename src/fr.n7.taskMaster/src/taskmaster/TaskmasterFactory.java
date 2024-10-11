/** */
package taskmaster;

import org.eclipse.emf.ecore.EFactory;

/**
 *
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the
 * model.
 * <!-- end-user-doc -->
 *
 * @see taskmaster.TaskmasterPackage
 * @generated
 */
public interface TaskmasterFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  TaskmasterFactory eINSTANCE = taskmaster.impl.TaskmasterFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Event Bundle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Event Bundle</em>'.
   * @generated
   */
  EventBundle createEventBundle();

  /**
   * Returns a new object of class '<em>Supply</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Supply</em>'.
   * @generated
   */
  Supply createSupply();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Causal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Causal</em>'.
   * @generated
   */
  Causal createCausal();

  /**
   * Returns a new object of class '<em>Physical</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return a new object of class '<em>Physical</em>'.
   * @generated
   */
  Physical createPhysical();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @return the package supported by this factory.
   * @generated
   */
  TaskmasterPackage getTaskmasterPackage();
} // TaskmasterFactory
