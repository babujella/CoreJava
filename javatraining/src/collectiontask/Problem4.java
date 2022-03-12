package collectiontask;

import java.util.*;

public class Problem4 {
	int i;
	static int j;
	static int k;
	public static void main(String[] args) {
		ArrayList<String> b = new ArrayList<String>();
		b.add("Babu");
		b.add("Babu1");
		b.add("Babu2");
		b.add("Babu3");
		b.add("Babu4");
		System.out.println("1. Iterate ArrayList using Java ListIterator :");
		ListIterator<String> ba = b.listIterator(b.size()); // ListIterator
		while (ba.hasPrevious()) {
			String bab = ba.previous();
			System.out.println(bab);
		}
		
		System.out.println("2. Search an element of Java ArrayList");
		if(b.contains("Babu1")) { 
			System.out.println("Searching of Babu1"+b+"YES");
		}
		System.out.println("3. replace an element at specified index arraylist");
		b.set(4,"Techouts");
		System.out.println(b);
		
		System.out.println("4. Add element at specific index :");
		b.add("Nani");
		System.out.println(b);

		System.out.println("5. Sort ArrayList in descending order");
		Collections.sort(b, Collections.reverseOrder());
		System.out.println(b);
		
		System.out.println("6.insert an element to ArrayList using ListIterator :");
		ListIterator<String> it = b.listIterator();
		it.add("Raj");
		while (it.hasNext()) {
			it.next();
		}
		System.out.println(b);
		
		System.out.println("7. Hsort arraylist of strings alphabetically java :");
		Collections.sort(b);
		Iterator itr=b.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		System.out.println("8. Remove an element of Java ArrayList");
		b.remove(3);
		System.out.println(b);
		
		System.out.println("9. Remove duplicates from arraylist with using collections");
		HashSet<String> n=new HashSet<String>();
		n.addAll(b);
		b.clear();
		b.addAll(n);
		System.out.println(b);
		
		
		System.out.println("10. Remove duplicates from arraylist without using collections");
		for(k=0;k<b.size();k++) {
			for(j=k+1;j<b.size();j++) {
				if(b.get(k).equals(b.get(j))) {
					b.remove(j);
					j--;
					}
			}
			
		}
		System.out.println(b);

		
		
		
		

	

}}