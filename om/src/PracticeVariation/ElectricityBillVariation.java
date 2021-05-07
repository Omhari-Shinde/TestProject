package PracticeVariation;

public class ElectricityBillVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit=130;
		double bill=50;
		if(unit>50)
		{
			
			bill=50*0.5;
			unit=unit-50;
		}
		else
		 {
			bill=unit*0.5;
			unit=0;	
		 }
		
		  
		 if(unit>0)
		{
			if(unit>100)
			{
				bill=bill+(100*0.75);
				unit=unit-100;
						
			}
			else
			{
				bill=bill+(unit*0.75);
				unit=0;
			}
		}
		 if(unit>0)
		 {
			 if(unit>100)
			 {
				 bill=bill+(100*1.2);
				 unit=unit-100;
			 }
			 else
			 {
				 bill=bill+(unit*1.2);
						 unit=0;
			 }
		 }
		 if(unit>0)
		 {
			 bill=bill+(unit*1.5);
		 }
		 
		  bill=bill+(bill*20)/100;
		 System.out.println(bill);

	}

}
