package factorypatterndemo.simplefactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pica {
	String naziv;
	String vrstaTesta;
	String sos;
	List<String> nadevi;
	
	public Pica(String naziv, String vrstaTesta, String sos, List<String> nadevi) {
		super();
		this.naziv = naziv;
		this.vrstaTesta = vrstaTesta;
		this.sos = sos;
		this.nadevi = nadevi;
	}
	public abstract void pripremi();
	public abstract void ispeci();
	public void iseci(){};
	public void spakujUKutiju(){};

}
