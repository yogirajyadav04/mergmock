package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class collection {
	
	public static void main(String[] args) {
		// homogeneous collection due to generic <Integer>
	/*	ArrayList<Integer> a= new ArrayList<Integer>();
		
		//insertion
		
		a.add(23);
		a.add(42);
		a.add(56);
		a.add(65);
		int size= a.size();
		
		
		//retrieval
		for(int i=0 ; i<size; i++)
		{
			System.out.println(a.get(i));
		}
			
		// deletion
		a.remove(2);
		System.out.println("===============");
		size=a.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.println(a.get(i));
		}
				
			 
			// In my Project we fetch data from excel sheet but similarly we can maintain our data in collection class.
		   //  above three methods are important (to add data--> a.add(65))  (to fetch data -->a.get(i))  (to delete data--> a.remove(2))
		*/
			
		// Heterogeneous collection because no generic, now we store any type of data like int ,string,char
		 
		/*         ArrayList a= new ArrayList();
		
				//insertion
				
				a.add(23);
				a.add("zsfffaf");
				a.add('@');
				a.add(65);
				int size= a.size();
				
				
				//retrieval
				for(int i=0 ; i<size; i++)
				{
					System.out.println(a.get(i));
				}
				*/			
		
		
		
		HashSet<String> hset= new HashSet<String>();
		hset.add("ram");
		hset.add("zsfffaf");
		hset.add("sham");
		hset.add("sita");
		hset.add("ram"); // duplicate not allowed
		int size= hset.size();
			
		//data retrieval using advance for loop. this advance for loop is only for collection
		
		for (String s: hset)
		{
			System.out.println(s);
		}
		
		// see video 29/9/22 for more details
		//video 40:12
	}

}
