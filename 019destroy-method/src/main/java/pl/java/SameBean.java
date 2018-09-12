package pl.java;

import org.springframework.beans.factory.DisposableBean;

public class SameBean implements DisposableBean{
	public void destroyMathod() {
		System.out.println("Destroy beans");
	}
	public void toWorking() {
		System.out.println("Do!");
	}
	public void destroy() throws Exception {
		System.out.println("Destroy with disposableBean");
		
	}
}
