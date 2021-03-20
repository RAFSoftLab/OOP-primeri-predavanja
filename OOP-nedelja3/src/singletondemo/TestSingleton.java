package singletondemo;

public class TestSingleton {
	
	public static void main(String[] args){	
		
		LazyInitializedSingleton sig1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton sig2 = LazyInitializedSingleton.getInstance();
		System.out.println(sig1==sig2);	 // true
		
	}	
}


