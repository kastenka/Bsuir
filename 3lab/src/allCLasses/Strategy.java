/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allCLasses;
import gamePack.Game;
/*
 *
переопред методов
 * @author HP
 */
public class Strategy extends Game{
    
    private int maxUnit;
    private int cardsAmount;
    private boolean newCard;
    
    public Strategy(){
        
    }
    
    public Strategy(int maxUnit, int cardsAmount, boolean newCard) 
    {
        this.maxUnit = maxUnit;
        this.cardsAmount = cardsAmount;
        this.newCard = newCard;
    }
    
    public Strategy(int year, int rating, String OS, int maxUnit, int cardsAmount, boolean newCard)
    {
        super(year, rating, OS);
        this.maxUnit = maxUnit;
        this.cardsAmount = cardsAmount;
        this.newCard = newCard;
    }
    
    public int getMaxUnit(){
        return maxUnit;
    }
    
    public int getCardsAmount(){
        return cardsAmount;
    }
    
    public boolean getNewCard(){
        return newCard;
    }
    
    public void setMaxUnit(int maxUnit){
        this.maxUnit = maxUnit;
    }
    
    public void setCardsAmount(int cardsAmount){
        this.cardsAmount = cardsAmount;
    }
    
    public void serNewCard(boolean newCard){
        this.newCard = newCard;
    }
    
    @Override
     public String newTitle()
    {
        return "This is STRATEGY";
    }
     
     @Override
     public String toString(){
        return newTitle() + "\n" +
                "Year = " + getYear() + "\n" + 
                "Rating = " + getRating() + "\n" +
                "OS = " + getOS() + "\n" +
                "Maximum unit = " + getMaxUnit() +"\n"+
                "Cards amount = " + getCardsAmount() +"\n" +
                "New card = " + getNewCard() +"\n";
    }
}
