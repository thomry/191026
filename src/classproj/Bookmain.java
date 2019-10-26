package classproj;

public class Bookmain {

	public static void main(String[] args) {
		
		Book myBook   = new Book("좋은아침", "조아침");
		Book yourBook = new Book("콩쥐팥쥐", 10000);
		Book ourBook  = new Book("자바", "김자바", 20000);
		
		myBook.output();
		yourBook.output();
		ourBook.output();
	}
}
