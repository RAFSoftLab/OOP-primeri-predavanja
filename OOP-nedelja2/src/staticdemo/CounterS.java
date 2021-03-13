package staticdemo;

public class CounterS {
	
	static int count=0;
	
	CounterS(){  
		count++;  
		System.out.println(count);  
	}  
	  
	public static void main(String args[]){  	  
		CounterS c1=new CounterS();  
		CounterS c2=new CounterS();  
		CounterS c3=new CounterS();  	  
	 }  
}







