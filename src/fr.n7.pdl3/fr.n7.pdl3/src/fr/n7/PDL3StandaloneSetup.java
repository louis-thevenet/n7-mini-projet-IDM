/*
 * generated by Xtext 2.32.0
 */
package fr.n7;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class PDL3StandaloneSetup extends PDL3StandaloneSetupGenerated {

	public static void doSetup() {
		new PDL3StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
