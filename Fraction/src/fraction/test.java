package fraction;

public class test {

	public static void main(String[] args) {
		Fraction f1, f2,f3;
		f1 = new Fraction(52,16);
		f2 = f1.simplify();
		System.out.println(f1.toString()+ " can be reduced to " + f2.toString());

		f3 = new Fraction(13,17);
		
		f2 = f1.add(f3);
		System.out.println(f1.toString()+ " adds to " + f3.toString() + " result is: " + f2.toString());
		
		f2 = f1.subtract(f3);
		System.out.println(f1.toString()+ " subtracts to " + f3.toString() + " result is: " + f2.toString());
		
		f2 = f1.multiply(f3);
		System.out.println(f1.toString()+ " multiply to " + f3.toString() + " result is: " + f2.toString());
		
		f2 = f1.divide(f3);
		System.out.println(f1.toString()+ " divides to " + f3.toString() + " result is: " + f2.toString());
		
	}
	

}
