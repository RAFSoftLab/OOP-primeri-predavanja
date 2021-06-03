package trkaciUML.trke;

public abstract class Ucesnik {
	
	private Rezultat rez;

	public Rezultat getRez() {
		return rez;
	}

	public void setRez(Rezultat rez) {
		this.rez = rez;
	}

	@Override
	public String toString() {
		if(rez == null) return "";
		return " "+rez.getPozicija()+" "+rez.getVreme();
	}
	
	
	
}
