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
 * 
 */
    private double weight;
    private int pricePerLbs;
    /**
     * 
     * @param name
     * @param weight
     * @param pricePerLbs 
     */
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        weight = this.weight;
        pricePerLbs = this.pricePerLbs;    
    }
/**
 * 
 * @return 
 */
    @Override
    public int getCost() {
       int Cost = (int)(Math.round(weight)*pricePerLbs);
       return Cost;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        String output= DessertShoppe.cents2dollarsAndCents(this.getCost());
        int widthLeft = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        return output;
    }
}
