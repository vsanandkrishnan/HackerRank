package person.pack;

import java.util.*;
import java.io.*;

class MapTest{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> MyMap= new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            MyMap.put(name, phone);
            // Write code here
        }
        System.out.println(MyMap);
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(MyMap.containsKey(s)) {
            	System.out.println(s+"="+MyMap.get(s));
            	
            }else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}