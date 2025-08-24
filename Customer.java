

public record Customer(Integer custId,String custName,String pickupLocation,String dropLocation,Double distance,Long phone)
{
	 public Customer
	 {
		 try
		 {
		 if(custId <=0)
		 {
			 throw new IllegalArgumentException("Customer ID must be positive.");
		 }
		 if(custName.isBlank() || custName.isEmpty()|| custName == null)
		 {
			 throw new IllegalArgumentException("Customer name cannot be null or blank.");
		 }
		 if(pickupLocation.isBlank() || pickupLocation.isEmpty()|| pickupLocation == null)
		 {
			 throw new IllegalArgumentException("Pickup Location  cannot be null or blank.");
		 }
		 if(dropLocation.isBlank() || dropLocation.isEmpty()|| dropLocation == null)
		 {
			 throw new IllegalArgumentException("Drop Location  cannot be null or blank.");
		 }
		 if(distance <=0)
		 {
			 throw new IllegalArgumentException("Distance must be positive.");
		 }
		 if(phone<=0 && phone>10)
		 {
			 throw new IllegalArgumentException("Phone numbermust be 10 digits only.");
		 }
		 }
		 catch(IllegalArgumentException e)
		 {
			 System.err.println(e.getMessage());
			 System.exit(0);
		 } 
	 }
}

