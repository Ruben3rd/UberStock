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
public class UClub extends User
{
  private final double reward = 0.05;
  private final double annualFee = 19.95;
  private double credit;
  private double rewardAmount; //amount to credit user based on reward*cartTotal

    public double getReward() {
        return reward;
    }

    public double getAnnualFee() {
        return annualFee;
    }

    public double getRewardAmount() {
        
        return rewardAmount;
    }

    public void setRewardAmount(double rewardAmount) {
        this.rewardAmount = this.getReward()*this.getCartTotal();
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit() {
        this.credit = this.getRewardAmount();
    }
    
    
  
}
