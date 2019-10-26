package classproj;

public class Grade {
	
	// Field
	int    kor;
	int    eng;
	int    mat;
	double average;
	char   grade;
	
	// Constructor
	Grade(int kor, int eng, int mat){
		this.kor     = kor;
		this.eng     = eng;
		this.mat     = mat;
		this.average = getAverage();
		this.grade   = getGrade();
	}
	
	// Method
	/*
	 * 90 이상 a, 80이상b, 70이상 c, 60이상 d, 나머지 f
	 */
	
	double getAverage() {
		return (kor+eng+mat)/3.0;
	}
	
	char getGrade() {
		if      ( average >= 90 ) { return 'A';}
		else if ( average >= 80 ) { return 'B';}
		else if ( average >= 70 ) { return 'C';}
		else if ( average >= 60 ) { return 'D';}
		else                      { return 'F';}
	}
	
	void output() {
		System.out.println("국어 = "+kor+", 영어 = "+eng+", 수학 ="+mat);
		System.out.println("평균 = "+average+" (학점 = "+grade+")");
	}

}
