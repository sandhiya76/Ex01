/*****
 * package for representing billing information
 * developed by N.pavithra
 * student,saveetha engineering college,
 * 
 * npavithra1405@gmail.com
 */
package billings;
import java.util.Scanner;

/****
 * Class to represent generating of ElectricityBill
 * 
 * @author pavithra
 *
 */
public class ElectricityBill {
 
  private long consumernumber;
  private String consumername;
  private double previousmonthreading ;
  private double presentmonthreading;
  private String connectiontype;

/***
 * To create  ElectricityBill with initial values
 */
public  ElectricityBill ()
{
	this.consumernumber=1000;
	this.consumername="unknown";
	this.previousmonthreading=10;
	this.presentmonthreading=10;
	this.connectiontype="domestic";
}
/***
 * 
 * @param number  Customer number like 1001 etc
 * @param name Cunsumer name
 * @param reading ElectricityBill previousmonthreading in units
 * @param reading ElectricityBill presentmonthreading in units
 * @param type connectiontype
 */
public ElectricityBill(long number,String name,double reading,double reading,string type)
{
	this.consumernumber=number;
	this.consumername=name;
	previousmonthreading=reading;
	presentmonthreading=reading;
	connectiontype=type;
}

	 
		/***
		 * To get billing information from the user
		 */
		public void getData()
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.printf("\n%40s","BILLING INFORMATION");
			System.out.print("\nEnter the  consumernumber:");
			this.consumernumber=sc.nextLong();
			System.out.print("Enter the consumer name:");
			consumername= sc.next();
			System.out.print("Enter the previousmonthreading in units:");
			previousmonthreading=sc.nextDouble();
			System.out.print("Enter the presentmonthreading in units:");
			presentmonthreading=sc.nextDouble();
			System.out.println("what is connection type:");
			connectiontype=sc.next();
			
		}

}

