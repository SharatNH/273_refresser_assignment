package demo.interfaces.demo1;

public class taxcompute implements Cartax
{

	public double nettax(double mrp,double roadtax,String type)
	{
		if(type.matches("SUV"))
		{
			return mrp+roadtax+((mrp*15)/100);
		}
		else if(type.matches("sedan") )
		{
			return mrp+roadtax+((mrp*10)/100);
		}
		else 
		{
			return mrp+roadtax+((mrp*8)/100);
		}
	}
	
	public static void main(String[] args) 
	{
		taxcompute car = new taxcompute();
		System.out.println("Total cost of SUV worth 18lakhs  after taxes tax : " + car.nettax(1800000,80000,"SUV"));
		System.out.println("Total cost of Sedan worth 9 lakhs  after taxes tax : " + car.nettax(900000,55000, "sedan"));
	}

	
	
}

