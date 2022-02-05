/**********************************************************************
*File        - Largest.java
*Author      - Anu Mathew
*Description - Program to find the largest of 3 numbers
*Date        - 05/02/2022
*Version     - 1.0 
********************************************************************/
public class Largest {
    public static void main(String[] args) {
		int num1=3;
		int num2=4;
		int num3=1;
		if(num1>num2 && num1>num3){
		    System.out.println("The largest number is "+num1);
		}
		else if(num2>num1&&num2>num3){
		    System.out.println("The largest number is "+num2);
		}
		else if(num3>num1&&num3>num2){
		    System.out.println("The largest number is "+num3);
		}
		else if(num1==num2 &&num1>num3){
		    System.out.println("The largest number is "+num1);
		}
		else if(num2==num3&&num2>num1){
		    System.out.println("The largest numberis "+num2);
		}
		else if (num1==num2&&num2==num3){
		    System.out.println("All the three numbers are equal ");
		}
		
		
	}
}

