/***
 * package for representing billing information
 * 
 * Developed by A.sandhiya
 *Student,Saveetha Engineering College.
 *
 *www.sandhiyasandhiya123@gmail.com
 */

package Billings;

import java.util.Scanner;

import javax.swing.Spring;
/***
 * Class to represent ElectricityBill
 * 
 * @author A.sandhiya
 *
 */

    public class ElectricityBill {
	private long consumerno;
	private String consumername;
	private double previousmonthreadings;
	private String currentmonthreadings;
	private String typeofEBconnection;
	
	/***
	 * To create ElectricityBill with initial values
	 */
	public ElectricityBill()
	{
		this.consumerno=1000;
		this.consumername="unknown";
		this.previousmonthreadings=0;
		this.currentmonthreadings=0;
		this.typeofEBconnection="domestic";
	}
	
	/***
	 * 
	 * @param number  Consumer no like 1001 etc
	 * @param name Consumer name
	 * @param previous month readings in units
	 * @param current month readings in units
	 * @param type of EB connection domestic or commercial
	 */
	public ElectricityBill(long no,String name,double readings,double reading,String  type)
	{
		this.consumerno=no;
		this.consumername=name;
		this.previousmonthreadings=0;
		this.currentmonthreadings=0;
		this.typeofEBconnection="domestic";
	}
	
	/***
	 * To get billing information from the user
	 */
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("\n%40s","BILLING INFORMATION");
		System.out.print("\nEnter the consumer no:");
		this.consumerno=sc.nextLong();
		System.out.print("Enter the consumer name:");
		this.consumername= sc.next();
		System.out.print("Enter the previous month readings:");
		this.previousmonthreadings=sc.nextDouble();
		System.out.print("Enter the EBconnection type (domestic or commercial):");
		this.currentmonthreadings=sc.next();
		System.out.println("Enter the current month readings:");
		this.typeofEBconnection=sc.next(String);
		
	
	/*****
	 * To print the bill details
	 */
	public void printData()
	{
		System.out.printf("%-40s%40s\n", "Consumer no:"+consumerno,"ConsumerName:"+consumername);
		Object readings;
		System.out.printf("%s%8.2f %-16s %40s\n", "Previous month readings:",readings,"units","typeofEBconnection":"+connectiontype);
		System.out.printf("%-40s", "Number LED lamps:"+quantity);
	}
	
	/***
	 * To calculate the bill amount
	 */
	public void computeBillAmount()
	{
		double totalAmount=-1;
		String divider="---------------------------------------------------------------------------------";
		
		if(customertype.equals("user"))
		{
			if((quantity>=0)&& (quantity<=5))
			{
				totalAmount=quantity*250.0;
			}else if((quantity>=6)&&(quantity<=10))
			{
				totalAmount=quantity*230.0;
			}else if((quantity>=11)&&(quantity<=15))
			{
				totalAmount=quantity*215.0;
			}else
			{
				totalAmount=quantity*200.0;
			}
		}else if(customertype.equals("vendor"))
		{
			if((quantity>=0)&& (quantity<=5))
			{
				totalAmount=quantity*230.0;
			}else if((quantity>=6)&&(quantity<=10))
			{
				totalAmount=quantity*210.0;
			}else if((quantity>=11)&&(quantity<=15))
			{
				totalAmount=quantity*195.0;
			}else
			{
				totalAmount=quantity*180.0;
			}			
		}	
		System.out.print("\n"+divider+"\n");
		System.out.printf("%40s", "SALE BILL");
		System.out.print("\n"+divider+"\n");
		this.printData();
		System.out.printf("%35s%10f Rs", "Total Amount:",totalAmount);
		System.out.print("\n"+divider+"\n");
	}
}



public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
