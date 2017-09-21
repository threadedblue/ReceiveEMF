package gov.nist.hla.ii;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import littleints.Int1;
import littleints.LittleintsPackage;

public class ReceiveReception extends InterObjReceptionImpl {

	private static final Logger log = LogManager.getLogger(ReceiveReception.class);

	// We disposition interactions sent elsewhere in the federation. Here we simply
	// log.
	public EObject receiveInteraction(Double timeStep, EObject interaction) {
		log.info(String.format("recd: time=%f interaction=%s", timeStep, interaction));
		return interaction;
	}

	// Same thing for objects.
	@Override
	public void receiveObject(Double timeStep, String objectClassName, String objectName,
			Map<String, byte[]> attributes) {
		log.info(String.format("recd: time=%f object=%s", timeStep, objectClassName));
	}
}
