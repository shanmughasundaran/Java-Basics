package Method;

import java.lang.reflect.Method;

public class Default_Method {

	
		 void logicMethod3(){
			   int z=10;
		       System.out.println("execution of sub one " +z);
		   }
		 
	public void logicMethod4() {
			   
			   int A, P=10000, r=3, t=5;
			   A = P*(1 + r*t) ;
			   System.out.println("Interest value is " +A); 
				   }

	public static  void logicMethod5(){
				   int h=80;
			       System.out.println("execution of sub one " +h);
			   }
			  
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Default_Method a=new Default_Method();
			
			a.logicMethod4();
			a.logicMethod5();
			a.logicMethod3();
			
					    
		   }  

		  	   }

	
