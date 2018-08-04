package pl.java;

public class Addres {
	private String locality;
	private String zipCode;
	private String street;
	private String streetNumer;
	public Addres(String locality, String zipCode, String street, String streetNumer) {
		super();
		this.locality = locality;
		this.zipCode = zipCode;
		this.street = street;
		this.streetNumer = streetNumer;
	}
	@Override
	public String toString() {
		return "Addres [locality=" + locality + ", zipCode=" + zipCode + ", street=" + street + ", streetNumer="
				+ streetNumer + "]";
	}
	
	
}
