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
public abstract class User 
{
     
    private String userName;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String email;
    private String password;//Use a password?
    private double cartTotal;
    private final double TAX = .0825;

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    
}
