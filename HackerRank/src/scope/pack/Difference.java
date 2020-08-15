package scope.pack;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	Difference(int[] elements){
  		this.elements=elements;
  	}
  	
  	int computeDifference() {
  		maximumDifference = Integer.MIN_VALUE;
  		int temp=0;
  		int diff=0;
  		for(int i=0;i<elements.length;i++) {
  			for(int j=i;j<elements.length;j++) {
  				diff=elements[i]-elements[j];
  				temp=Math.abs(diff);
  				if(maximumDifference<temp) {
  					maximumDifference=temp;
  				}
  				
  			}
  		}
  		return maximumDifference;
  	}
	// Add your code here

}