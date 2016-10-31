/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Bruger
 */
public class Bear extends Animal {
    
    public Bear(String gender, int amountOfLegs, String sound) {
        this.gender = gender;
        this.amountOfLegs = amountOfLegs;
        this.sound = sound;
    }
    
    /***
     * makes the Bear say its sound
     */
        @Override
    public void makeSound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}