/**********************************************************************
*File        - Largest.java
*Author      - Anu Mathew
*Description - Program to find the the sum of the digits of a number
*Date        - 05/02/2022
*Version     - 1.0 
********************************************************************/
import java.util.Scanner;
public class WhileDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber=sc.nextInt();
        int temp=0;
        int sumOfDigits=0;
        while(inputNumber>0){
            temp=inputNumber%10;
            sumOfDigits +=temp;
            inputNumber=inputNumber/10;
            
        }
        System.out.println("The sum of digits of the given number is "+sumOfDigits);
        sc.close();
    } 
}
