package Fermi;
import java.util.*;

public class mainText1 {
	private static Scanner scanner;
	private static Fermi fermi01, fermi02,fermi03;
	private static void start(){
		String reply;
		scanner = new Scanner(System.in);
		System.out.print("Enter three digits (0-9): ");
		String threeNum = scanner.nextLine();
		String[] tokens = threeNum.split(" ");
		int[] threeDigits = new int[tokens.length];
		for(int i = 0; i < tokens.length ; i++){
			threeDigits[i] = Integer.parseInt(tokens[i]);
		}
		fermi02 = new Fermi(threeDigits[0],threeDigits[1],threeDigits[2]);
	
	}
	private static String readString(String a){
		System.out.print(a);
		return scanner.next();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reply;
		fermi01 = new Fermi(9);
		do{
			start();
			fermi03 = fermi01.compare(fermi02);
			System.out.printf("%-30.30s   %-30.30s%n","Guess","Hint");
			System.out.printf("%-30.30s   %-30.30s%n",fermi02.toDigits(),fermi03.toString());
			reply = readString("\nRun Again (yes/no)? ");
		}while(!(reply.equalsIgnoreCase("no") || reply.equalsIgnoreCase("n")));
		
		System.out.println("Thank you for playing the game!");
		
	}

}
