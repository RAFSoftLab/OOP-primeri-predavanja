package factorypatterndemo.factorymethod;

public class Knjiga extends Publikacija {
	
	private String autor;
	private String isbn;
	private String izdavac;
	
	
	public Knjiga(String naslov) {
		super(naslov);	
	}
	
	public Knjiga(String naslov, String izdavac, String autor, String isbn) {
		super(naslov);
		this.izdavac = izdavac;
		this.autor = autor;
		this.isbn = isbn;
	}

	
	@Override
	public String getIspisPublikacije() {		
		return "Naslov: "+getNaslov()+", autor:"+this.autor+", izdavac: "+this.izdavac;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	
	

}
