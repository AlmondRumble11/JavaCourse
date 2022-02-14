import java.util.ArrayList;

public class Bank {
	private int raha;
	public ArrayList<Account>tilit = new ArrayList<>();
	public Bank() {}

	public void lisaaTili(String nimi, int raha) {
		luotonTili lt = new luotonTili(nimi,raha);
		tilit.add(lt);
	}
	public void lisaaCredit(String nimi, int raha, int credit) {
		luottoTili lut = new luottoTili(nimi,raha,credit);
		tilit.add(lut);
	}
	public void poistaTili(String nimi) {
		int luku = 0;
		int tarkistus = 1;
		for (int i=0; i<tilit.size(); i++) {
			if (tilit.get(i).getTili().contains(nimi)) {
				tilit.remove(luku);
				tarkistus  += 1;
			}else {
				luku = luku +1 ;
				
			}
		}
		if (tarkistus == 2) {
			System.out.println("Account removed.");
		}else {
			System.out.println("No account found.");
		}
		
	}
	Account etsiTili(String nimi) {
		 for (int i=0;i<tilit.size();i++) {
			if (tilit.get(i).getTili().contains(nimi)) {
				if (tilit.get(i).getCredit() > 0) {
					System.out.println("Account number: "+tilit.get(i).getTili()+" Amount of money: "+tilit.get(i).getSumma()+" Credit limit: "+tilit.get(i).getCredit());
					return tilit.get(i);
				}else {
				System.out.println("Account number: "+tilit.get(i).getTili()+" Amount of money: "+tilit.get(i).getSumma());
				return tilit.get(i);
				}
			}
			}
		System.out.println("No account found.");
		return null;
		
	}
	 void lisaaRahaa(String n, int m) {
		for (int i=0;i<tilit.size(); i++) {
			if (tilit.get(i).getTili().contains(n)) {
				raha = tilit.get(i).raha + m;
				tilit.get(i).setSumma(raha);
			}		
		}
	}
	public void nostaRahaa(String n, int m) {
		for (int i=0;i<tilit.size(); i++) {
			if (tilit.get(i).getTili().contains(n)) {
				if (tilit.get(i).getCredit() >= m) {
					raha = tilit.get(i).getCredit() - m;
				}
				else if (tilit.get(i).getSumma() < m) {
					System.out.println("Not enough money.");
				}else {
					raha = tilit.get(i).getSumma() - m;
					tilit.get(i).setSumma(raha);
				}
				}
			}
		}
	public void tulostaTilit() {
		for (int i=0;i<tilit.size();i++) {
			tilit.get(i).printAll();
		}
			/*if (tilit.get(i).getCredit() == 0) {
				System.out.println("Account number: "+tilit.get(i).getTili()+" Amount of money: "+tilit.get(i).getSumma());
			}else
				System.out.println("Account number: "+tilit.get(i).getTili()+" Amount of money: "+tilit.get(i).getSumma()+" Credit limit: "+tilit.get(i).getCredit());
			}*/
			
		}
}

class Account{
	protected String tili;
	protected int raha;
	protected int credit;
	//public Account() {}
	public int getCredit() {
		return credit;
	}
	public String getTili() {
		return tili;
	}
	public int getSumma() {
		return raha;
	}
	public void setSumma(int r) {
		this.raha = r;
	}
	public void printAll() {
		if (this.credit == 0) {
			System.out.println("Account number: "+this.tili+" Amount of money: "+this.raha);
		}else {
			System.out.println("Account number: "+this.tili+" Amount of money: "+this.raha+" Credit limit: "+this.credit);
		}
		
	}
}


class luotonTili extends Account {
	
	public luotonTili (String tili, int raha){
		this.tili = tili;
		this.raha = raha;
	}
}
class luottoTili extends Account {
	public luottoTili (String tili, int raha, int c) {
	this.tili = tili;
	this.raha = raha;
	this.credit = c;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int c) {
		this.credit = c;
	}
}


