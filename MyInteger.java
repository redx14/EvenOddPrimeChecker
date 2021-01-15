//Andrey Ilkiv
//comp 271
//lab1
package lab1;
public class MyInteger {
    private int value = 0;
    
    public MyInteger(int x){
        value = x;                
    }
    public int getValue(){
        return value;
    }
    
    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isOdd(){
        return value % 2 != 0;  
    }
    public boolean isPrime(){
        if (value<0){
            return false;
        }
        for (int factor = 2; factor<= value/2; factor++){
            if (value % factor ==0){
                return false;
            }
        }
        return true;              
    }
    
    public static boolean isEven(int x){
        return x % 2 == 0;
    }
    public static boolean isOdd(int x){
        return x % 2 != 0;  
    }
    public static boolean isPrime(int x){
        if (x<0){
            return false;
        }
        for (int factor = 2; factor<= x/2; factor++){
            if (x % factor ==0 || x<0){
                return false;
            }
        }
        return true;               
    }
    
    public static boolean isEven(MyInteger x){
        return x.isEven();        
    }
    public static boolean isOdd(MyInteger x){
        return x.isOdd();
    }
    public static boolean isPrime(MyInteger x){
        return x.isPrime();
    }
    
    public boolean equals(int x){
        return value == x;
    }
    public boolean equals(MyInteger x){
        return equals(x.getValue());
    }
    
    public static int parseInt(char[] x) {
        int total = 0;
        for (int i = 0; i < x.length; i++){
            int num= Character.getNumericValue(x[i]);
            total+= num * Math.pow(10, x.length-1-i);
        }
        return total;
    }    
    public static int parseInt(String x) {
        return Integer.valueOf(x);
    }
    
}
