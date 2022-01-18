/**********************************************************************
*File        - TwoNumOperation.java
*Author      - Anu Mathew
*Description - Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
*Date        - 30/11/2021
*Version     - 1.0 
********************************************************************/
import java.util.Scanner;
public class TwoNumOperations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the firs integer: ");
        int num1=input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        int substraction= num1-num2;
        int multiplication=num1*num2;
        float division=(float)num1/num2;
        int remainder=num1%num2;
        System.out.println("Sum= "+sum);
        System.out.println("Substraction= "+substraction);
        System.out.println("Multiplication= "+multiplication);
        System.out.println("Division= "+division);
        System.out.println("Remainder= "+remainder);
        input.close();
    }
}
