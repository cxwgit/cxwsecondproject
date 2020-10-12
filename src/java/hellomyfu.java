package java;

public class hellomyfu {
	 public static int i=0;
	 public static void main(String args[]) { 
		 System.out.println("main函数开始执行");
		  Thread thread=new Thread(new Runnable() {
		    @Override
		    public void run() {
		      System.out.println("===task start===");
		      try {
		        Thread.sleep(5000);
		        i=i/0;
		      } catch (InterruptedException e) {
		    	  System.out.print("@@@@");
		       // e.printStackTrace();
		    	  System.out.print("@@@@");
		      }
		      System.out.println("===task finish===");
		    }
		  });
		  thread.start();
		  System.out.println("main函数执行结束");
		  System.out.println("测试gitSShdemo"+"main函数执行结束");
		  
		}
	
}
