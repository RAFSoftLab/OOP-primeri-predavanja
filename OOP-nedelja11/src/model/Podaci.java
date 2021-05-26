package model;

import java.util.List;

public class Podaci {
	
	private static Podaci podaci;
	
    private List<Prodavnica> prodavnice;
	
	private List<Artikal> artikli;
	
	private Podaci() {		
		prodavnice = FileUtils.ucitajArtikle();
		artikli = prodavnice.get(0).getArtikli();
		
	}
	
	public static Podaci getInstance() {
		if(podaci==null)
			podaci = new Podaci();
		return podaci;			
	}
	
	public List<Artikal> getArtikli(){
		return artikli;		
	}
	
	public List<Prodavnica> getProdavnice(){
		return prodavnice;
	}
	
	
	public void snimiArtikle(){
		FileUtils.snimiArtikleZaProdavnicu(artikli);					
	}
	
	public void snimiProdavnice() {
		FileUtils.snimiProdavnice(prodavnice);	
	}

}
