package factorypatterndemo.nodesign;

public class Picerija {
	
	public Pica poruciPicu(String vrsta){
		Pica p = null;
		if(vrsta.equalsIgnoreCase("kapricoza"))
			p = new Kapricoza();
		else if(vrsta.equalsIgnoreCase("vegetarijana"))
			p = new Vegetarijana();
		else if(vrsta.equalsIgnoreCase("margarita"))
			p = new Margarita();
		if(p!=null){
			p.pripremi();
			p.ispeci();
			p.iseci();
			p.spakujUKutiju();
		}
		return p;		
	}
	
	public Pica napraviPicu(String vrsta){
		Pica p = null;
		if(vrsta.equalsIgnoreCase("kapricoza"))
			p = new Kapricoza();
		else if(vrsta.equalsIgnoreCase("vegetarijana"))
			p = new Vegetarijana();
		else if(vrsta.equalsIgnoreCase("margarita"))
			p = new Margarita();
		if(p!=null){
			p.pripremi();
			p.ispeci();			
		}
		return p;		
		
	}

}
