package Abstract;

public class Abstract {
	abstract class Base { 
	    abstract void fun(); 
	} 
	class Derived extends Base { 
	    void fun() { System.out.println("Derived fun() call"); } 
	} 
	class classtoinherit { 
	    public void main(String args[]) {  
	      
	        // Uncommenting the following line will cause compiler error as the  
	        // line tries to create an instance of abstract class. 
	        // Base b = new Base(); 
	  
	        // We can have references of Base type. 
	    	Derived b = new Derived(); 
	        b.fun();  
	    } 
	} 


	}


