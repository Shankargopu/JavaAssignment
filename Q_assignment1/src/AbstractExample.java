

public  class AbstractExample  {
   public static void main(String args[]) { 
	   SubstractAddition obj=new calc();
	   obj.Add();
	   obj.substract();
	   obj.multiply();
	   obj.divison();
   }
	
	
}
abstract class SubstractAddition {
	public void substract() {
       System.out.println("The substraction of 100 with 5 is "+(100-5));		
	}
	public void Add() {
		 System.out.println("The Addition of 100 with 5 is "+(100+5));
	}
	public abstract void multiply();
	public abstract void divison();
}
abstract class Multiply extends SubstractAddition{ 
	
	public  void multiply() {
		 System.out.println("The multiplication of 100 and 5 is "+(100*5));
}
}
	
class calc extends Multiply{
	public  void divison() {
		 System.out.println("The Division of 100 by 5 is "+(100/5));
	}

	}

	
	


