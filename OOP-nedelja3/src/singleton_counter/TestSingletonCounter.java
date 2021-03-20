package singleton_counter;

public class TestSingletonCounter {
	
	public static void main(String[] args){
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println(sc.getCounter());   // 0
		sc.incrementCounter();
		sc.incrementCounter();
		sc.incrementCounter();
		SingletonCounter.getInstance().incrementCounter();
		SingletonCounter sc1 = SingletonCounter.getInstance();
		sc1.incrementCounter();
		sc1.incrementCounter();
		System.out.println(sc1.getCounter());   // 6
		System.out.println(SingletonCounter.getInstance().getCounter());  // 6
		
	}
}




