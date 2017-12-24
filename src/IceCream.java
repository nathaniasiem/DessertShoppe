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

    public int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        String output = "\n";
        String costToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // Calculating the space that is leftover for the cost within the receipt
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length()-costToDollars.length();
        // Printing the information on the receipt and formating the text properly for the receipt 
        output += super.getName();
        // Return the output
        return output;
    }
}
