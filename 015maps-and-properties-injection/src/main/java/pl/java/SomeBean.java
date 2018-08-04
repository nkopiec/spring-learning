package pl.java;

import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class SomeBean {
	private Map<String, Locale> locale;
	private Properties getString;
	
	public Map<String, Locale> getLocale() {
		return locale;
	}
	public void setLocale(Map<String, Locale> locale) {
		this.locale = locale;
	}
	public Properties getGetString() {
		return getString;
	}
	public void setGetString(Properties getString) {
		this.getString = getString;
	}
	
	
}
