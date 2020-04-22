
public class Outrider extends Battleship {
	private int plasmaDefence;
	
	public Outrider(long id, String name, Color clr, int aD, int l, int shld, int cap, int pD) {
		super(id, name, clr, aD,  l, shld, cap);
		this.plasmaDefence = pD;
		this.life += 100;	
	}
	@Override
	public void takeDamage(int damage) {
		this.shield -= damage;
		this.shield += 50;
	}
}
