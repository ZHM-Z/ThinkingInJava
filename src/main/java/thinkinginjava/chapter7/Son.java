package thinkinginjava.chapter7;

class Father{  
    public void get(){  
        System.out.println("father");  
    }  
}  
public class Son extends Father{  
    public static void main(String[] args) {  
        Father f = new Father();  
        f.get();  
    }  
}  
  
class FatherProxy{  
    private Father f = new Father();  
    public void get(){  
        f.get();  
    }  
}