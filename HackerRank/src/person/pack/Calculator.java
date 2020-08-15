package person.pack;

public class Calculator {

	   
	 @SuppressWarnings("finally")
	public int power(int n,int p){
		   int multiply=1;
	   try {
		   
	   if(n>0&&p>0) {
		   for(int i=0;i<p;i++) {
			   multiply=multiply*n;
		   }
		  return multiply; 
		   
	   }else {
		   throw new Exception("new");
		  
		   
	   }
	   
	   }catch(Exception e) {
		   System.out.println("hello");
		   
	   }
	return multiply;
	   
	   }
	   
	   
	    
	    
	   
}
