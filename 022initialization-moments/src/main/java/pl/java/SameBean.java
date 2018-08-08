package pl.java;

import org.springframework.beans.factory.InitializingBean;

public class SameBean implements InitializingBean{

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization!");
	}

}
