package Interface;

public class Interface {


		interface Print{  
			void print();
			
			}  
			interface Showable{  
			void show();  
			}  
			class interclas implements Print, Showable{

					public void print(){
						int a=20,b=10,c;
						c=a+b;
						System.out.println(c);
						} 
					
					public void show(){
						int a=10,b=20,c;
						c=a-b;
						System.out.println(c);} 
					
					
					public void display(){
						int a=10,b=20,c;
						c=a+b;
						System.out.println(c);} 
					
					public void main(String args[]){  
					interclas obj = new interclas(); 
					
					obj.show();
					obj.display();

				}

			}

}