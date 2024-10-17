/** */
package petriNet.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import petriNet.PetriNetPackage;
import petriNet.Place;

/**
 * This is the item provider adapter for a {@link petriNet.Place} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PlaceItemProvider extends NetElementItemProvider {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public PlaceItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addTokensPropertyDescriptor(object);
      addArcsPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Tokens feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected void addTokensPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(
        createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_Place_tokens_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_Place_tokens_feature", "_UI_Place_type"),
            PetriNetPackage.Literals.PLACE__TOKENS,
            true,
            false,
            false,
            ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
            null,
            null));
  }

  /**
   * This adds a property descriptor for the Arcs feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected void addArcsPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(
        createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_Place_arcs_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_Place_arcs_feature", "_UI_Place_type"),
            PetriNetPackage.Literals.PLACE__ARCS,
            true,
            false,
            true,
            null,
            null,
            null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add(
        createItemPropertyDescriptor(
            ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
            getResourceLocator(),
            getString("_UI_Place_name_feature"),
            getString(
                "_UI_PropertyDescriptor_description", "_UI_Place_name_feature", "_UI_Place_type"),
            PetriNetPackage.Literals.PLACE__NAME,
            true,
            false,
            false,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
            null,
            null));
  }

  /**
   * This returns Place.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Place"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((Place) object).getName();
    return label == null || label.length() == 0
        ? getString("_UI_Place_type")
        : getString("_UI_Place_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(Place.class)) {
      case PetriNetPackage.PLACE__TOKENS:
      case PetriNetPackage.PLACE__NAME:
        fireNotifyChanged(
            new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
   * can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }
}
