package abs.pack.config;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("anand");
		hs.add("element");
		hs.add("error");
		hs.add("he");
		hs.add("she");
		hs.add("allow");
		System.out.println(hs);
		Iterator<String> itr = hs.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());

	}

}
