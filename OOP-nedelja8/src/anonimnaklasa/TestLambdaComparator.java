package anonimnaklasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestLambdaComparator {
	
	public static void main(String[] args) {
	
	 List<Integer> al = new ArrayList<Integer>(); 
     al.add(100); 
     al.add(10); 
     al.add(1000); 
     al.add(1); 
     
     Collections.sort(al, (o1, o2) -> o2-o1);     
     
     System.out.println(al);
     
     
     List<String> alStr = new ArrayList<String>(); 
     alStr.add("f"); 
     alStr.add("abc");    
     alStr.add("ccccc"); 
     
     Collections.sort(alStr, (s1,s2)-> s2.length()-s1.length());     
     
     System.out.println(al);
     
     
     
     
     
     
     
     
     /*
     Collections.sort(al, (o1, o2) -> {return (o1 > o2) ? -1 : 
                                   (o1 < o2) ? 1 : 0;});
    
     */
     
     
     
     
   
    
     
     Set<String> set = new TreeSet<String>((s1,s2)-> s2.length()-s1.length());
     
     set.add("abc");
     set.add("f");
     set.add("ccccc");
     
     System.out.println(set);
     
     
     Map<String,String> mojaMapa = new HashMap<String,String>();
     
     
     
     
	}
}
