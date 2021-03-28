package abstractclassdemo;

public class Sluzbenik extends Zaposleni {
	
	
	private String radnoMesto;
	private int brojradnihSati;
	
	public Sluzbenik(String ime, String prezime) {
		super(ime, prezime);		
	}
	
	
	
	public Sluzbenik(String ime, String prezime, String radnoMesto, int brojradnihSati) {
		super(ime, prezime);
		this.radnoMesto = radnoMesto;
		this.brojradnihSati = brojradnihSati;
	}



	@Override
	public void ispisi(){
		System.out.println(getIme()+" "+getPrezime()+", "+radnoMesto);	
	}	

	@Override
	public void ispisiOpterecenje() {
		System.out.println(this.brojradnihSati);
		
	}
	
	
	
}
