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
}
public String toString() {
String output = "\n";

    }
