package pl.java;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SameBean implements BeanNameAware, ApplicationContextAware{
	private String name;
	private ApplicationContext applicationContext;
	
	public void setBeanName(String name) {
		this.name = name;
	}
	
	public void init() {
		Map<String, SameBean> beansOfType = applicationContext.getBeansOfType(SameBean.class);
		System.out.println("Bean's name: " + name + " beans quality: " + beansOfType.size());
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
