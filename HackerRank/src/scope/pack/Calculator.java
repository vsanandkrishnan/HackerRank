package scope.pack;

public class Calculator {

	public int power(int n, int p) throws Exception {
		
		if(p>=00 && n>=0) {
			double x =Math.pow(n, p);
			return (int)x;
		}
		else {
			throw new Exception("n and p should be non-negative");
		}
	
	}
}
