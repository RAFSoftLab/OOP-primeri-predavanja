package factorypatterndemo.simplefactory;

public class Picerija {
	
	PicaSimpleFactory factory;
	
	public Picerija(PicaSimpleFactory factory) {		
		this.factory = factory;
	}

	public Pica poruciPicu(String vrsta){
		Pica p = factory.getPica(vrsta);
		if(p!=null){
			p.pripremi();
			p.ispeci();
			p.iseci();
			p.spakujUKutiju();
		}
		return p;		
	}
	
	public Pica napraviPicu(String vrsta){
		Pica p = factory.getPica(vrsta);
		if(p!=null){
			p.pripremi();
			p.ispeci();			
		}
		return p;		
	}
}




