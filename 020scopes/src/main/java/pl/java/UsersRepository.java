package pl.java;

public class UsersRepository {
	private static int instance;
	private int instanceNumber = instance++;
	
	public int getInstanceNumber() {
		return instanceNumber;
	}
	public void setInstanceNumber(int instanceNumber) {
		this.instanceNumber = instanceNumber;
	}
	
	
}
