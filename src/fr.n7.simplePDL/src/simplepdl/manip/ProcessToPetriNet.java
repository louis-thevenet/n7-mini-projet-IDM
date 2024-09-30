package simplepdl.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petriNet.*;
import simplepdl.Guidance;
import simplepdl.Process;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
import simplepdl.validation.SimplePDLValidator;

public class ProcessToPetriNet {

	static Process load_process_model(String modelPath) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();
		
		// Charger la ressource (notre modÃ¨le)
		URI modelURI = URI.createURI(modelPath);
		System.out.println(modelPath);
		Resource resource = resSet.getResource(modelURI, true);
		
		// RÃ©cupÃ©rer le premier Ã©lÃ©ment du modÃ¨le (Ã©lÃ©ment racine)
		return (Process) resource.getContents().get(0);
	}
	
	
	public static void main(String... args) {
		// Chargement des packages afin de les enregistrer dans le registre d'Eclipse.
		PetriNetPackage petriNetPackageInstance = PetriNetPackage.eINSTANCE;
		SimplepdlPackage simplePDLPackageInstance = SimplepdlPackage.eINSTANCE;

		// ******************
		// Load Process from args
		// ******************
		Process process = load_process_model(args[0]);
		
		// ******************
		// Create new PetriNet
		// ******************

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
						
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modÃ¨le)
		ResourceSet resSet = new ResourceSetImpl();
		// DÃ©finir la ressource (le modÃ¨le)
		URI modelURI = URI.createURI("models/ProcessToPetriNet.xmi");
		Resource resource = resSet.createResource(modelURI);
		
		// La fabrique pour fabriquer les Ã©lÃ©ments de PetriNet
		PetriNetFactory petriNetFactory = PetriNetFactory.eINSTANCE;

		PetriNet net = petriNetFactory.createPetriNet();
		resource.getContents().add(net);

		net.setName(process.getName());
		
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				
				var netElements = net.getNetElements();
				
				Place ready =petriNetFactory.createPlace();
				ready.setName(wd.getName() + "_ready");
				
				Place started =petriNetFactory.createPlace();
				ready.setName(wd.getName() + "_started");
				
				Place running =petriNetFactory.createPlace();
				ready.setName(wd.getName() + "_running");
				
				Place finished =petriNetFactory.createPlace();
				ready.setName(wd.getName() + "_finished");
				
				Transition start = petriNetFactory.createTransition();
				start.setName(wd.getName() + "_start");
				
				Transition finish = petriNetFactory.createTransition();
				start.setName(wd.getName() + "_finish");
				
				netElements.add(ready);
				netElements.add(started);
				netElements.add(running);
				netElements.add(finished);
				
				netElements.add(start);
				netElements.add(finish);
			}
			
		}
		
		for (Object processObject : process.getProcessElements()) {
			if (processObject instanceof WorkSequence) {
				WorkSequence ws =(WorkSequence) processObject;

				String pred = ws.getPredecessor().getName();
				String next = ws.getSuccessor().getName();
				
				Arc arc = petriNetFactory.createArc();
				arc.setArcType(ArcType.READ_ARC);
				arc.setLinkDirection(LinkDirection.PLACE_TO_TRANSITION);
					
				for (Object netObject : net.getNetElements()) {
					if (netObject instanceof Place) {
						Place place = (Place)netObject;
						if (place.getName() == pred) {
							arc.setLinkToPlace(place);
						}

					}
					if (netObject instanceof Transition) {
						Transition transition = (Transition) netObject;
						if (transition.getName() == next) {
							arc.setLinkToTransition(transition);
						}

					}
				}
				net.getNetElements().add(arc);
			}
		}
		
		try {
	    	resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
