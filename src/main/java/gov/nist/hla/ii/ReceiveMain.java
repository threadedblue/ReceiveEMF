package gov.nist.hla.ii;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.sds4emf.AbstractSerializeDeserialize;
import littleints.LittleintsPackage;
import littleints.moreInts.MoreIntsPackage;

public class ReceiveMain {

	private static final Logger log = LogManager.getLogger(ReceiveMain.class);

	public static void main(String[] args) {
		if (args.length != 1) {
			log.error("command line argument for properties file not specified");
			args = new String[1];
			args[0] = "config.properties";
		}

		try {
			// We have to register all the packages we intent to use.
			AbstractSerializeDeserialize.registerPackage(LittleintsPackage.eNS_URI, LittleintsPackage.eINSTANCE);
			AbstractSerializeDeserialize.registerPackage(MoreIntsPackage.eNS_URI, MoreIntsPackage.eINSTANCE);
			InjectionFederate app = new InjectionFederate();
			app.loadConfiguration(args[0]);
			
			// Set the injection and reception here.
			ReceiveInjection inj = new ReceiveInjection(app);
			app.setInterObjectInjection(inj);
			ReceiveReception recp = new ReceiveReception();
			app.setInterObjectReception(recp);
			ReceiveHook hook = new ReceiveHook();
			app.setTimeStepHook(hook);
			app.init();
			app.run();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

}
