package my.java.Assignment6;

/*
 * When i see a book ,i can also see the reviews of the book.
 */


public class BookReviewApp {

	public static void main(String args[]){
		Book book1=new Book(1,"Harry Potter","J.K Rowling");
		System.out.print(book1);
		book1.addReview(new Review(1,"Very good!",(byte)3));
		book1.addReview(new Review(2,"Very well!",(byte)3.5));
		
		book1.showReview();
		
	}
	
	
	
}
