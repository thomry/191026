package classproj;

public class Song {
	
	// Field
	String title;
	String genre;
	
	Song(String title, String genre){
		this.title = title;
		this.genre = genre;
	}
	
	void output() {
		System.out.println("제목=" + title);
		System.out.println("장르=" + genre);
	}

}
