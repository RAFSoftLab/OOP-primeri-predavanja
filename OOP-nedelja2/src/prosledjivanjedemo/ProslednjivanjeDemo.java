package prosledjivanjedemo;

public class ProslednjivanjeDemo {

	public static void main(String[] args) {
		MojBroj mBr = new MojBroj();
		System.out.println(mBr.br);
		povecajBroj(mBr);
		System.out.println(mBr.br);
		int br = 10;
		System.out.println(br);
		povecajBroj(br);
		System.out.println("Povecan broj(int): "+br);  // 10 - ne povecava se jer se prosledjuje po vrenosti
		Integer br1 = Integer.valueOf(4);
		System.out.println(br1);
		povecajBroj(br1);
		System.out.println("Povecan broj (Integer): "+br1); // 4 - ne povecava se jer je nepromenjiv (imutabilan)
	}
	
	/*
	 * prosledjivanje po referenci, promene nad objektom mb ostaju posle poziva metode
	 */
	
	private static void povecajBroj(MojBroj mb){
		mb.br++;
	}
	
	
	private static void povecajBroj(int br){
		System.out.println("povecajBroj int");
		br++;
	}
	
	
	private static void povecajBroj(Integer br){
		System.out.println("povecajBroj Integer");
		br++;
	}
	
}


