package simplepdl.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import petriNet.*;
import simplepdl.Process;
import simplepdl.Resource;
import simplepdl.ResourceUsage;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

public class SimplePDL2PetriNet {

  static Process load_process_model(String modelPath) {
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry reg =
        org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    // CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre
    // modèle)
    ResourceSet resSet = new ResourceSetImpl();

    // Charger la ressource (notre modèle)
    URI modelURI = URI.createURI(modelPath);
    System.out.println(modelPath);
    org.eclipse.emf.ecore.resource.Resource resource = resSet.getResource(modelURI, true);

    // Récupérer le premier élément du modèle (élément racine)
    return (Process) resource.getContents().get(0);
  }

  // Creates a new arc
  static Arc create_arc(
      String name,
      Place place,
      Transition transition,
      ArcType arcType,
      LinkDirection linkDirection,
      int weight) {
    Arc arc = petriNetFactory.createArc();
    arc.setName(name);
    arc.setLinkToPlace(place);
    arc.setLinkToTransition(transition);
    arc.setLinkDirection(linkDirection);
    arc.setArcType(arcType);
    arc.setWeight(weight);
    return arc;
  }

  // Creates a new arc with weight 1
  static Arc create_arc(
      String name,
      Place place,
      Transition transition,
      ArcType arcType,
      LinkDirection linkDirection) {
    return create_arc(name, place, transition, arcType, linkDirection, 1);
  }

  // La fabrique pour fabriquer les éléments de PetriNet
  static PetriNetFactory petriNetFactory = PetriNetFactory.eINSTANCE;

  public static void main(String... args) {
    // Chargement des packages afin de les enregistrer dans le registre d'Eclipse.
    PetriNetPackage petriNetPackageInstance = PetriNetPackage.eINSTANCE;
    SimplepdlPackage simplePDLPackageInstance = SimplepdlPackage.eINSTANCE;

    // ******************
    // Load Process model from args
    // ******************
    Process process = load_process_model(args[0]);

    
    // ************************
    // Create new EMF Resource
    // ************************
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry reg =
        org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());

    ResourceSet resSet = new ResourceSetImpl();
    // Définir la ressource (le modèle)
    URI modelURI = URI.createURI("models/" + process.getName() + ".xmi");
    org.eclipse.emf.ecore.resource.Resource resource = resSet.createResource(modelURI);

    // ******************
    // Create new PetriNet
    // ******************
    PetriNet net = petriNetFactory.createPetriNet();
    resource.getContents().add(net);

    net.setName(process.getName());

    // ******************
    // Transform Resource
    // ******************
    for (Object o : process.getProcessElements()) {
      if (o instanceof Resource) {
        Resource rs = (Resource) o;
        var netElements = net.getNetElements();

        Place rs_pl = petriNetFactory.createPlace();
        rs_pl.setName(rs.getName());
        rs_pl.setTokens(rs.getTotal());
        netElements.add(rs_pl);
      }
    }

    // ************************
    // Transform WorkDefinition
    // ************************
    for (Object o : process.getProcessElements()) {
      if (o instanceof WorkDefinition) {
        WorkDefinition wd = (WorkDefinition) o;

        var netElements = net.getNetElements();

        Place ready = petriNetFactory.createPlace();
        ready.setName(wd.getName() + "_ready");
        ready.setTokens(1);

        Place started = petriNetFactory.createPlace();
        started.setName(wd.getName() + "_started");

        Place running = petriNetFactory.createPlace();
        running.setName(wd.getName() + "_running");

        Place finished = petriNetFactory.createPlace();
        finished.setName(wd.getName() + "_finished");

        Transition start = petriNetFactory.createTransition();
        start.setName(wd.getName() + "_start");

        Transition finish = petriNetFactory.createTransition();
        finish.setName(wd.getName() + "_finish");

        Arc readyToStartArc =
            create_arc(
                wd.getName() + "_ready_to_start",
                ready,
                start,
                ArcType.ARC,
                LinkDirection.PLACE_TO_TRANSITION);
        Arc startToRunningArc =
            create_arc(
                wd.getName() + "_start_to_running",
                running,
                start,
                ArcType.ARC,
                LinkDirection.TRANSITION_TO_PLACE);
        Arc startToStartedArc =
            create_arc(
                wd.getName() + "_start_to_started",
                started,
                start,
                ArcType.ARC,
                LinkDirection.TRANSITION_TO_PLACE);

        Arc runningToFinishArc =
            create_arc(
                wd.getName() + "_running_to_finish",
                running,
                finish,
                ArcType.ARC,
                LinkDirection.PLACE_TO_TRANSITION);
        Arc finishToFinishedArc =
            create_arc(
                wd.getName() + "_finish_to_finished",
                finished,
                finish,
                ArcType.ARC,
                LinkDirection.TRANSITION_TO_PLACE);


        // ************************************************
        // Transform ResourceUsage of this WorkDefinition
        // ************************************************
        for (ResourceUsage rs_usage : wd.getResourceUsed()) {
        	// Look for the actual Resource 
          for (Object netObject : net.getNetElements()) {

            if (netObject instanceof Place
                && ((Place) netObject).getName().equals(rs_usage.getResource().getName())) {

              Place rs_pl = (Place) netObject;

              // Link needed Resource to WorkDefinition
              Arc rsToStartArc =
                  create_arc(
                      wd.getName() + "_start_to_" + rs_usage.getResource().getName(),
                      rs_pl,
                      start,
                      ArcType.ARC,
                      LinkDirection.PLACE_TO_TRANSITION,
                      rs_usage.getNeed());

              Arc finishToRsArc =
                  create_arc(
                      wd.getName() + "_finish_to_" + rs_usage.getResource().getName(),
                      rs_pl,
                      finish,
                      ArcType.ARC,
                      LinkDirection.TRANSITION_TO_PLACE,
                      rs_usage.getNeed());
              finishToRsArc.setWeight(rs_usage.getNeed());

              netElements.add(rsToStartArc);
              netElements.add(finishToRsArc);

              break;
            }
          }
        }

        netElements.add(ready);
        netElements.add(started);
        netElements.add(running);
        netElements.add(finished);

        netElements.add(readyToStartArc);
        netElements.add(startToRunningArc);
        netElements.add(startToStartedArc);

        netElements.add(start);
        netElements.add(finish);
        netElements.add(runningToFinishArc);
        netElements.add(finishToFinishedArc);
      }
    }


    // ***************************
    // Transform WorkWorkSequence
    // ***************************
    for (Object processObject : process.getProcessElements()) {
      if (processObject instanceof WorkSequence) {
        WorkSequence ws = (WorkSequence) processObject;

        // Compute predecessor's name to link it
        String pred = ws.getPredecessor().getName();
        String predNameMatch = "";
        if (ws.getLinkType().getValue() == WorkSequenceType.START_TO_FINISH_VALUE
            || ws.getLinkType().getValue() == WorkSequenceType.START_TO_START_VALUE) {
          predNameMatch = pred + "_started";
        } else {
          predNameMatch = pred + "_finished";
        }
        ;

        // Compute successor's name to link it
        String next = ws.getSuccessor().getName();
        String nextNameMatch = "";
        if (ws.getLinkType().getValue() == WorkSequenceType.START_TO_FINISH_VALUE
            || ws.getLinkType().getValue() == WorkSequenceType.FINISH_TO_FINISH_VALUE) {
          nextNameMatch = next + "_finish";
        } else {
          nextNameMatch = next + "_start";
        }
        
        // Create the read-arc
        Arc arc = petriNetFactory.createArc();
        arc.setArcType(ArcType.READ_ARC);
        arc.setLinkDirection(LinkDirection.PLACE_TO_TRANSITION);
        arc.setName(pred + "To" + next);
        
        // Look for predecessor and successor
        for (Object netObject : net.getNetElements()) {
          if (netObject instanceof Place) {
            Place place = (Place) netObject;

            if (place.getName().contentEquals(predNameMatch)) {
              arc.setLinkToPlace(place);
            }
          }
          if (netObject instanceof Transition) {
            Transition transition = (Transition) netObject;

            if (transition.getName().contentEquals(nextNameMatch)) {
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
