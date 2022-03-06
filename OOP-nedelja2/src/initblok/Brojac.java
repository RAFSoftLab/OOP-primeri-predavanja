package initblok;

public class Brojac {
	/*
	 * Blok za inicijalizaciju objekta, mozemo postaviti pocetne vrednosti za polja koja ce se dodeljivati svim objektima
	 *
	 * Ako ne dodelimo pocetne vrednosti ovde, ili u konstruktoru, polja dobijaju neke podrzumevane vrednosti, zavisni od tipa
	 * brojevi -0, boolean - false, objekti - null
	 */
	
	private int br;
	private String naziv = "nepoznat";
	
	public void ispisi() {
		System.out.println("Brojac "+naziv+" = "+br);
	}
	
	public void povecajBrojac() {
		this.br++;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}




