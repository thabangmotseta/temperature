import java.util.Scanner;
class KelvintoCelsius
{
	double celsius(double f)
	{	
	return  (f-273.15);
	}
	public static void main(String arg[])	
	{
	    double a,c;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter Kelvin temperature");
                   a=sc.nextDouble();
	    KelvintoCelsius fah=new KelvintoCelsius( );
	    double result=fah.celsius(a);	
	    System.out.println("Celsius temperature is = "+result);		  	  	     
	} 	
}