/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calamba_070317;

/**
 *
 * @author 3rd Year Account
 */
class FlyingSuperHero extends SuperHero {
 /**
 *This method will display power
 * @param 
 *This method dies not have a parameter
 * @return 
 * 
 * This method does not return any values 
 */
   
    @Override
    void displayPower(){
        System.out.println("Fly...");
    }   
    
    void setSP(String superPowers[]){
        super.setSuperPowers(superPowers);
    }
}

