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
 * @return the total cost of the candy by weight 
 */
    @Override
    public int getCost() {
       int Cost = (int)(Math.round(weight)*pricePerLbs);
       return Cost;
    }
    /**
     * 
     * @return the candy name and the weight with price
     */
    @Override
    public String toString() {
        String output= DessertShoppe.cents2dollarsAndCents(this.getCost());
        int width = DessertShoppe.RECEIPT_WIDTH - super.getName().length();
        //create for loop to got through each character until reaching the last spot available
        for(int i=0;i<width;i++){
            output = output+ "\n";
        }
        return weight + "lbs. @ " +DessertShoppe.cents2dollarsAndCents(pricePerLbs)  + "/lb"
                + super.getName() + output; 
        
        
    }
}
