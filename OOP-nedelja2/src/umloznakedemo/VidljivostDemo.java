package umloznakedemo;

public class VidljivostDemo {
	
	private int privatePolje;
	public int publicPolje;
	int defaultVidljivostPolje;
	protected int protectedVidljivostPolje;
	
	private int privateMetoda() {
		return privatePolje;
	}
	
	public int publicMetoda() {
		return publicPolje;
	}
	
	int defaultVidljivostMetoda() {
		return defaultVidljivostPolje;
	}
	
	protected int protectedVidljivostMetoda() {
		return protectedVidljivostPolje;
		
	}

}
