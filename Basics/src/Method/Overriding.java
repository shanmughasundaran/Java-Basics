package Method;

  class Overriding {
	   public static void main( String args[]) {
		   
	   }
	 public void disp()
	   {
		System.out.println("disp() method of parent1 class");
	   }	
	   public void disp1()
	   {
		System.out.println("disp() method of parent2 class");
	   }
	  
	}
	class methodclass extends Overriding{
	   //Overriding method
	   public void disp(){
		System.out.println("disp() method of Child1 class");
	   }
	   public void disp1()
	   {
		System.out.println("disp() method of Child2 class");
	   }	
	   public void newMethod(){
		System.out.println("new method of main class");
	   }
	  		   
	   public static void main( String args[]) {
	
		 
		   Overriding x = new Overriding();
		x.disp();
		x.disp1();
	
		
		Overriding y = new methodclass();
		y.disp();
		y.disp1();
						
		methodclass z = new methodclass();
		z.newMethod();


	}

}
