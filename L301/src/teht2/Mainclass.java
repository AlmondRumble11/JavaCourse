package teht2;
import java.util.ArrayList;
//Jesse Mustonen, 0541805, 17.1.2020

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BottleDispenser pullo = new BottleDispenser();
		pullo.addMoney();
		pullo.buyBottle();
		pullo.buyBottle();
		pullo.addMoney();
		pullo.addMoney();
		pullo.buyBottle();
		pullo.returnMoney();
	}

}
