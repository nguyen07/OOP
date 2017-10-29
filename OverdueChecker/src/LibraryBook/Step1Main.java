package LibraryBook;

import java.util.*;
public class Step1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar dueDate, returnDate;
		libraryBook book1, book2, book3, book4;

		returnDate = new GregorianCalendar(2004, Calendar.MARCH, 15);
		
		dueDate = new GregorianCalendar(2004, Calendar.MARCH, 14);
		
		book1 = new libraryBook(dueDate);
		System.out.println(book1.toString());
		
		dueDate = new GregorianCalendar(2004, Calendar.MARCH, 13);
		book2 = new libraryBook(dueDate, 0.75);
		book2.setTitle("Library book no 2");
		System.out.println(book2.toString());
		
		dueDate = new GregorianCalendar(2004, Calendar.MARCH, 12);
		book3 = new libraryBook(dueDate, 1.00, 100.00);
		book3.setTitle("Java for Smarties");
		System.out.println(book3.toString());
		
		dueDate = new GregorianCalendar(2004, Calendar.MARCH, 11);
		book4 = new libraryBook(dueDate, 1.50, 230.00,"Me and My java");
		System.out.println(book4.toString());
	}

}
