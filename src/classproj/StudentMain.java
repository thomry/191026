package classproj;

public class StudentMain {

	public static void main(String[] args) {
		
		Student me = new Student("alice","경영");
		
		me.setScores(50, 100);
		me.output();
	}

}

