
public class MillenniumFalcon extends Battleship{
	private int dodge;
	
	public MillenniumFalcon(long id, String name, Color clr, int aD, int l, int shld, int cap, int dG) {
		super(id, name, clr, aD,  l, shld, cap);
		this.dodge = dG;
		this.life += 100;	
	}
	
	public void attack(MillenniumFalcon attackedShip) {
		attackedShip.shield -= 2 * this.attackDamage;
	}
	
	@Override
	public void takeDamage(int damage) {
		this.shield = 200 + damage;
	}
}
