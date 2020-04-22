
public class EnhancedComputer extends BaseComputer implements IABS{
	private int breaks;
	private boolean slip;
	
	public int getBreaks() {
		return breaks;
	}
	public void setBreaks(int breaks) {
		this.breaks = breaks;
	}
	public boolean isSlip() {
		return slip;
	}
	public void setSlip(boolean slip) {
		this.slip = slip;
	}
	
	@Override
	public void abs() throws InterruptedException{
		if(slip) {
			breaks *= 0.7;
			Thread.sleep(500);
			slip = false;
		}
	}
	
	
}
