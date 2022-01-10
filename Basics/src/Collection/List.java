package Collection;

import java.util.ArrayList;
import java.util.ListIterator;





public class List {
	
	
		
	
	public static void main(String[]arg ){
		ArrayList arrayList = new ArrayList();
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		
//		List can allow Duplicats
		arrayList.add("Four");
		System.out.println(arrayList);
		//to find the string name index count
		arrayList.indexOf("Three");
		System.out.println(arrayList);
		//to get the last value of repearted string
		arrayList.lastIndexOf("Four");
		System.out.println(arrayList);

		arrayList.get(2);
		System.out.println(arrayList);
		
		//To add one list from another
		ArrayList anotherarrayList = new ArrayList();
		anotherarrayList.addAll(arrayList);
		System.out.println(anotherarrayList);
		
		//to clear all listed 
		//anotherarrayList.clear();
	// To remove particular element/// can also use index 
		anotherarrayList.remove("Four");
		System.out.println(anotherarrayList);
		//to check whether list is empty
		anotherarrayList.isEmpty();
		System.out.println(anotherarrayList);
		
		
		//Iterate(toget)
		for (Object string : anotherarrayList) {
			System.out.println(string);
			
		}
		for(int i=0;i<anotherarrayList.size();i++) {
		System.out.println("usedloop"+anotherarrayList.get(i));
		
		}

	//using list iterator on forward
			 ListIterator<String> iterator = anotherarrayList.listIterator();
			 
			 while(iterator.hasNext()) {
				 System.out.println("forward_Iterator"+iterator.next());
			 }
				//using list iterator on forward
			 

			 
			 while(iterator.hasPrevious()) {
				 System.out.println("Backword_or_ previous_Iterator"+iterator.previous());
			 }

			 }

}