/*************************************************************** 
*File        - Customer1.java
*Author      - Anu Mathew
*Description - Program to demonstarte switch case
*Date        - 2/2/2022
*Version     - 1.0 
********************************************************************/
public class Customer1 {
    public static void main(String[] args){
        String item="Sandwich";
        switch(item){
            case "Burger":
            System.out.println("You've ordered Burger.The price is $10");
            break;
            case "Pizza":
            System.out.println("You've ordered Pizza.The price is $15");
            break;
            case "Sandwich":
            System.out.println("You've ordered Sandwich.The price is $8");
            break;
            default:
            System.out.println("Invalid selection");
            

        }

    }
}
