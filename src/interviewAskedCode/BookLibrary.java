/*Implement a simple Java class Library that manages the books in the library. The class should provide the following functionalities:
 
Add a Book: Add a new book to the library with its title and mark it as available.
Check Out a Book: Check out a book if it is available. If the book is not available or does not exist in the library, the method should return false.
Return a Book: Return a book to the library. If the book was checked out, mark it as available. If the book does not exist in the library, the method should return false.
Check Availability: Check if a book is available in the library.

*/
package interviewAskedCode;

import java.util.HashMap;

public class BookLibrary {
	
	private HashMap<String, Boolean> bookMap;
	
	BookLibrary() {

		this.bookMap = new HashMap<String, Boolean>();

	}
	
	void addBook(String bookTitle) {
		bookMap.put(bookTitle, true);
	}
	
	boolean checkOutBook(String bookTitle) {
		if(bookMap.containsKey(bookTitle)&& bookMap.get(bookTitle)) {
			bookMap.put(bookTitle, false);
			return true;
		}
		else return false;
		
	}
	
	boolean returnBook(String bookTitle) {
		
		if(bookMap.containsKey(bookTitle) && !bookMap.get(bookTitle)) {
			bookMap.put(bookTitle, false);
			return true;
		}
		else return false;
		
	}
	
	boolean isBookAvailable(String bookTitle) {
		return bookMap.getOrDefault(bookTitle, false);
	}
	
	public static void main(String[] args) {
		BookLibrary library = new BookLibrary();
		library.addBook("chavaa");
		library.addBook("1984");
		
		System.out.println("1984 available? " + library.isBookAvailable("1984")); // true
        System.out.println("Checking out 1984: " + library.checkOutBook("1984")); // true
        System.out.println("1984 available? " + library.isBookAvailable("1984")); // false
        System.out.println("Returning 1984: " + library.returnBook("1984")); // true
        System.out.println("1984 available? " + library.isBookAvailable("1984")); // true
		
	}

}
