package practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Demo {
	
	 
	
	public static Logger logger= LogManager.getLogger(Log4j2Demo.class);
	public static void main(String[]args) {
		
		
		System.out.println("/n   .... print logger... /n");
		logger.info("logging success");
		logger.error("It is an error");
		logger.fatal("Fatal error");
		logger.warn("it is warning");
		System.out.println("/n completed");
		
	}
	
	

}
