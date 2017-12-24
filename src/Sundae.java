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

    private String toppingName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
        super(icName, icCost);
        this.toppingName = toppingName;
        this.toppingCost = toppingCost;

    }

    @Override
    public int getCost() {
        int sCost = super.cost + toppingCost;
        return sCost;
    }

    @Override
    public String toString() {
        //convert cents to dollars using cens2dollarsAndCents
        String output = DessertShoppe.cents2dollarsAndCents(super.getCost());

        //create string storing cost in a string 
        String costLength = Integer.toString(super.getCost() + this.getCost());
        //find spacing needed between name and cost in reciept by subtracting 30(total spaces) by 

        //length of name and length of cost
        int spacing = 30 - super.getName().length() - costLength.length() - 1;

        //loop through an add a space each time up to "spacing" integer
        for (int i = 0; i < spacing; i++) {
            output = " " + output;
        }
        //return name of cookie along with cost
        return this.toppingName + " Sundae with\n" + this.getName() + output;
    }
}
