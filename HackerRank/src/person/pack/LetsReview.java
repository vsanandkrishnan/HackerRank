package person.pack;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LetsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			String odd="";
			String even="";
			String s = scan.next();
			for(int j=0;j<s.length();j++) {
				if(j%2==0) {
					even+=s.charAt(j);
				}else {
					odd+=s.charAt(j);
				}
			}
			System.out.println(even+" "+odd);
		}

	}

}
