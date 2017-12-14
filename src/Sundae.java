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
        super(icName,icCost);
        toppingName = this.toppingName;
        toppingCost=this.toppingCost;

    }

    @Override
    public int getCost() {
        sCost = icCost+toppingCost;
        return sCost;
    }

    public String toString() {
    }
}
