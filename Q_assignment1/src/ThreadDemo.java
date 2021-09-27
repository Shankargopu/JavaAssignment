class fetchData extends Thread {
   public void run()
     {
    	 for(int i=1;i<=3;i++)
    	 {
    		 System.out.println("This is Fetch Data thread");
    		 try {
    			 Thread.sleep(5000);
    			 
    		 }
    		 catch(InterruptedException e)
    		 {
    			 
    		 }
    	 }
     }
}
   


class processData implements Runnable 
{
	 public synchronized void run() {
	
		for(int i=1;i<=3;i++)
		{
			
			
			try {
				Thread.sleep(10000);
				
			}
			catch(Exception e)
			{
				
			}
			System.out.println("This processData Thread");
		}
	}

}
        
public class ThreadDemo {
	public static void main(String args[])
	{
	   fetchData obj = new fetchData();
	   processData obj1=new processData();
	   obj.start();
	 
	
	  Thread t2=new Thread(obj1);
	 
	  t2.start();
	   
	}
}

	


