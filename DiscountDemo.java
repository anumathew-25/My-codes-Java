/**********************************************************************
*File        - DiscountDemo.java
*Author      - Anu Mathew
*Description - Program to calculate the discount amount 
*Date        - 1/2/2022
*Version     - 1.0 
********************************************************************/
public class DiscountDemo {
    public static void main(String[] args){
        int discountPercentage =10;
        double totalAmount=800;
        double priceAfterDiscount =totalAmount*(1-(double)discountPercentage/100);
        if(totalAmount>500){
            priceAfterDiscount =priceAfterDiscount*(1-(double)discountPercentage/100);
            System.out.println("The customer has paid a bill of amount: "+priceAfterDiscount);
        }
        else{
            System.out.println("The customer ha paid a bill of  amount: "+priceAfterDiscount);
        }
    }
}
