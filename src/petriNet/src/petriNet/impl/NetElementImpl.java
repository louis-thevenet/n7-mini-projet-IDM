/** */
package petriNet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import petriNet.NetElement;
import petriNet.PetriNetPackage;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NetElementImpl extends MinimalEObjectImpl.Container implements NetElement {
  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected NetElementImpl() {
    super();
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return PetriNetPackage.Literals.NET_ELEMENT;
  }
} // NetElementImpl
