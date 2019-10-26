package classproj;

public class HighStudent {
	// Field
	String name;
	String dept;
	Grade  grade;
	
	
	// Constructor
	HighStudent(String name, String dept, Grade grade){
		this.name  = name;
		this.dept  = dept;
		this.grade = grade;
	}
	
	// Method
	void output() {
		System.out.println("성명="+name);
		System.out.println("학과="+dept);
		grade.output();
	}
}
