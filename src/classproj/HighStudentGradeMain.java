package classproj;

public class HighStudentGradeMain {

	public static void main(String[] args) {
		Grade midTerm = new Grade(80,81,83);
		HighStudent student1 = new HighStudent("james","경영",midTerm);
		HighStudent student2 = new HighStudent("tom"  ,"전산",new Grade(90,91,93));
		
		student1.output();
		student2.output();

	}

}
