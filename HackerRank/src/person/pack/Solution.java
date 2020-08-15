package person.pack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     
    	/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scan = new Scanner(System.in);
    	int size = scan.nextInt();
    	int[] arr = new int[size];
    	
    	for(int i=0; i<size;i++) {
    		arr[i]=scan.nextInt();
    	}
        int sum=0;
        int out=0;
    	for(int a=0;a<size;a++) {
    		for(int b=a;b<size;b++) {
    			for(int c=a;c<=b;c++) {
    				//System.out.print(arr[c]+" ");
    				sum+=arr[c];
    			}
    			//System.out.println("sum: "+sum);
    			if(sum<0) {
    				out++;
    			}
    			//System.out.println("out: "+out);
    			sum=0;
    			//System.out.println();
    		}	
    	}
        System.out.println(out);
        scan.close();
    	
        
    }
    
    
}