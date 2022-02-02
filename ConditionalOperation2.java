/**********************************************************************
*File        - ConditionalOperation2.java
*Author      - Anu Mathew
*Description - Program to execute conditional operations
*Date        - 25/11/2021
*Version     - 1.0 
********************************************************************/
public class ConditionalOperation2 {
    public static void main(String[] args){
        int num1=100;int num2=20;
        int maximum=num1>num2?num1:num2;
        System.out.println("Maximum: "+maximum);
        int minimum=num1<num2?num1:num2;
        System.out.println("Minimum: "+minimum);
    }
}
