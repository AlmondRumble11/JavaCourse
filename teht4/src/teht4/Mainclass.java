package teht4;
import java.util.ArrayList;
import java.util.Scanner;
//Jesse Mustonen, 0541805, 17.1.2020
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valinta = -1;
		double raha = 0;
		BottleDispenser pullo = new BottleDispenser(args);
		do {
		//BottleDispenser pullo = new BottleDispenser(args);
		System.out.print("\n");
		System.out.println("*** BOTTLE DISPENSER ***");
		System.out.println("1) Add money to the machine");
		System.out.println("2) Buy a bottle");
		System.out.println("3) Take money out");
		System.out.println("4) List bottles in the dispenser");
		System.out.println("0) End");
		System.out.print("Your choice: ");
		Scanner scan = new Scanner(System.in);
		valinta = scan.nextInt();
		switch (valinta) {
		case 1:
			
			raha = pullo.addMoney(raha, 1);
			//System.out.println(raha);
			break;
		case 2:
			raha = pullo.buyBottle(raha);
			break;
		case 3:
			raha = pullo.returnMoney(raha);
			break;
		case 4:
			pullo.showBottles();
			break;
		case 0:
			break;
		default:
			System.out.println("Wrong choise");
			break;
		}
		} while (valinta != 0);
}
}
