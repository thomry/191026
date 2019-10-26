package classproj;

public class Student {
	
	//Field
	String  name;
	String  dept;
	int     score1;
	int     score2;
	double  average;
	boolean isPass;
	
	// Constructor
	Student(String name, String dept){
		this.name = name;
		this.dept = dept;
	}
	
	// Method
	void setScores(int score1, int score2) {
		this.score1 = score1;
		this.score2 = score2;
		average     = getAverage();
		isPass = isPass();
	}
	double getAverage() {
		return (score1+score2)/2.0;
	}
	boolean isPass() {
		// 평균이 80이상일경우 "합격"
		return average >= 80 ? true : false;
	}
	void output() {
		System.out.println("이름= "+name);
		System.out.println("학과= "+dept);
		System.out.println("평균= "+average);
		System.out.println("합격= "+(isPass ? "합격":"불합격"));
		System.out.println("---------------------");
	}
}
