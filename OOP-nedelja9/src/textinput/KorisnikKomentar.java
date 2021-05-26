package textinput;

public class KorisnikKomentar {
	
	private String ime;
	private String email;
	private String komentar;
	
	
	
	public KorisnikKomentar(String ime) {
		super();
		this.ime = ime;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getKomentar() {
		return komentar;
	}
	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}

	@Override
	public String toString() {
		return "KorisnikKomentar [ime=" + ime + ", email=" + email + ", komentar=" + komentar + "]";
	}
	
	
	
	

}
