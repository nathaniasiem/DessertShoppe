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
        cost = this.cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int ICwidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        for (int i = 0; i < ICwidth; i++) {
            output = output + "\n";
        }
        return super.getName() + output;
    }
}
