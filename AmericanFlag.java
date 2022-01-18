/**********************************************************************
*File        - AmericanFlag.java
*Author      - Anu Mathew
*Description - Java program to print an American flag on the screen
*Date        - 05/12/2021
*Version     - 1.0 
********************************************************************/
public class AmericanFlag {
    public static void main(String[] args){
        String p1="* * * * * * ==================================\n";
        String p2=" * * * * *  ==================================";
        String p3="==============================================";
        for(int i=0;i<4;i++){
            System.out.println(p1+p2);
        }
        System.out.print(p1);
        for(int i=0;i<8;i++){
            System.out.println(p3);
        }
    }
    
}
