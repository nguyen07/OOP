package LibraryBook;
import java.util.*;
import java.text.*;
public class bookTracker {
	public static final int ERROR = -1;
	private List books;
	/**
	 * create new instance of the class
	 */
	public bookTracker(){
		books = new ArrayList();
	}
	/**
	 * Adds book to the book list it maintain
	 * @param book
	 */
	public void add(libraryBook book){
		books.add(book);
	}
	/**
	 * return the total overdue charge for the books in the list, use today as 
	 * the date return
	 * @return
	 */
	public double getCharge(){
		return getCharge( new GregorianCalendar());
	}
	/**
	 * return the total overdue charge for the books in the list
	 * @param returnDate 
	 * @return totalCharge
	 */
	public double getCharge(GregorianCalendar returnDate){
		if(books.isEmpty()){
			return ERROR;
		}else{
			return totalCharge(returnDate);
		}
	}
	/**
	 * return the total overdue charge for the books in the list
	 * @param returnDate 
	 * @return totalCharge
	 */
	public double totalCharge(GregorianCalendar returnDate){
		double totalCharge = 0.0;
		Iterator itr = books.iterator();
		while(itr.hasNext()){
			libraryBook book = (libraryBook) itr.next();
			totalCharge += book.computeCharge(returnDate);
		}
		return totalCharge;
	}
	/**
	 * return information to the books in the list as a string
	 */
	public String getList()
	{
		StringBuffer result = new StringBuffer(" ");
		String lineSeparator = System.getProperty("line.separator");
		Iterator itr = books.iterator();
		while(itr.hasNext()){
			libraryBook book = (libraryBook)itr.next();
			result.append(book.toString()+lineSeparator);
		}
		return result.toString();
	}
	
}
