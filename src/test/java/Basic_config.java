import org.apache.log4j.Logger;

public class Basic_config {

	static Logger logg = Logger.getLogger(Basic_config.class);
	
	public static void main(String[] args) {

	
	logg.debug("Debug");
	logg.info("info");
	logg.warn("Warning");
	logg.error("Error");
	logg.fatal("fatal");
	}
}
