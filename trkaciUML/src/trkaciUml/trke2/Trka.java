package trkaciUml.trke2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trka {
	
	private Date datumOdrzavanja;
	private float duzinaStaze;
	private List<Ucesnik> ucesniciTrke;
	private VrstaTrke vrstaTrke;
	private List<Rezultat> rezultati;
	
	public Trka(VrstaTrke vrstaTrke) {
		this.vrstaTrke = vrstaTrke;
	}
	
	public Date getDatumOdrzavanja() {
		return datumOdrzavanja;
	}
	public void setDatumOdrzavanja(Date datumOdrzavanja) {
		this.datumOdrzavanja = datumOdrzavanja;
	}
	public float getDuzinaStaze() {
		return duzinaStaze;
	}
	public void setDuzinaStaze(float duzinaStaze) {
		this.duzinaStaze = duzinaStaze;
	}
	public List<Ucesnik> getUcesniciTrke() {
		return ucesniciTrke;
	}
	public void setUcesniciTrke(List<Ucesnik> ucesniciTrke) {
		this.ucesniciTrke = ucesniciTrke;
	}
	
	public void addUcesnik(Ucesnik u) {
		if(ucesniciTrke==null)
			ucesniciTrke = new ArrayList<Ucesnik>();
		ucesniciTrke.add(u);
	}

	public VrstaTrke getVrstaTrke() {
		return vrstaTrke;
	}

	public void setVrstaTrke(VrstaTrke vrstaTrke) {
		this.vrstaTrke = vrstaTrke;
	}
	
	public void addUcesnici(Ucesnik ... ucesnici) {		
		if(ucesniciTrke==null)
			ucesniciTrke = new ArrayList<Ucesnik>();
		for(Ucesnik u:ucesnici) {
			ucesniciTrke.add(u);
		}		
	}

	public List<Rezultat> getRezultati() {
		return rezultati;
	}

	public void setRezultati(List<Rezultat> rezultati) {
		this.rezultati = rezultati;
	}
	
	public void addRezultati(Rezultat ...rezultati) {
		if(this.rezultati==null)
			this.rezultati = new ArrayList<Rezultat>();
		for(Rezultat r:rezultati) {
			this.rezultati.add(r);
		}
	}
	
	
	
}
