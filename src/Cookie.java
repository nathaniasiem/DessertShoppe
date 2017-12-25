/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Cookie extends DessertItem {

    /**
     * create instance variables available throughout the class
     */
    private int number;
    private int pricePer12;

    /**
     * constructor to identify the Dessert Item
     *
     * @param name -name of the cookie
     * @param number-number of cookies chosen
     * @param pricePer12 -price per dozen
     */
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;

    }

    /**
     *method to get the price
     * @return the cost of the cookies per dozen
     */
    @Override
    public int getCost() {
        int Cost = (number * pricePer12) / 12;
        return Cost;
    }

    /**
     *method to print out in receipt format
     * @return cookie name, number of cookies and price
     */
    @Override
    public String toString() {
        //store cost into string
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate the width of the receipt
        int Cwidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costToDollars.length();
        //created for loop to go through each character with the exact amount of spaces
        for (int i = 0; i < Cwidth; i++) {
            costToDollars = " " + costToDollars;

        }
        //print out the name, amount of cookies and price
        return number + " @ " + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz " + "\n" + super.getName() + costToDollars;
    }
}
