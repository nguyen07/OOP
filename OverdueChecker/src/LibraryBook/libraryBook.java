package LibraryBook;

import java.util.*;
import java.text.*;

public class libraryBook {

	private static final double CHARGE_PER_DAY = 0.50;
	private static final double MAX_CHARGE = 50.00;
	private static final String DEFAULT_TITLE = "title unknown";
	
	private GregorianCalendar dueDate;
	private String title;
	private double chargePerDay;
	private double maximumCharge;
	
	/**
	 * Creates a book library with due date and charge per date
	 * @param dueDate GregorianCalender due due
	 */
	public libraryBook(GregorianCalendar dueDate){
		this(dueDate, CHARGE_PER_DAY);
	}
	/**
	 * Creates a book library with due date and charge per date
	 * and MAX_CHARGE
	 * @param dueDate GregorianCalender due due
	 * @param MAX_CHARGE maximum charge for a book
	 */
	public libraryBook(GregorianCalendar dueDate, double chargePerDay){
		this(dueDate, chargePerDay, MAX_CHARGE);
	}
	/**
	 * Creates a book library with due date, charge per date, maximum charge, and default title
	 * and MAX_CHARGE
	 * @param dueDate GregorianCalender due due
	 * @param MAX_CHARGE maximum charge for a book
	 * @param chargePerDay 
	 * 
	 */
	public libraryBook(GregorianCalendar dueDate, double chargePerDay, double maximumCharge){
		this(dueDate, chargePerDay, maximumCharge, DEFAULT_TITLE);
	}
	/**
	 * Creates a book library with due date, charge per date, maximum charge, and title
	 * and MAX_CHARGE
	 * @param dueDate GregorianCalender due due
	 * @param MAX_CHARGE maximum charge for a book
	 * @param chargePerDay 
	 * @param title
	 */
	public libraryBook(GregorianCalendar dueDate, double chargePerDay, double maximumCharge, String title){
		
		setDueDate(dueDate);
		setChargePerDay(chargePerDay);
		setMaximumCharge(maximumCharge);
		setTitle(title);
	}
	/**
	 * return charge per day for a libray book
	 * @return chargePerDay charge per day
	 */
	public double getChargePerDay(){
		return chargePerDay;
	}
	
	/**
	 * return a due date for a library book
	 * 
	 * @return dueDate
	 */
	public GregorianCalendar getDueDate(){
		return dueDate;
	}
	/**
	 * return maximum charge
	 * @return maximum charge
	 */
	public double getMaxCharge(){
		return maximumCharge;
	}
	/**
	 * return title of book
	 * @return title
	 */
	public String getTitle(){
		return title;
	}
	/**
	 * set charge per day
	 * @param charge double type
	 */
	public void setChargePerDay(double charge){
		chargePerDay = charge;
	}
	/**
	 * set due day
	 * @param day type GregorianCalendar
	 */
	public void setDueDate(GregorianCalendar day){
		dueDate = day;
	}
	/**
	 * set maximum charge
	 * @param charge type double
	 */
	public void setMaximumCharge(double charge){
		maximumCharge = charge;
	}
	/**
	 * set title of book
	 * @param tile type string
	 */
	public void setTitle(String title){
		this.title = title;
	}
	/**
	 * return a string preresentation of book
	 * @return a string preresent for a book
	 */
	public String toString()
	{
		return String.format("%-30s   $%5.2f   $%7.2f     %4$tm/%4$td/%4$ty",getTitle(),getChargePerDay(),getMaxCharge(),dueDate.getTime());
	}
	public double computeCharge(GregorianCalendar returnDate){
		return 1.00;
	}
}
