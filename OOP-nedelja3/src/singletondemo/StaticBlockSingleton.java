package singletondemo;

public class StaticBlockSingleton {
	
    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    static{        
    	
         instance = new StaticBlockSingleton();        
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}



