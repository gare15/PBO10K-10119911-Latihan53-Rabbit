/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119911.latihan53.rabbit;

/**
 *
 * @author tegar
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
    this.vegetarian=vegetarian;
    this.eats=food;
    this.noOfLegs=legs;
    }
    public boolean isiVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}
