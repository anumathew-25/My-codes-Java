/**********************************************************************
*File        - Customer.java
*Author      - Anu Mathew
*Description - Program to demonstarte if else statement
*Date        - 2/2/2022
*Version     - 1.0 
********************************************************************/
public class Customer {
    public static void main(String[] args){
        int discount=5;
        int unitPrice=800;
        int quantity =2;
        
        int totalAmount=unitPrice*quantity;
        String customerType="Regular";
        System.out.println("What is the customer type: ");
        if(customerType=="Regular"){
            totalAmount=totalAmount-(totalAmount*discount/100);
            System.out.println("You are eligible for 5% discount!!");
            System.out.println("The amount should be paid: "+totalAmount);
        }
        else{
            System.out.println("The ampunt Should be paid: "+totalAmount);
        }
    }
}
