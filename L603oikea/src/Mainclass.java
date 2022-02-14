
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valinta = -1;
		String account;
		int money;
		int creditLimit=0;
		Bank pankki = new Bank();
		
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
				account = scan1.nextLine();
				System.out.print("Amount of money to deposit: ");
				money = scan1.nextInt();
				//System.out.println("Adding to bank: "+account+","+money);
				pankki.lisaaTili(account, money);
				System.out.println("Account created.");
				break;
			case 2:
				System.out.print("Give an account number: ");
				Scanner scan2 = new Scanner(System.in);
				account = scan2.nextLine();
				System.out.print("Amount of money to deposit: ");
				money = scan2.nextInt();
				System.out.print("Give a credit limit: ");
				creditLimit = scan2.nextInt();
				//System.out.println("Account adding to bank: "+account+","+money+","+creditLimit);
				pankki.lisaaCredit(account, money, creditLimit);
				System.out.println("Account created.");
				break;
			case 3:
				System.out.print("Give an account number: ");
				Scanner scan3 = new Scanner(System.in);
				account = scan3.nextLine();
				System.out.print("Amount of money to deposit: ");
				money = scan3.nextInt();
				//System.out.println("Depositing to account: "+account+"the amount "+money);
				pankki.lisaaRahaa(account, money);
				break;
			case 4:
				System.out.print("Give an account number: ");
				Scanner scan4 = new Scanner(System.in);
				account = scan4.nextLine();
				System.out.print("Amount of money to withdraw: ");
				money = scan4.nextInt();
				//System.out.println("Withdrawing from the account: "+account+" the amount "+ money);
				pankki.nostaRahaa(account, money);
				break;
			case 5:
				System.out.print("Give the account number of the account to delete: ");
				Scanner scan5 = new Scanner(System.in);
				account = scan5.nextLine();
				pankki.poistaTili(account);
				System.out.println("Account removed.");
				break;
			case 6:
				System.out.print("Give the account number of the account to print information from: ");
				Scanner scan6 = new Scanner(System.in);
				account = scan6.nextLine();
				System.out.println("Searching for account: "+account);
				Account acc = pankki.etsiTili(account);
				break;
			case 7:
				System.out.println("All accounts:");
				pankki.tulostaTilit();
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
