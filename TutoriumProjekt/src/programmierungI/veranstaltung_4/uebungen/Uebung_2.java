package programmierungI.veranstaltung_4.uebungen;

import java.util.Scanner;

public class Uebung_2 {

	public static void main(String[] args) {
		
		// a)
		for(int i = 0; i < 5; i++) {
			System.out.println((int) Math.rint(Math.random() * (6 - 1) + 1));
		}
		
		// b)
		// pow oder sqrt
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		
		switch(input1) {
		case "pow":
			String input2 = sc.nextLine();
			String input3 = sc.nextLine();
			double number1 = Double.parseDouble(input2);
			double number2 = Double.parseDouble(input3);
			System.out.println(Math.pow(number1, number2));
			break;
		case "sqrt":
			String input4 = sc.nextLine();
			double number3 = Double.parseDouble(input4);
			System.out.println(Math.sqrt(number3));
			break;
		}
		

	}

}
