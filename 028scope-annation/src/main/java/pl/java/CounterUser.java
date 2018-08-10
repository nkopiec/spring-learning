package pl.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterUser {

	@Autowired
	private Prototype prototype1;
	@Autowired
	private Prototype prototype2;
	@Autowired
	private Singleton singleto1;
	@Autowired
	private Singleton singleto2;
	public Prototype getPrototype1() {
		return prototype1;
	}
	
	public Prototype getPrototype2() {
		return prototype2;
	}
	
	public Singleton getSingleto1() {
		return singleto1;
	}
	
	public Singleton getSingleto2() {
		return singleto2;
	}
	
	
	
}
