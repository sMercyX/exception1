
package exception1;

import java.util.Scanner;

public class Qoutient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try{
            System.out.println(number1+"/"+number2+" = "+(number1/number2));
        }   
        catch(ArithmeticException e){
            System.out.println("Divisor cannot be zero");
        }
    }
    
}
