/**********************************************************************
*File        - MultiplicationTable.java
*Author      - Anu Mathew
*Description - Java program that takes a number as input and prints its multiplication table upto 10.
*Date        - 30/11/2021
*Version     - 1.0 
********************************************************************/
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num =input.nextInt();
        for(int i=1;i<=10;i++){
            int product=i*num;
            System.out.println(num+"*"+i+"="+product);
        }
        input.close();
    }
}
