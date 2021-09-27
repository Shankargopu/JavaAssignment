interface WaterBottleInterface{
	String color="White";
	void fillUp();
	void pourOut();
}

public class InterfaceExample implements  WaterBottleInterface{
	public static void main(String args[])
	{
		System.out.println(color);
		InterfaceExample ex=new InterfaceExample();
		ex.fillUp();
		ex.pourOut();
		
	}
	public void fillUp()
	{
		System.out.println("it is filled ");
	}
	public void pourOut() {
		System.out.println("poured out ");
		
	}

}
