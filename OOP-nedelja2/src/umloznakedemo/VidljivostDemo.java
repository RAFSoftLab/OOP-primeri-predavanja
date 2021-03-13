package umloznakedemo;

public class VidljivostDemo {
	
	private int privatePolje;
	public int publicPolje;
	int defaultVidljivostPolje;
	protected int protectedVidljivostPolje;
	
	private int privatnaMetoda() {
		return privatePolje;
	}
	
	public int publicMetoda() {
		return publicPolje;
	}
	
	int defaultVidljivostMeotda() {
		return defaultVidljivostPolje;
	}
	
	protected int protectedVidljivostMetoda() {
		return protectedVidljivostPolje;
		
	}

}
