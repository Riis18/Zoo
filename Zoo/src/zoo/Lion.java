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
public class Lion extends Animal {
    
    public Lion(String gender, int amountOfLegs, String sound) {
        this.gender = gender;
        this.amountOfLegs = amountOfLegs;
        this.sound = sound;
    }

    /***
     * Makes the Lion amke a sound
     */
    @Override
    public void makeSound() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
