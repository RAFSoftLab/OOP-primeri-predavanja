package singleton_counter;


public class SingletonCounter {
	
	private static SingletonCounter instance;
	
	private int counter = 0;
	
	private SingletonCounter(){}
	
	public static SingletonCounter getInstance(){
		 if(instance == null){
	           instance = new SingletonCounter();
	       }
	       return instance;
	}
	
	public void incrementCounter(){
		counter++;
	}
	
	public int getCounter(){
		return counter;
	}
	

}



