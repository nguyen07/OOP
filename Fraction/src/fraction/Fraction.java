package fraction;

public class Fraction {
	
	private int numerator;
	private int denominator;
	/**
	 * 
	 * Creates a fraction num/denom
	 * @param num the numerator
	 * @param denom the denominator
	 */
	public Fraction(int num, int denom){
		Setnumerator(num);
		Setdenominator(denom);
	}
	/**
	 * Sets the numerator of this fraction
	 * @param the numerator of this fraction
	 */
	public void Setnumerator(int num){
		numerator = num;
	}
	/**
	 * Sets denominator of this fraction
	 * @param denom the denominator of this fraction
	 */
	public void Setdenominator(int denom){
		if(denom == 0){
			System.out.println("Fatal error");
			System.exit(1);
		}
		denominator = denom;
	}
	/**
	 * return the numerator of this fraction
	 * @return the numerator of this fraction
	 */
	
	public int Getnumerator(){
		return numerator;
	}
	/**
	 * return the denominator of this fraction
	 * @return the denominator of this fraction
	 */
	public int Getdenominator(){
		return denominator;
	}
	/**
	 * Return the String representation of this fraction
	 * @return the String representation of this fraction
	 */
	public String toString(){
		return Getnumerator() + "/" + Getdenominator();
	}
	
	/*
	public void simplify(){
		int num = Getnumerator();
		int denom = Getdenominator();
		int gcd = gcd(num, denom);
		
		Setnumerator(num/gcd);
		Setdenominator(denom/gcd);
		
	}
	*/
	
	/**
	 * Return a new Fraction object that is in the simplest
	 * form of this Fraction object
	 * @return a Fraction object in the simplest form of this
	 * Fraction
	 */
	public Fraction simplify(){
		int num = Getnumerator();
		int denom = Getdenominator();
		int gcd = gcd(num, denom);
		
		Fraction simp = new Fraction(num/gcd,denom/gcd);
		return simp;
		
	}
	/**
	 * Return the greatest common divisor of the
	 * parameters m and n
	 * @param num the first number
	 * @param denom the second number
	 * @return denom the greatest common divisor of m and n
	 */
	public int gcd(int num, int denom){
		
		int r = num %denom;
		while(r !=0){
			num = denom;
			denom = r;
			r = num%denom;
		}
		return denom;
	}
	
	/**
	 * Return the sum of this fraction and 
	 * the parameter fraction. The sum return is
	 * not simplified
	 *
	 *@param frac the Fraction to sum this fraction
	 *
	 *@return the sum of this and frac
	 */
	public Fraction add(Fraction frac){
		int a, b, c,d;
		Fraction sum;
		
		b = this.Getdenominator();
		a = this. Getnumerator();
		
		c = frac.Getnumerator();
		d = frac.Getdenominator();
		
		sum = new Fraction(a*d + b*c,b*d);
		
		return sum;
	}
	/**
	 * Return the sum of this fraction and the
	 * parameter integer. The sum return is simplified
	 * 
	 * @param integer the integer to sum this fraction
	 * 
	 * @return the sum of this and integer
	 */
	public Fraction add(int num){
		int a, b, c,d;
		Fraction sum;
		
		b = this.Getdenominator();
		a = this. Getnumerator();
		
		c = num;
		d = 1;
		
		sum = new Fraction(a*d + b*c,b*d);
		
		return sum;
	}
	
	/**
	 * Return the difference of this fraction and 
	 * the parameter fraction. The difference return is
	 * not simplified
	 *
	 *@param frac the Fraction to subtract this fraction
	 *
	 *@return the difference of this and frac
	 */
	public Fraction subtract(Fraction frac){
		int a, b, c, d;
		Fraction sub;
		d = frac.Getdenominator();
		c= frac.Getnumerator();
		b = this.Getdenominator();
		a = this.Getnumerator();
		
		sub = new Fraction(a*d - c*b,b*d);
		return sub;		
		
	}
	
	/**
	 * Return the difference of this fraction and the
	 * parameter integer. The difference return is not simplified
	 * 
	 * @param integer the integer to difference this fraction
	 * 
	 * @return the difference of this and integer
	 */
	public Fraction subtract(int num){
		int a, b, c,d;
		Fraction sub;
		
		b = this.Getdenominator();
		a = this. Getnumerator();
		
		c = num;
		d = 1;
		
		sub = new Fraction(a*d - b*c,b*d);
		
		return sub;
	}
	
	/**
	 * Return the multiplication of this fraction and 
	 * the parameter fraction. The multiplication return is
	 * not simplified
	 *
	 *@param frac the Fraction to multiply this fraction
	 *
	 *@return the multiplication of this and frac
	 */
	public Fraction multiply(Fraction frac){
		int a, b, c, d;
		Fraction multi;
		d = frac.Getdenominator();
		c= frac.Getnumerator();
		b = this.Getdenominator();
		a = this.Getnumerator();
		
		multi = new Fraction(a*c,d*b);
		return multi;		
		
	}
	
	/**
	 * Return the multiplication of this fraction and the
	 * parameter integer. The multiplication return is not simplified
	 * 
	 * @param integer the integer to multiply this fraction
	 * 
	 * @return the multiplication of this and integer
	 */
	public Fraction multiply(int num){
		int a, b, c,d;
		Fraction multi;
		
		b = this.Getdenominator();
		a = this. Getnumerator();
		
		c = num;
		d = 1;
		
		multi = new Fraction(a*c,b*d);
		
		return multi;
	}
	
	/**
	 * Return the division of this fraction and 
	 * the parameter fraction. The division return is
	 * not simplified
	 *
	 *@param frac the Fraction to divide this fraction
	 *
	 *@return the division of this and frac
	 */
	public Fraction divide(Fraction frac){
		int a, b, c, d;
		Fraction divi;
		d = frac.Getdenominator();
		c= frac.Getnumerator();
		b = this.Getdenominator();
		a = this.Getnumerator();
		
		divi = new Fraction(a*d,c*b);
		return divi;		
		
	}
	
	/**
	 * Return the division of this fraction and the
	 * parameter integer. The division return is not simplified
	 * 
	 * @param integer the integer to divide this fraction
	 * 
	 * @return the division of this and integer
	 */
	public Fraction divide(int num){
		int a, b, c,d;
		Fraction divi;
		
		b = this.Getdenominator();
		a = this. Getnumerator();
		
		c = num;
		d = 1;
		
		divi = new Fraction(a*d,b*c);
		
		return divi;
	}
	
	
}
