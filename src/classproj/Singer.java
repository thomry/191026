package classproj;

public class Singer {
	// Field
	String name;
	Song song;
	
	Singer(String name, Song song) {
		this.name = name;
		this.song = song;
	}
	
	void output() {
		System.out.println("가수 이름= "+name);
		song.output();
	}

}
