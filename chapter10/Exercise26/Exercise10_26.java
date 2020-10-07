package chapter10.Exercise26;

import java.util.Scanner;

public class Exercise10_26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("islemi giriniz");
		String a = input.nextLine().replaceAll(" ", "");
		a = a.replaceAll("[+]", "#+#");
		a = a.replaceAll("[-]", "#-#");
		a = a.replaceAll("[*]", "#*#");
		a = a.replaceAll("[/]", "#/#");
		args = a.split("#");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		if (args.length != 3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		
		int result = 0;

		
		switch (args[1].charAt(0)) {
		case '+':
			result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
			break;
		case '-':
			result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
			break;
		case '.':
			result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
			break;
		case '/':
			result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
		}

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}