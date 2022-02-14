

import java.util.ArrayList;
import java.util.List;
public class BottleDispenser {
	private int bottles;
	private Bottle[] bottleA;
    private double money = 0;
    private ArrayList<Bottle> bottle;
    public BottleDispenser() {}
    public BottleDispenser(String [] args) {
        int [] bottles = {1,2,3,4,5};
        double money = 0;
        ArrayList<Bottle> bottle = new ArrayList<Bottle>();
        Bottle nimi = new Bottle("Pepsi Max", "Pepsi", 0.3 , 0.5, 1.8);
        bottle.add(nimi);
        bottle.add(nimi);
        bottle.add(nimi);
        bottle.add(nimi);
        bottle.add(nimi);
        setList(bottle);
        
    }
    public ArrayList<Bottle> getList() {
    	return bottle;
    }
    public void setList(ArrayList<Bottle> l) {
    	bottle = l;
    }

    public double addMoney(double x, double y) {
        double money = y + x;
        System.out.println("Klink! Added more money!");
        //System.out.println(getList().size());
        return money;
    }
    public double buyBottle(double money) {
    	if ((bottle.size() > 0) && (money >= 1.80)) {
        	money =  money - 1.8;
        	bottle.remove(0);
        	//System.out.println(koko);
        	//System.out.println(getList().size());
        	Bottle bottl = new Bottle("Pepsi Max", "Pepsi", 0.3 , 1.8, 0.5);
        	System.out.println("KACHUNK! " + bottl.getName() + " came out of the dispenser!");
    	}
        else if (money < 1.8) {
        	System.out.println("Add money first!");
        	//System.out.println(bottle.size());
        }
        else if (bottle.size() == 0) {
        	System.out.println("No more bottles!");
        }
    	return money;
    }
    public void showBottles() {
    	Bottle bottl = new Bottle("Pepsi Max", "Pepsi", 0.3 , 1.8, 0.5);
    	//Bottle pullot = bottl;
    	//System.out.println(getList().size());
    	for (int i=0; i<bottle.size(); i++) {
    		System.out.println((i+1) +". Name: " + bottl.getName());
    		System.out.println("	Size: " + bottl.getSize() + "	Price: " + bottl.getPrice());
    	}
    	
    }
    public double returnMoney(double money) {
    	//System.out.println(money);
        money = 0;
        //System.out.println(getList().size());
        System.out.println("Klink klink. Money came out!");
        //System.out.println(money);
        return money;
    }
}
