package library;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj = new Library("Kiot Library");
		Library.Book obj1=obj.new Book(56,"Atomic Habits");
		obj1.out();

	}

}
