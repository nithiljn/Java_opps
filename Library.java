package library;

public class Library {
	private String library_name;

	public Library(String name) {
		this.library_name = name;
	}

	public class Book{
		private int book_number;
		private String book_name;
		public Book(int book_number,String book_name) {
			this.book_number=book_number;
			this.book_name=book_name;
		}
		public void out() {
			System.out.println("Library Name :"+library_name);
			
			System.out.println("Welcome to Kiot Library");
			System.out.println("Book Number :"+book_number);
			System.out.println("Book Name :"+book_name);
		}
	}
}
