package nasledjivanjedemo;

public class Sluzbenik extends Zaposleni {	
	
	private String radnoMesto;
	private int brojRadnihSati;
	
	
	public void ispisi(){
		System.out.print("Službenik: "+this.radnoMesto+" ");
		super.ispisi();
	}
	
	
	
	
	
	
	
	public String getRadnoMesto() {
		return radnoMesto;
	}
	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}
	public int getBrojRadnihSati() {
		return brojRadnihSati;
	}
	public void setBrojradnihSati(int brojRadnihSati) {
		this.brojRadnihSati = brojRadnihSati;
	}
	
	
	
	
	
	
	
	
	public Sluzbenik(String ime, String prezime, int brojRadnihSati, String radnoMesto) {
		super(ime, prezime);	
		this.brojRadnihSati = brojRadnihSati;
		this.radnoMesto = radnoMesto;
	}	
	
	public Sluzbenik(String ime, String prezime, int brojRadnihSati) {
		super(ime, prezime);	
		this.brojRadnihSati = brojRadnihSati;
		
	}	
	
	
	
	public Sluzbenik(String ime, String prezime, String jmbg) {
		super(ime, prezime, jmbg);
		// TODO Auto-generated constructor stub
	}



	
	
	@Override
	public  void ispisiOpterecenje(){
		System.out.println(this.brojRadnihSati);
	}
	
}
