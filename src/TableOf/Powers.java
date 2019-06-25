package TableOf;

import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userInput = "y";
		
		do { 
			System.out.println("Please Enter an Integer: ");
			int yourNumber = scnr.nextInt();
			System.out.println();

			String head = "Number   " + "Squared   " + "Cubed   ";
			String decoration = "======= " + " ======= " + " ======= ";
			System.out.println(head);
			System.out.println(decoration);


			for (int i = 1; i <= yourNumber; i++) {

				int squared = (int) Math.pow(i, 2);
				int cubed = (int) Math.pow(i, 3);


				String row = "  " + String.valueOf(i) + "        " + String.valueOf(squared)
						+ "        " + String.valueOf(cubed);
				System.out.println(row);
			}

			System.out.println("Continue (y/n)?");
			userInput = scnr.next();
			 
			
		} while (userInput.equals("y"));
		
		System.out.println("ByeBye!");
		scnr.close(); 
						
	}
		
	}



// Coding Bat: Near Hundred 
/*
 * public boolean nearHundred(int n) {
 * 
 * return(Math.abs(100-n) <= 10 || Math.abs(200-n) <=10);
 * 
 * }
 */