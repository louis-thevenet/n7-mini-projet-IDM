/*
 * generated by Xtext 2.32.0
 */
package fr.n7;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.pDL2.PDL2Package;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class PDL2StandaloneSetupGenerated implements ISetup {

  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    TerminalsStandaloneSetup.doSetup();

    Injector injector = createInjector();
    register(injector);
    return injector;
  }

  public Injector createInjector() {
    return Guice.createInjector(new PDL2RuntimeModule());
  }

  public void register(Injector injector) {
    if (!EPackage.Registry.INSTANCE.containsKey("http://www.n7.fr/PDL2")) {
      EPackage.Registry.INSTANCE.put("http://www.n7.fr/PDL2", PDL2Package.eINSTANCE);
    }
    IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
    IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);

    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("pdl2", resourceFactory);
    IResourceServiceProvider.Registry.INSTANCE
        .getExtensionToFactoryMap()
        .put("pdl2", serviceProvider);
  }
}
