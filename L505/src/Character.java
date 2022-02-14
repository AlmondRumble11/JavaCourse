

public class Character {
	private String hahmo;
	private String ase;

	public Character() {}
	public  Character(String h, String a) {
		hahmo=h;
		WeaponBehavior wb = new WeaponBehavior();
		ase = wb.asee(a);
	}
	public String getHahmo() {
		return hahmo;
	}
	public String getAse() {
		return ase;
	}
	public  class WeaponBehavior {
		public String asee(String b) {
			return ase = b;
			
		}
		
		
		
	}

}