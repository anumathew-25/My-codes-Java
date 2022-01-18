/**********************************************************************
*File        - Addition.java
*Author      - Anu Mathew
*Description - Program to execute division
*Date        - 30/11/2021
*Version     - 1.0 
********************************************************************/
import java.util.Scanner;
public class Division {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer :");
        int num1=input.nextInt();
        System.out.print("Enter the divisor: ");
        int num2=input.nextInt();
        float Division =(float)num1/num2;
        System.out.print("The result of division is "+Division);
        input.close();
    }
}
