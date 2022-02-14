import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valinta = -1;
		String regularAccount = "";
		int regularAccountMoney=0;
		String creditAccount = "";
		int creditAccountMoney=0;
		int creditAccountLimit=0;
		String account = "";
		
		
		do {
			System.out.println("");
			System.out.println("*** BANK SYSTEM ***");
			System.out.println("1) Add a regular account");
			System.out.println("2) Add a credit account");
			System.out.println("3) Deposit money");
			System.out.println("4) Withdraw money");
			System.out.println("5) Remove an account");
			System.out.println("6) Print account information");
			System.out.println("7) Print all accounts");
			System.out.println("0) Quit");
			System.out.print("Your choice: ");
			Scanner scan = new Scanner(System.in);
			valinta = scan.nextInt();
			
			switch (valinta) {
			case 1:
				System.out.print("Give an account number: ");
				Scanner scan1 = new Scanner(System.in);
				regularAccount = scan1.nextLine();
				System.out.print("Amount of money to deposit: ");
				regularAccountMoney = scan1.nextInt();
				System.out.println("Account number: "+regularAccount);
				System.out.println("Amount of money: "+regularAccountMoney);
				break;
			case 2:
				System.out.print("Give an account number: ");
				Scanner scan2 = new Scanner(System.in);
				creditAccount = scan2.nextLine();
				System.out.print("Amount of money to deposit: ");
				creditAccountMoney = scan2.nextInt();
				System.out.print("Give a credit limit: ");
				creditAccountLimit = scan2.nextInt();
				System.out.println("Account number: "+creditAccount);
				System.out.println("Amount of money: "+creditAccountMoney);
				System.out.println("Credit: "+creditAccountLimit);
				break;
			case 3:
				System.out.print("Give an account number: ");
				Scanner scan3 = new Scanner(System.in);
				regularAccount = scan3.nextLine();
				System.out.print("Amount of money to deposit: ");
				regularAccountMoney = scan3.nextInt();
				System.out.println("Account number: "+regularAccount);
				System.out.println("Amount of money: "+regularAccountMoney);
				break;
			case 4:
				System.out.print("Give an account number: ");
				Scanner scan4 = new Scanner(System.in);
				regularAccount = scan4.nextLine();
				System.out.print("Amount of money to withdraw: ");
				regularAccountMoney = scan4.nextInt();
				System.out.println("Account number: "+regularAccount);
				System.out.println("Amount of money: "+regularAccountMoney);
				break;
			case 5:
				System.out.print("Give the account number of the account to delete: ");
				Scanner scan5 = new Scanner(System.in);
				account = scan5.nextLine();
				System.out.println("Account number: "+account);
				break;
			case 6:
				System.out.print("Give the account number of the account to print information from: ");
				Scanner scan6 = new Scanner(System.in);
				account = scan6.nextLine();
				System.out.println("Account number: "+account);
				break;
			case 7:
				System.out.println("Prints every account");
				break;
			case 0:
				break;
				
			default:
				System.out.println("Invalid choice.");
				break;
		
			
			}
			
			
		}while(valinta != 0);
	}

}
