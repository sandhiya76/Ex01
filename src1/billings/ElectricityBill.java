package billings;

import java.util.Scanner;

public class ElectricityBill{
		private long customernumber;
		private String customername;
		private double previousmonthreadings;
		private String customertype;
		private int currentmonthreadings;
		
		/***
		 * To create sale bill with initial values
		 */
		public ElectricityBill ()
		{
			this.customernumber=1000;
			this.customername="unknown";
			this.previousmonthreadings=10;
			this.customertype="user";
			this.currentmonthreadings=0;
		}
		
		
		public ElecricityBill(long number,String name,int units,String type,int qty)
		{
			this.customernumber=number;
			this.customername=name;
			previousmonthreadings=units;
			customertype=type;
			currentmonthreadings= units;
		}
		
		/***
		 * To get billing information from the user
		 */
		public void getData()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.printf("\n%40s","BILLING INFORMATION");
			System.out.print("\nEnter the customer number:");
			this.customernumber=sc.nextLong();
			System.out.print("Enter the customer name:");
			customername= sc.next();
			System.out.print("Enter the previous month readings:");
			previousmonthreadings=sc.nextDouble();
			System.out.print("Enter the customer type (domestic or comercial):");
			customertype=sc.next();
			System.out.println("current month readings:");
			currentmonthreadings=sc.nextInt();
			
		}
		
		/*****
		 * To print the bill details
		 */
		public void printData()
		{
			System.out.printf("%-40s%40s\n", "Customer Number:"+customernumber,"CustomerName:"+customername);
			System.out.printf("%s%8.2f %-16s %40s\n", "Previous month readings:",previousmonthreadings,"Watts","CustomerType:"+customertype);
			System.out.printf("%-40s", "current month readings:"+currentmonthreadings);
		}
		
		/***
		 * To calculate the bill amount
		 */
		public void computeBillAmount()
		{
			double totalAmount=-1;
			unitconsumed=currentmonthreadings-previousmonthreadings
			String divider="---------------------------------------------------------------------------------";
			
			if(customertype.equals("domestic"))
			{
				if((unitconsumed>=0)&& (unitconsumed<=100))
				{
					totalAmount=unitconsumed*1.0;
				}else if((unitconsumed>=101)&&(unitconsumed<=200))
				{
					totalAmount=unitconsumed*2.50;
				}else if((unitconsumed>=201)&&(unitconsumed<=500))
				{
					totalAmount=unitconsumed*4.0;
				}else
				{
					
					
					totalAmount=unitconsumed*6.0;
				}
			}else if(customertype.equals("comercial"))
			{
				if((unitconsumed>=0)&& (unitconsumed<=100))
				{
					totalAmount=unitconsumed*2.0;
				}else if((unitconsumed>=101)&&(unitconsumed<=200))
				{
					totalAmount=unitconsumed*4.50;
				}else if((unitconsumed>=201)&&(unitconsumed<=500))
				{
					totalAmount=unitconsumed*6.0;
				}else
				{
					totalAmount=unitconsumed*7.0;
				}			
			}	
			System.out.print("\n"+divider+"\n");
			System.out.printf("%40s", "ELECTRICITY BILL");
			System.out.print("\n"+divider+"\n");
			this.printData();
			System.out.printf("%29s%8.2f Rs", "Total Amount:",totalAmount);
			System.out.print("\n"+divider+"\n");
		}
	}



