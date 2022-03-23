import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Confg_log {

	static Logger logg =Logger.getLogger(Confg_log.class);
	
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");

		logg.debug("Debug");
		logg.info("info");
		logg.warn("Warning");
		logg.error("Error");
		logg.fatal("fatal");
		
		
		
	}
	
	
}
