/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Sundae extends IceCream {
/**
 * create instance variables to be available throughout class
 */
    private String toppingName;
    private int toppingCost;
/**
 * constructor to identify the Dessert Item
 * @param icName-name of the ice cream flavour
 * @param icCost-ice cream flavour price
 * @param toppingName-type of sundae topping
 * @param toppingCost -price of the sundae topping
 */
    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
       this.toppingName  = toppingName;
      this.toppingCost   =toppingCost ;

    }
/**
 * method to calculate the cost of the sundae
 * @return total price of the sundae 
 */
    @Override
    public int getCost() {
        int sCost = super.cost + toppingCost;
        return sCost;
    }
/**
 * method to print out in receipt format
 * @return the name of the sundae topping with ice cream flavour and price
 */
    @Override
    public String toString() {
        //store the price as string
        String centsToDollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        //calculate the width of the receipt
        int Cwidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length()-centsToDollars.length();
        //create for loop to go through each character with the exact amount of spacing
        for (int i = 0; i < Cwidth; i++) {
            centsToDollars =  " " + centsToDollars ;
        }
        //print out sundae topping with ice cream flavour and price
        return toppingName + " with\n" + super.getName() + centsToDollars;
    }
}
