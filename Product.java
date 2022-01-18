/**********************************************************************
*File        - Addition.java
*Author      - Anu Mathew
*Description - Program to find product of two numbers
*Date        - 30/11/2021
*Version     - 1.0 
********************************************************************/
import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1=input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2=input.nextInt();
        int product=num1*num2;
        System.out.println("The product of "+num1+" and "+num2+" is "+product);
        input.close();
    }
}
