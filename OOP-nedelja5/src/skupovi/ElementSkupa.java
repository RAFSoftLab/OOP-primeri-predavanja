package skupovi;

public class ElementSkupa implements Comparable<ElementSkupa> {
	
	private String nazivElementa;
	
	public ElementSkupa(String nazivElementa) {		
		this.nazivElementa = nazivElementa;
	}		
	public String getNazivElementa() {
		return nazivElementa;
	}
	public void setNazivElementa(String nazivElementa) {
		this.nazivElementa = nazivElementa;
	}
	
	public String toString() {		
		return this.nazivElementa;
	}
	
	@Override
	public int compareTo(ElementSkupa o) {	
		return this.nazivElementa.compareTo(o.getNazivElementa());
	}
	
		
	@Override
	public int hashCode() {
		//System.out.println("hash code, "+this);
		return ((nazivElementa == null) ? 0 : nazivElementa.hashCode());		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals, "+this);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementSkupa other = (ElementSkupa) obj;
		if (nazivElementa == null) {
			if (other.nazivElementa != null)
				return false;
		} else if (!nazivElementa.equals(other.nazivElementa))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}


