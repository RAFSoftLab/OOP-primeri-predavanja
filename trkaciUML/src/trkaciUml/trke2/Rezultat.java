package trkaciUml.trke2;

public class Rezultat {
	
	private Trka trka;
	private Ucesnik u;
	private double vreme;
	private int pozicija;
	
	public Rezultat(Trka trka, Ucesnik u, double vreme, int pozicija) {
		this.trka = trka;
		this.u = u;
		this.vreme = vreme;
		this.pozicija = pozicija;
		
	}
	
	
	public Trka getTrka() {
		return trka;
	}
	public void setTrka(Trka trka) {
		this.trka = trka;
	}
	public Ucesnik getU() {
		return u;
	}
	public void setU(Ucesnik u) {
		this.u = u;
	}
	public double getVreme() {
		return vreme;
	}
	public void setVreme(double vreme) {
		this.vreme = vreme;
	}
	public int getPozicija() {
		return pozicija;
	}
	public void setPozicija(int pozicija) {
		this.pozicija = pozicija;
	}


	@Override
	public String toString() {
		return pozicija+". "+vreme+" "+u; 
	}
	
	
	

}
