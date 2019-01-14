package code_1;

public class Newclass_1 {
	
	public Newclass_1(){
		
	}
	/*
	 * This function print Hello world!!!!
	 */
	public String helloWorld(){
		return "Hello world!!!!";
	}
	public double converter(double amount, String symbol){
		
		double total = 0;
		if(symbol == "CAD")
		{
			total = amount * (1.25);
		}
		else if(symbol == "USD")
		{
			total = amount * (0.75);
		}
		else{
			total = -1 ;
		}
		return total;
	}
	
}
