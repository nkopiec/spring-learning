package pl.java;

public class CustomerRepositoryImpl implements CustomerRepository {

	public Customer getCustomer(long CustomerID) {
		return null;
	}

	public String getCustomerName(long CustomerID) {
		return "Janek";
	}
	
	public void addCustomer(Customer customer) {
		if (customer.getName() == null) {
			throw new RuntimeException("Customer name can'y be null");
		}
	System.out.println("Customer saved");
	}

}
