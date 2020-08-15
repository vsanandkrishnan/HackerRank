package abs.pack.config;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExpample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "goodBye");
		hm.put(52, "morning");
		hm.put(3,"evening");
		System.out.println(hm.get(2));
		
		Set sn = hm.entrySet();
		Iterator itr= sn.iterator();
		
		while(itr.hasNext()) {
			Map.Entry mp = (Map.Entry)itr.next();
			System.out.println(mp.getKey()+"="+mp.getValue());
		}
		

	}

}
