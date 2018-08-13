package pl.java;

import java.util.logging.Logger;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Somebean implements InitializingBean, DisposableBean {
	private Logger logger = Logger.getLogger(Somebean.class.getName());
	
	public void destroy() throws Exception {
		logger.info("destroy");
		
	}

	public void afterPropertiesSet() throws Exception {
		logger.info("afterPropertiesSet");
		
	}

}
