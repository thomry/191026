package java_prac;

class Tv{
	boolean power;
	int channel;
	
	void power()		{ power = !power; }
	void channelUp() 	{ ++channel; }
	void channelDown()  { --channel;}
}

class CaptionTv extends Tv {	// Tv class상속받음
	boolean caption;	// caption상태 on/off
	void displayCaption(String text) {
		if (caption) {	// caption이 true일때 text를 보여줌
			System.out.println(text);
		}
	}
}

class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel   = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World2");

	}

}
