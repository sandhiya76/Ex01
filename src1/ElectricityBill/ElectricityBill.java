package billings;

import java.util.Scanner;

/****
 * Class to represent ElectricityBill
 * 
 * @author nithish
 *
 */

public class ElectricityBill{
	private long customernumber;
	private String customername;
	private double Previousmonthreadings;
	private double Currentmonthreadings;
	private String Typeofebconnection;
	
	/***
	 * To create ElectricityBill with initial values
	 */
	

	public ElectricityBill(long number,String name,double units,double data,String user)
	{
		this.customernumber=number;
		this.customername=name;
		this.Previousmonthreadings=number;
		this.Currentmonthreadings=number;
		this.Typeofebconnection="user";
		
	}
	
	/***
	 * To get billing information from the user
	 */
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","Electricity Bill");
		System.out.print("\nEnter the customer number:");
		this.customernumber=sc.nextLong();
		System.out.print("Enter the customer name:");
		customername= sc.next();
		System.out.print("Enter Previousmonthreadings :");
		Previousmonthreadings=sc.nextDouble();
		System.out.print("Enter currentmonthreadings:");
		Currentmonthreadings=sc.nextDouble();
		System.out.print("Enter the customer type (domestic or commercial)");
	
	}
	
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
		System.out.printf("%s%8.2f %-16s %40s\n", "ElectricityBill:",Previousmonthreadings,"units",Currentmonthreadings,"units");
		System.out.printf("%-40s","Typeofebconnection");
	}
	
	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		double totalunits=1;
		

		
		if(Typeofebconnection.equals("Domestic"))
		{
			if((Units>1)&&(Units<=5);
				totalamount=Units*1
			
			
		
		}else if(Typeofebconnection.equals("Commercial")) {
			if((units>1&&(units<=5)));
			totalamount=Units*5
		}
			
		
		
	}
}