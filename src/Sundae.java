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
       this.toppingName  = toppingName;
      this.toppingCost   =toppingCost ;

    }

    @Override
    public int getCost() {
        int sCost = super.cost + toppingCost;
        return sCost;
    }

    @Override
    public String toString() {
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int Cwidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        for (int i = 0; i < Cwidth; i++) {
            output = output + "\n";
        }
        return toppingName + " with " + super.getName() + output;
    }
}
