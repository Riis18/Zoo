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
public class MainZoo {
    Zoo Z = new Zoo();
    
    Z.add(new Lion("male",4,"grrr!"));
    Z.add(new Bear("female",4,"wrooo"));
    
    Z.allAnimalsMakeSound();
    Z.CountLegs();
    Z.getNumberOfGender("male");
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
