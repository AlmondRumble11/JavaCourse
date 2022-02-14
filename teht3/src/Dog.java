import java.util.Scanner;

//Jesse Mustonen, 0541805, 12.1.2020
public class Dog {

	private String nimi = "";
	int luku;
    String merkki;
    boolean bool1;
    boolean bool2;
    
	public String name(String s) {
		System.out.println("Hey, my name is " + nimi);
		return s;
	}
	public void speak() {
		System.out.print("What does a dog say: ");
		Scanner scanner = new Scanner(System.in);
		String rivi = scanner.nextLine();
		String[] lista = rivi.split(" ");
		int pituus = lista.length;
		
		for (int i=0;i< pituus; i++) {
			if (isNumber(lista[i]) == true )
				System.out.println("Such integer: " + lista[i]);
			else
				if (lista[i].contains("true") || lista[i].contains("false")) {
					System.out.println("Such boolean: " + lista[i]);
				}
				else {
					System.out.println(lista[i]);
				}
		}
	}
	public boolean isNumber(String x) {
	    try {
	    Integer.parseInt(x); 
	    return true;
	    }
	    catch(NumberFormatException nfe) {
	    return false;
	    }
	}
		
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String s) {
		nimi = s;
	}
}