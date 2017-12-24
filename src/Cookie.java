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
       this.number =number;
       this.pricePer12  = pricePer12;

    }

    @Override
    public int getCost() {
        int Cost = (number*pricePer12)/12;
        return Cost;
    }

    @Override
    public String toString() {
        String cents2Dollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        int Cwidth = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        for (int i = 0; i < Cwidth; i++) {
            cents2Dollars = cents2Dollars + "\n";
    } return number + "@" + DessertShoppe.cents2dollarsAndCents(pricePer12)+super.getName()+cents2Dollars;
}
}