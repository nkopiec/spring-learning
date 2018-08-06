package pl.java;

import org.springframework.beans.factory.InitializingBean;

public class SameBeans implements InitializingBean {
	public void init() {
		System.out.println("Inicjalization beans");
	}
	
	public void checkIsWorking() {
		System.out.println("I doing !");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Do afterPropertiesSet");
		
	}
}
