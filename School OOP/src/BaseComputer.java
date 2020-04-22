
public class BaseComputer implements IComputer{
	public static final double MIN_OIL = 30;
	public static final double MAX_TEMP = 120;
	private int temp;
	private double oil;
	private boolean tempAlarm;
	private boolean oilAlarm;
	private boolean doorOpened;
	private boolean lightsOn;
	private boolean zoomerAlarm;
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public double getOil() {
		return oil;
	}
	
	public void setOil(double oil) {
		this.oil = oil;
	}
	
	public boolean getDoorOpened() {
		return doorOpened;
	}
	
	public void setDoorOpened(boolean doorOpened) {
		this.doorOpened = doorOpened;
	}
	
	public boolean getLightsOn() {
		return lightsOn;
	}
	
	public void setLightsOn(boolean lightsOn) {
		this.lightsOn = lightsOn;
	}
	
	public BaseComputer() {
		
	}
	
	public BaseComputer(int temp, double oil) {
		this.temp = temp;
		this.oil = oil;
	}
	
	@Override
	public void tempCheck() {
		tempAlarm = temp > MAX_TEMP;
	}
	@Override
	public void oilCheck() {
		oilAlarm = oil < MIN_OIL;
	}
	@Override
	public void zoomerCheck() {
		zoomerAlarm = doorOpened && lightsOn;
	}
	
	@Override
	public String toString() {
		return "[temp = " + temp + ", oil = " + oil + 
				", tempAlarm = " + tempAlarm + ", oilAlarm = " + 
				oilAlarm + ", zoomerAlarm = " + zoomerAlarm + "]";
	}
}







