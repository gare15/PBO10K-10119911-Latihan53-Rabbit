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
public class IF10K10119911Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("grey","Peter", false,"grass",4);
        System.out.println("Hello, his name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "+rabbit.isiVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}
