/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Cookie extends DessertItem {

    private int CookieNum;
    private int price;
    
    public Cookie(String name, int number, int pricePer12) {
        super(name);
        number=this.CookieNum;
        pricePer12 = this.price;

    }

    @Override
    public int getCost() {
        int Cost = number;
        return Cost;
    }

    @Override
    public String toString() {
    }
}
