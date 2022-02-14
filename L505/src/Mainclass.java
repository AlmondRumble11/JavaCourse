

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valinta1=-1;
		int valinta2=-1;
		String hahmo="moi";
		String gun="voi";
		
		
		do {
			
			System.out.println("*** BATTLE SIMULATOR ***");
			System.out.println("1) Create a character");
			System.out.println("2) Fight with a character");
			System.out.println("0) Quit");
			System.out.print("Your choice: ");
			Scanner scan = new Scanner(System.in);
			valinta1 = scan.nextInt();
			switch(valinta1) {
			case 1:
				System.out.println("Choose your character:");
				System.out.println("1) King");
				System.out.println("2) Knight");
				System.out.println("3) Queen");
				System.out.println("4) Troll");
				System.out.print("Your choise: ");
				Scanner scannner = new Scanner(System.in);
				valinta2 = scannner.nextInt();
				switch (valinta2) {
					case 1:
						hahmo = "King";
						break;
					case 2:
						hahmo = "Knight";
						break;
					case 3:
						hahmo = "Queen";
						break;
					case 4:
						hahmo = "Troll";
						break;
					default:
						hahmo = "Squire";
						break;
				}
				
				System.out.println("Choose your weapon:");
				System.out.println("1) Knife");
				System.out.println("2) Axe");
				System.out.println("3) Sword");
				System.out.println("4) Club");
				System.out.print("Your choise: ");
				Scanner scanner2 = new Scanner(System.in);
				valinta2 = scanner2.nextInt();
			
				switch (valinta2) {
					case 1:
						gun = "Knife";
						break;
					case 2:
						gun = "Axe";
						break;
					case 3:
						gun = "Sword";
						break;
					case 4:
						gun = "Club";
						break;
					default:
						gun = "Hands";
						break;
				}
/*				ArrayList<String> lista1= new ArrayList<String>();
				lista1.add(hahmo);
				lista1.add(gun);*/
				break;
			case 2:
				Character character = new Character(hahmo, gun);
				System.out.println(character.getHahmo() +" fights with weapon " + character.getAse());
				break;
			case 0:
				break;
			default:
				System.out.println("Wrong choise.");
			}
			
		}while(valinta1 != 0);
	}


		
	}


