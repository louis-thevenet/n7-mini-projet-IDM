/*
 * generated by Xtext 2.32.0
 */
package fr.n7.ui.tests;

import com.google.inject.Injector;
import fr.n7.pdl3.ui.internal.Pdl3Activator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class PDL3UiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return Pdl3Activator.getInstance().getInjector("fr.n7.PDL3");
	}

}
