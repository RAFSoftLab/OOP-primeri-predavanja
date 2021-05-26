package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class FileUtils {
	
	private static String filePath =  "artikli.txt";
	private static String filePathOut =  "artikliNovo.txt";
	
	
	
	public static List<Prodavnica> ucitajArtikle(){
		List<Prodavnica> prodavnice = new ArrayList<>();
		
		try{
			File f = new File(filePath);
			Scanner sc = new Scanner(f);
			
			while(sc.hasNextLine()){			
				String line = sc.nextLine();				
				String[] parts = line.split(",");
				String nazivProdavnice = parts[0].split(" ")[1];
				Prodavnica p = null;
				for(Prodavnica pom:prodavnice){
					if(pom.getNaziv().equals(nazivProdavnice))
						p = pom;
				}
				if(p==null){
					p = new Prodavnica(parts[0].split(" ")[1]);
					prodavnice.add(p);
				}				
				for(int i=3;i<parts.length;i++){
					String[] kol = parts[i].split("-");
					Artikal a = new Artikal(p,parts[1],parts[2],kol[0],Integer.parseInt(kol[1]));
					a.setProdavnica(p);
					p.add(a);					
				}
				
			}
			sc.close();
		}catch(Exception e){
			e.printStackTrace();			
		}
		return prodavnice;
	}
	
	
	public static void snimiArtikle(List<Artikal> artikli){	
		try {
			List<Artikal> upisani = new ArrayList<>();
 			PrintWriter pw = new PrintWriter(new File(filePathOut));
			for(Artikal a:artikli){				
				boolean upisan = false;
				for(Artikal ar:upisani){
					if(ar.equals(a) && ar.getProdavnica().equals(a.getProdavnica())){
						upisan = true;
						break;
					}
				}
				if (upisan) continue;
				pw.append("Prodavnica "+a.getProdavnica());
				pw.append(",");
				pw.append(a.getNazivArtikla());
				pw.append(",");
				pw.append(a.getSifra());
				pw.append(",");
				pw.append(a.getVelicina());
				pw.append("-");
				pw.append(String.valueOf(a.getKolicina()));	
				// trazimo ostale iste artikle da upisemo u isti red 
				for(Artikal ar:artikli){
					if(a.getProdavnica().equals(ar.getProdavnica()) && a.getNazivArtikla().equals(ar.getNazivArtikla()) 
							&& a.getSifra().equals(ar.getSifra()) && !a.getVelicina().equals(ar.getVelicina())){
						pw.append(",");
						pw.append(ar.getVelicina());
						pw.append("-");
						pw.append(String.valueOf(ar.getKolicina()));
						upisani.add(ar);						
					}						
				}
				pw.append("\n");
			}
			pw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		

	public static void snimiArtikleZaProdavnicu(List<Artikal> artikli){	
		try {			
 			PrintWriter pw = new PrintWriter(new File(filePathOut));
			for(Artikal a:artikli){				
				pw.append("Prodavnica "+a.getProdavnica());
				pw.append(",");
				pw.append(a.getNazivArtikla());
				pw.append(",");
				pw.append(a.getSifra());
				pw.append(",");
				pw.append(a.getVelicina());
				pw.append("-");
				pw.append(String.valueOf(a.getKolicina()));
				
				pw.append("\n");
			}
			pw.close();			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void snimiProdavnice(List<Prodavnica> prodavnice){	
		try {			
 			PrintWriter pw = new PrintWriter(new File(filePathOut));
 			for(Prodavnica p:prodavnice) {
 				pw.append(p.getNaziv());
 				pw.append("\n");
 				for(Artikal a:p.getArtikli()){				
					pw.append("Prodavnica "+a.getProdavnica());
					pw.append(",");
					pw.append(a.getNazivArtikla());
					pw.append(",");
					pw.append(a.getSifra());
					pw.append(",");
					pw.append(a.getVelicina());
					pw.append("-");
					pw.append(String.valueOf(a.getKolicina()));
					
					pw.append("\n");
				}
 			}
			pw.close();			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
