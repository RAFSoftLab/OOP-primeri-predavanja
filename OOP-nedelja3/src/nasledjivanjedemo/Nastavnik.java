package nasledjivanjedemo;

public class Nastavnik extends Zaposleni{
	
	private String zvanje;
	private int brojCasova;
	
	/*
	 * u svim kontruktorima potkalse poziva se konstruktor natklase - kao prva naredba 
	 */
	
	public Nastavnik(String ime, String prezime) {
		super(ime, prezime);		
	}
	
	public Nastavnik(String ime, String prezime, int brojCasova,String zvanje) {
		super(ime, prezime);
		this.brojCasova = brojCasova;
		this.zvanje = zvanje;
	}
	
	public Nastavnik(String ime, String prezime, int brojCasova) {
		super(ime, prezime);
		this.brojCasova = brojCasova;
	
	}
	
		
	public Nastavnik(String ime, String prezime, String jmbg) {
		super(ime, prezime, jmbg);
		
	}

	public String getZvanje() {
		return zvanje;
	}
	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}
	public int getBrojCasova() {
		return brojCasova;
	}
	public void setBrojCasova(int brojCasova) {
		this.brojCasova = brojCasova;
	}
	
	@Override
	public  void ispisiOpterecenje(){
		System.out.println(this.brojCasova);
	}
	
	@Override
	public  void ispisi(){
		System.out.println("Nastavnik: "+getIme()+" "+getPrezime()+","+this.zvanje);
	}
	
	
	
	
	
	
	
	
}
