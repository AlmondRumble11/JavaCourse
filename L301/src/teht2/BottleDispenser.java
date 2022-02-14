package teht2;
import java.util.ArrayList;
//Jesse Mustonen, 0541805, 17.1.2020
public class BottleDispenser {
	private int bottles;
	private Bottle[] bottleA;
    private int money;
    public BottleDispenser() {
        bottles = 50;
        money = 0;
        bottleA = new Bottle[bottles];
        for (int i=0;i < bottles; i++) {
        	bottleA[i] = new Bottle();
        }
    }
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    public void buyBottle() {
    	if ((bottles > 0) && (money >= 1.80)) {
        	bottles -= 1;
        	money -= 1.8;
        	Bottle bottle = new Bottle("Pepsi Max","Pepsi",0.3, 0.5, 1.80);
        	System.out.println("KACHUNK! " + bottle.getName() + " came out of the dispenser!");
    	}
        else if (money < 1.8) {
        	System.out.println("Add money first!");
        }
        else if (bottles == 0) {
        	System.out.println("No more bottles!");
        }
    }
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
        
    }
}

