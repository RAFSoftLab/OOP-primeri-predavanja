package model;

public class Artikal {
	
	private Prodavnica prodavnica;
	private String nazivArtikla;
	private String sifra;
	private String velicina;
	private int kolicina;
	
	public Artikal(){
		
	}
	
	
	
	public Artikal(Prodavnica prodavnica, String nazivArtikla, String sifra, String velicina, int kolicina) {
		super();
		this.prodavnica = prodavnica;
		this.nazivArtikla = nazivArtikla;
		this.sifra = sifra;
		this.velicina = velicina;
		this.kolicina = kolicina;
	}



	public Artikal(Prodavnica prodavnica, String nazivArtikla, String sifra) {
		super();
		this.prodavnica = prodavnica;
		this.nazivArtikla = nazivArtikla;
		this.sifra = sifra;
	}
	public Prodavnica getProdavnica() {
		return prodavnica;
	}
	public void setProdavnica(Prodavnica prodavnica) {
		this.prodavnica = prodavnica;
	}
	public String getNazivArtikla() {
		return nazivArtikla;
	}
	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getVelicina() {
		return velicina;
	}

	public void setVelicina(String velicina) {
		this.velicina = velicina;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	@Override
	public String toString() {
		return "Artikal [prodavnica=" + prodavnica + ", nazivArtikla=" + nazivArtikla + ", sifra=" + sifra
				+ ", velicina=" + velicina + ", kolicina=" + kolicina + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nazivArtikla == null) ? 0 : nazivArtikla.hashCode());
		result = prime * result + ((sifra == null) ? 0 : sifra.hashCode());
		result = prime * result + ((velicina == null) ? 0 : velicina.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		if (nazivArtikla == null) {
			if (other.nazivArtikla != null)
				return false;
		} else if (!nazivArtikla.equals(other.nazivArtikla))
			return false;
		if (sifra == null) {
			if (other.sifra != null)
				return false;
		} else if (!sifra.equals(other.sifra))
			return false;
		if (velicina == null) {
			if (other.velicina != null)
				return false;
		} else if (!velicina.equals(other.velicina))
			return false;
		return true;
	}


	public String vratiPrikazZaListView() {
		return this.getNazivArtikla() + "-"+this.getSifra()+" velicina:"+this.getVelicina();
	}
	

	

	
	

	
	
	
	

}
