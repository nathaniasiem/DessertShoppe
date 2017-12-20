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

    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        number=this.number;
        pricePer12 = this.pricePer12;

    }

    @Override
    public int getCost() {
        int Cost = (number/12)*pricePer12;
        return Cost;
    }

    @Override
    public String toString() {
        String output = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int Cwidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        for (int i = 0; i < Cwidth; i++) {
            output = output + "\n";
    } return number + "@" + DessertShoppe.cents2dollarsAndCents(pricePer12)+super.getName()+output;
}
}