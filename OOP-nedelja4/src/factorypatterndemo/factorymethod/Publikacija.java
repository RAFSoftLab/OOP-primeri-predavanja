package factorypatterndemo.factorymethod;

public abstract class Publikacija {
	
	private String naslov;	
	
	public Publikacija(String naslov){
		this.naslov = naslov;
	}
	
	
	
		
	public String getNaslov() {
		return naslov;
	}


	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}


	abstract public String getIspisPublikacije();
	
	

}
