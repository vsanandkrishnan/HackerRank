package inherit.pack.config;

public class Student extends Person {
	private int[] testScores;

	Student(String firstName,String lastName,int id,int[] scores){
		super(firstName,lastName,id);
		//super(String firstName,String lastName,int id);
		this.firstName=firstName;
		this.lastName=lastName;
		this.idNumber=id;
		this.testScores=scores;
		
		this.testScores =scores;
	}
	
	public char calculate() {
		int sum=0;
		char Grade=0;
		for(int i=0;i<testScores.length;i++) {
			sum+=testScores[i];
		}
		int Avg=(sum/testScores.length);
		if(Avg<=100.0 && Avg>=90.0) {
			Grade='O';
		}else if(Avg<90.0 && Avg<=80.0) {
			Grade='E';
		}else if(Avg<80.0 && Avg>=70.0) {
			Grade='A';
		}else if(Avg<70.0 && Avg>=55.0) {
			Grade='P';
		}else if(Avg<55.0 && Avg>40.0) {
			Grade='D';
		}else if(Avg<40.0) {
			Grade='T';
		}
		
		return Grade;
	}

}
