/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Candy extends DessertItem {

    /**
     * create instance variables to be available throughout class
     */
    private double weight;
    private int pricePerLbs;

    /**
     *constructor to identify the DessertItem
     * @param name - name of the candy
     * @param weight-weight amount of the candy
     * @param pricePerLbs- price based on the weight
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     *method to get the price
     * @return the total cost of the candy by weight
     */
    @Override
    public int getCost() {
        int Cost = (int) (Math.round(this.weight * this.pricePerLbs));
        return Cost;
    }

    /**
     *method to print out in receipt format
     * @return the candy name, the weight and the price
     */
    @Override
    public String toString() {
        //Store the cost into string
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate the width left in the receipt
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length() - costToDollars.length();
        //use for loop to go through all the characters with the exact amount of spacing
        for (int i = 0; i < width; i++) {
            costToDollars = " " + costToDollars;
        }
        //print out the name, amount of candy and price
        return weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb. "
                + "\n" + super.getName() + costToDollars;

    }
}
