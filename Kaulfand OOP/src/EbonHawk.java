
public class EbonHawk extends Battleship{
	private int heal;
	
	public EbonHawk(long id, String name, Color clr, int aD, int l, int shld, int cap, int dG) {
		super(id, name, clr, aD,  l, shld, cap);
	}
	
	public void healLife(int heal, int life) {
		this.heal += this.life;
	}
}
