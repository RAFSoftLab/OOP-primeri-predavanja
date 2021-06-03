package trkaciUML.trke;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trka {
	
	private Date datumOdrzavanja;
	private float duzinaStaze;
	private List<Ucesnik> ucesniciTrke;
	private VrstaTrke vrstaTrke;
	
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
	
	public void addUcesnici(Ucesnik ...ucesnici) {
		System.out.println("ucesnici.length " + ucesnici.length);
		if(ucesniciTrke==null)
			ucesniciTrke = new ArrayList<Ucesnik>();
		for(Ucesnik u:ucesnici) {
			ucesniciTrke.add(u);
		}
		
	}
	
	
	
}
