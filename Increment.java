
package InvokeMethodWithArguments;


public class Increment {
    
    public static void increment(int i){
        i++;
        System.out.println("i inside the mehtod is: " + i);
    }

    public static void main(String[] args) {
        
        int x=1;
        System.out.println("Before the call 'x' is: " +x);
        increment(x);
        System.out.println("After the call 'x' is: " + x);
        
    }
    
}
