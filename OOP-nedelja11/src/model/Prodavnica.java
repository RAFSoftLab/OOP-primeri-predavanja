package model;

import java.util.ArrayList;
import java.util.List;

public class Prodavnica {
	
	private String naziv;
	private List<Artikal> artikli = new ArrayList<>();
	
	
	
	public Prodavnica(String naziv) {
		super();
		this.naziv = naziv;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public List<Artikal> getArtikli() {
		return artikli;
	}
	public void setArtikli(List<Artikal> artikli) {
		this.artikli = artikli;
	}
	public boolean add(Artikal e) {
		return artikli.add(e);
	}
	@Override
	public String toString() {
		return naziv;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
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
		Prodavnica other = (Prodavnica) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		return true;
	}
	
	
	

}
