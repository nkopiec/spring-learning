package pl.java;

public interface CustomerRepository {
	 Customer getCustomer(long CustomerID);
	 String getCustomerName(long CustomerID);
	 void addCustomer(Customer customer);
}
