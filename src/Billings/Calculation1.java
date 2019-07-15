package Billings;
public class Calculation1 
{
public static void main(String[] args) 
	 	{
	 		Ebill bill1,bill2;
	 		
	 		bill1=new Ebill(2001,"Kamal",0,0,"Domestic");
	 		bill1.printData();
	 		bill2=new Ebill();
	 		bill2.getData();
	 		bill1.computeBillAmount();
	 		bill2.computeBillAmount();
	 	}

	 }


	


