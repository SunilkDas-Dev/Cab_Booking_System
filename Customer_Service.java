

import java.util.ArrayList;

public class Customer_Service
{
	
private ArrayList<Customer> customers ;

public Customer_Service() {
	super();
	this.customers = new ArrayList<Customer>();
}
		
public void addCustomer(Customer customer)
{
			customers.add(customer);
			
	}
		
		

	private boolean isFirstCustomer(Customer customer)
	{
		for(Customer cust : customers)
		{
			if(cust.phone().equals(customer.phone()))
			{
				return false;
		}
			
			
		}
		return true ;
		
	}
	public double calculateBill(Customer customer)
	{
		if(isFirstCustomer(customer))
		{
			
			return 0.0;
		}
		 if(customer.distance()<=4)
		{
			return 80;
		}
		
			return 80+(customer.distance()-4)*6;
			
		
	}
	public String printBill(Customer customer)
	{
		
		double bill = calculateBill(customer);
		addCustomer(customer);
		if(bill==0.0)
		{
			 return customer.custName()+" First ride free";
			
		}
		return customer.custName()+" Please pay your bill Rs. "+bill;
	}
	

	

}
