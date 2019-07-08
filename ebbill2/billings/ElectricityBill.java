package billings;

public class ElectricityBill {
	private long consumernumber;
	private String consumername;
	private int previousmonthreading;
	private int currentmonthreading;
	private String consumertype;
	
	public ElectricityBill()
	{
		this.consumernumber=5036;
		this.consumername="unknown";
		this.previousmonthreading=305;
		this.currentmonthreading=405;
		this.consumertype="domestic";
	}
	public ElectricityBill(long number,String name,int previous,int current,String type)
	{
		this.consumernumber=number;
		this.consumername=name;
		previousmonthreading=previous;
		currentmonthreading=current;
		consumertype=type;
	}
		
	public void getData()
	{
	    Scanner sc=new Scanner(System.in);

	System.out.printf("\n%40s","BILLING INFORMATION");
	System.out.print("\nEnter the consumer number:");
	this.consumermernumber=sc.nextLong();
	System.out.print("Enter the consumer name:");
	consumerrname= sc.next();
	System.out.print("Enter the power rating in watts:");
	powerrating=sc.nextDouble();
	System.out.print("Enter the consumer type (domestic or commercial):");
	customertype=sc.next();
	System.out.println("How many LED lamps:");
	quantity=sc.nextInt();
	
}
	
	
	}
	}

}
