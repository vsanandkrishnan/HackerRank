package abs.pack.config;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("anand");
		a.add("hello");
		a.add(0, "helloword");
		
		System.out.println(a);
		
//		a.remove(2);
//		a.remove("anand");
//		a.removeAll(a);
		
		System.out.println(a.get(2));
		System.out.println(a.contains("anand"));
		System.out.println(a.indexOf("hello"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
