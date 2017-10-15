/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uberstock;

/**
 *
 * @author jake
 */
public class StandardUser extends User 
{
    private boolean upgrade = false; //set to true if user wants to upgrade in menu
    
    
    public void setUpgrade(boolean x)
    {
        this.upgrade = x;
    }
   
    //pass in user input if they want to upgrade
    public void standardUpgrade(char choice)
    {
        
    if(choice == '1')
        {
            this.setUpgrade(true);
        }
    
    }
    
    
    
    
    
}
