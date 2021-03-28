package factorypatterndemo.simplefactory;

public class PicaSimpleFactory {
	
		public Pica getPica(String vrsta){
			if(vrsta.equalsIgnoreCase("kapricoza"))
				return new Kapricoza();
			else if(vrsta.equalsIgnoreCase("vegetarijana"))
				return  new Vegetarijana();
			else if(vrsta.equalsIgnoreCase("margarita"))
				return new Margarita();			
			return null;
		}
}





