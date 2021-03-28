package abstractclassdemo;

public class Nastavnik extends Zaposleni{
	
	private String zvanje;
	private int brojCasova;
	
	
	public Nastavnik(String ime, String prezime) {
		super(ime, prezime);	
	}	
	

	public Nastavnik(String ime, String prezime, String zvanje, int brojCasova) {
		super(ime, prezime);
		this.zvanje = zvanje;
		this.brojCasova = brojCasova;
	}

	@Override
	public  void ispisi(){
		System.out.println(getIme()+" "+getPrezime()+","+this.zvanje);
	}

	@Override
	public void ispisiOpterecenje() {
		System.out.println(this.brojCasova);
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
	
	
	
}
