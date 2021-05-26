package javafxkolekcije;

public class ElementCombo {
	
	private String elem1;
	private String elem2;
	
	public ElementCombo(String elem1, String elem2) {
		super();
		this.elem1 = elem1;
		this.elem2 = elem2;
	}
	
	public String getElem1() {
		return elem1;
	}
	public void setElem1(String elem1) {
		this.elem1 = elem1;
	}
	public String getElem2() {
		return elem2;
	}
	public void setElem2(String elem2) {
		this.elem2 = elem2;
	}

	@Override
	public String toString() {
		return elem1 + "-" +elem2;
	}
	
	

}
