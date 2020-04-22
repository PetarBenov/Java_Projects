
public class Battleship {
	protected long id;
	protected String name;
	protected Color shipClr;
	protected int attackDamage;
	protected int life;
	protected int shield;
	protected int capacity;

	public Battleship(long id, String name, Color shipClr, int attackDamage, int life, int shield, int capacity) {
		this.id = id;
		this.name = name;
		this.shipClr = shipClr;
		this.attackDamage = attackDamage;
		this.life = life;
		this.shield = shield;
		this.capacity = capacity;
	}

	public void attack(Battleship attackedShip) {
		attackedShip.takeDamage(this.attackDamage - 50);
	}

	public void takeDamage(int damage) {
		this.shield -= damage;
	}

	public boolean isDestroyed() {
		if (this.life <= 0) {
			return true;
		}
		return false;
	}
}
