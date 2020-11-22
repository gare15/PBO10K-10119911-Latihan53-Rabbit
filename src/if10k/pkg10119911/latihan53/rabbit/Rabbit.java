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
public class Rabbit extends Animal{
    private String color;
    private String name;

    public Rabbit(String color, String name,boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
        this.name=name;
        this.vegetarian=vegetarian;
        this.eats=food;
        this.noOfLegs=legs;
        this.color=color;
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
