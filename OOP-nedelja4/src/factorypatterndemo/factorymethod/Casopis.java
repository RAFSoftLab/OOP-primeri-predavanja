package factorypatterndemo.factorymethod;

public class Casopis extends Publikacija {
	
	private String ucestalostIzlazenja;
	private String urednik;
	
	

	public Casopis(String naslov) {
		super(naslov);		
	}
	
	public Casopis(String naslov, String ucestalostIzlazenja, String urednik) {
		super(naslov);	
		this.ucestalostIzlazenja = ucestalostIzlazenja;
		this.urednik = urednik;
	}

	
	@Override
	public String getIspisPublikacije() {		
		return "Casopis: "+getNaslov()+"izlazi "+this.ucestalostIzlazenja+", urednik: "+urednik;
	}

	public String getUcestalostIzlazenja() {
		return ucestalostIzlazenja;
	}

	public void setUcestalostIzlazenja(String ucestalostIzlazenja) {
		this.ucestalostIzlazenja = ucestalostIzlazenja;
	}

	public String getUrednik() {
		return urednik;
	}

	public void setUrednik(String urednik) {
		this.urednik = urednik;
	}
	
	

	

}
