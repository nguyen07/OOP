package Fermi;

import java.util.*;
public class Fermi {

	private int number1;
	private int number2;
	private int number3;
	
	/**
	 * Constructor: create a three random 
	 * numbers within range of maximum numeber
	 * @param: int maxNumer
	 */
	public Fermi(int max){
		setFirstNumber(max);
		setSecondNumber(max);
		setThirdNumber(max);
	}
	/**
	 * Constructor: create a Fermi instance with 
	 * given 3 numbers form player
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public Fermi(int num1, int num2, int num3){
		number1 = num1;
		number2 = num2;
		number3 = num3;
	}
	public Fermi compare(Fermi fermi){
		Fermi temp;
		int num1, num2, num3;
		if(number1 - fermi.getFirstNumber() == 0){
			num1= 0;
		}else{
			num1 = checkPicoPos1(fermi);
		}
		if(number2 - fermi.getSecondNumber() == 0){
			num2= 0;
		}else{
			num2 = checkPicoPos2(fermi);
		}
		if(number3 - fermi.getThirdNumber() == 0){
			num3= 0;
		}else{
			num3 = checkPicoPos3(fermi);
		}
		temp = new Fermi(num1,num2,num3);
		return temp;
	}
	private int checkPicoPos1(Fermi fermi){
		if(fermi.getFirstNumber() == number2 || fermi.getFirstNumber() == number3)
			return 1;
		else
			return -1;
	}
	private int checkPicoPos2(Fermi fermi){
		if(fermi.getSecondNumber() == number1 || fermi.getSecondNumber() == number3)
			return 1;
		else
			return -1;
	}
	private int checkPicoPos3(Fermi fermi){
		if(fermi.getThirdNumber() == number1 || fermi.getThirdNumber() == number2)
			return 1;
		else
			return -1;
	}
	/**
	 * Set the first random number
	 * @param max
	 */
	public void setFirstNumber(int max){
		Random rand = new Random();
		number1 = rand.nextInt(max) + 1;
	}
	/**
	 * Set the second random number
	 * @param max
	 */
	public void setSecondNumber(int max){
		Random rand = new Random();
		number2 = rand.nextInt(max) + 1;
	}
	/**
	 * Set the third random number
	 * @param max
	 */
	public void setThirdNumber(int max){
		Random rand = new Random();
		number3 = rand.nextInt(max) + 1;
	}
	/**
	 * Get the first random number
	 * @return number1
	 */
	public int getFirstNumber(){
		return number1;
	}
	
	/**
	 * Get the second random number
	 * @return number2
	 */
	public int getSecondNumber(){
		return number2;
	}
	/**
	 * Get the third random number
	 * @return number3
	 */
	public int getThirdNumber(){
		return number3;
	}
	private String check(int a){
		if(a == 0) return "Fermi";
		else if(a == 1) return "Pico";
		else return "Nano";
	}
	public String toDigits(){
		return getFirstNumber() + " " + getSecondNumber() + " "+getThirdNumber(); 
	}
	
	/**
	 * return a string represent the 3 random numbers
	 */
	public String toString(){
		String a, b, c;
		a = check(getFirstNumber());
		b = check(getSecondNumber());
		c = check(getThirdNumber());
		return c + " " + a + " " + b;
	}
	
	
}
