

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cab_Service_System 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		Customer_Service cs =new Customer_Service();

		System.out.println("Hello Sir/Ma'am  Welcome To OLA Cab Service Hyderabad\n");
		System.out.println("Click 'Y' for Book The cab"
				+ "\n Or 'N' gor Cancellation the Cab\n");
		while(true)
		{
			System.out.print("Are you Booking any Cab Right Now : ");
			String input = sc.nextLine();
			char choice = input.toUpperCase().charAt(0);
			
			try 
			{
			if(choice=='Y')
			{
				System.out.print("Enter your ID please :");
				int id =Integer.parseInt(sc.nextLine());
				
				System.out.print("Enter your name Please :");
				String name = sc.nextLine();
				
				System.out.print("Enter your Pick-up point :");
				String pick = sc.nextLine();
				
				System.out.print("Enter Your Drop point :");
				String drop = sc.nextLine();
				
				System.out.print("Please specify your Total Distance :");
				double distance = Double.parseDouble(sc.nextLine());
				
				System.out.print("Enter Your Contact Number Please :-");
				long phNo = Long.parseLong(sc.nextLine());
				
				Customer c1 = new Customer(id, name, pick, drop, distance, phNo);
				
				
				System.out.println(cs.printBill(c1));
				
			}
		
			else if(choice == 'N')
			{
				System.out.println("Thanks For Visiting The OLA Service .....");
				System.exit(0);
			}
			else 
			{
				System.err.println("invalid Choice sir ... Choose 'Y'  or 'N' please for service");
				
			}
			Thread.sleep(1500);
		
         System.out.print("Would you like to Book Again :");
         input = sc.nextLine();
		 choice = input.toUpperCase().charAt(0);
}
		
			catch(InputMismatchException e)
			{
				
				System.out.println("Try to put proper input sir ");
				System.exit(0);
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			}
		
		}
		
	}

}
