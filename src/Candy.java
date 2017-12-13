/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author @simon7323
 */
public class Candy extends DessertItem {

    private double weight;
    private int pricePerLbs;
    public Candy(String name, double weight, int pricePerLbs) {
        super(name);
        weight = this.weight;
        pricePerLbs = this.pricePerLbs;    
    }

    @Override
    public int getCost() {
       int Cost = (int)(Math.round(weight)*pricePerLbs);
       return Cost;
    }
    @Override
    public String toString() {
        String output ="\n";
        output+=
    }
}
