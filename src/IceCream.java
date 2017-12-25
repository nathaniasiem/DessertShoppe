/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class IceCream extends DessertItem {
/**
 * create instance variable to be available throughout the class
 */
    public int cost;
/**
 * constructor to identify the Dessert Item
 * @param name-name of the ice cream
 * @param cost -cost of the ice cream
 */
    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }
/**
 * method to get the price
 * @return the cost of the ice cream
 */
    @Override
    public int getCost() {
        return cost;
    }
/**
 * method to print out in receipt format
 * @return name of ice cream and price 
 */
    @Override
    public String toString() {
        //store the price into string
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculate the width of the receipt
        int ICwidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length()-costToDollars.length();
        //create for loop to go through each character with the exact amount of spacing
         for (int i = 0; i < ICwidth; i++) {
            costToDollars = " " + costToDollars;

        }
         //print out the ice cream name and price
         return super.getName() + costToDollars;
    }
}
