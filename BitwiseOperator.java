/**********************************************************************
*File        - BitwiseOperator.java
*Author      - Anu Mathew
*Description - Program to execute bitwise operator
*Date        - 1/2/2022
*Version     - 1.0 
********************************************************************/

public class BitwiseOperator {
    public static void main(String[] args){
        int num1=10;
        int num2=-10;
        int num3=5;
        System.out.println(num1<<1);//left shift
        System.out.println(num1>>1);//right shift
        System.out.println(num1<<2);//left shift
        System.out.println(num1>>2);//right shift
        System.out.println(num1>>>2);//right shift
        System.out.println(num2>>>2);//right shift
        System.out.println(num2>>2);//right shift
        System.out.println(num2<<2);//left shift
        System.out.println(num1|num3);//bitwise or
        System.out.println(num1&num3);//bitwise and
    }
}
