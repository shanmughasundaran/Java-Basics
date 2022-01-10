package Collection;

import java.util.TreeSet;

public class Set_Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> treeset=new TreeSet<String>();
treeset.add("One");
treeset.add("Two");
treeset.add("Three");
treeset.add("four");
treeset.add("five");
treeset.add("six");
treeset.first();
treeset.last();

//this head set will show all higher elements of three
treeset.headSet("Three");
//this show inbetween
treeset.subSet("Three", "five");
//this shows the lower
treeset.tailSet("five");
	}

}
