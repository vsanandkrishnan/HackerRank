package abs.pack.config;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    ArrayList<Integer> ar= new ArrayList<Integer>();
    for(int i=0;i<size;i++) {
    	ar.add(scan.nextInt());
    	
    }
    
    int queries= scan.nextInt();
    for(int j=0;j<queries;j++) {
    	String queryNote = scan.next();
    	if(queryNote.equals("Insert")) {
        	int x = scan.nextInt();
    		int y= scan.nextInt();
    		ar.add(x, y);
    	}else if(queryNote.equals("Delete")) {
    		int z = scan.nextInt();
    		ar.remove(z);
    	}
    	
    	
    }
    
    Iterator itr = ar.iterator();
    while(itr.hasNext()) {
    	System.out.print(itr.next()+" ");
    }
    
    }
    
    
}