package gov.nist.hla.ii;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReceiveInjection extends InterObjInjectionImpl {

	private static final Logger log = LogManager.getLogger(ReceiveInjection.class);

	InjectionFederate federate;

	public ReceiveInjection(InjectionFederate federate) {
		super();
		this.federate = federate;
	}
}
