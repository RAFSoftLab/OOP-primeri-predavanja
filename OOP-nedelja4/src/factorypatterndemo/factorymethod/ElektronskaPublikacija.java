package factorypatterndemo.factorymethod;

public class ElektronskaPublikacija extends Publikacija {
	
	private String url;
	
	
	
	public ElektronskaPublikacija(String naslov) {
		super(naslov);		
	}
	
	public ElektronskaPublikacija(String naslov, String url) {
		super(naslov);		
		this.url = url;
	}

	
	@Override
	public String getIspisPublikacije() {		
		return "Naslov:"+getNaslov()+","+url;
	}

	

}
