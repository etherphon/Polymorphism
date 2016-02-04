/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author etherdesign
 */
public class Startup4 {
    
    public static void main(String[] args) {
        
        Pet[] pets = {
            new Cat("Felix", 7),
            new Dog("Odie", 3),
            new Hamster("Hammy", 1),
            new Snake("Slippery Pete", 2)
        };
        
        for (Pet p : pets) {
            p.Feed();
        }
        
        for (Pet p : pets) {
            p.Pet();
        }
        
    }
}
