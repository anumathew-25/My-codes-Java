/**********************************************************************
*File        - Swap.java
*Author      - Anu Mathew
*Description - Java program to swap two variables
*Date        - 05/12/2021
*Version     - 1.0 
********************************************************************/
import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1=input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2=input.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Number1 after swapping= "+num1);
        System.out.println("Number2 after swapping= "+num2);
        input.close();
    }
}
