package classproj;

public class Book {
	
	// Field
	String title;
	String writer;
	int price;
	
	// Constructor
	/*
	 * source - generate constructor this fields ... 하면
	 * 밑의 3인자가 없어도 정상적으로 작동
	 */
	Book(String t, String w){
		this(t, w, 0);				// this() : 다른 생성자를 의미함
	}
	Book(String t, int p){
		this(t, "저자 미상", p);
	}
	/*Book(String t, String w, int p){
		title  = t;
		writer = w;
		price  = p;
	}
	*/
	
	// Method
	void output() {
		System.out.println("제목="+title);
		System.out.println("저자="+writer);
		System.out.println("가격="+price);
	}
	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
}
