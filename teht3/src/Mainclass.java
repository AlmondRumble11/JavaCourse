//Jesse Mustonen, 0541805, 12.1.2020

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "";
		String input2 = "";
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		System.out.print("Give a name to the dog: ");
		Scanner scanner = new Scanner(System.in);
		input1 = scanner.nextLine();
		input1 = input1.trim();
		if (input1.isEmpty() || input1.equals(" ")) { 
			dog1.setNimi("Doge");
			input1 = "Doge";
		}
		else {
			input1 = input1;
		    dog1.setNimi(input1);
			
		} 
		dog1.name(input1);
		//System.out.print("What does a dog say: ");
		//input2 = scanner.nextLine();
		dog2.speak();
		
		
	}

}
