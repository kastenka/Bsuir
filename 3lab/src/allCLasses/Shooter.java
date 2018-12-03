/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allCLasses;
import gamePack.Game;

/*
переопред методов

 */
public class Shooter extends Game{
    
    private int levelAmount;
    private String typeOfGun;
    
    public Shooter(){
        
    }
    
    public Shooter(int levelAmount, String typeOfGun)
    {
        this.levelAmount = levelAmount;
        this.typeOfGun = typeOfGun;
    }
    
    public Shooter(int year,int rating, String OS,int levelAmount, String typeOfGun)
    {
        super(year, rating, OS);
        this.levelAmount = levelAmount;
        this.typeOfGun = typeOfGun;
    }
    
    public int getLevelAmount()
    {
        return levelAmount;
    }
    
    public String getTypeOfGun()
    {
        return typeOfGun;
    }
    
    public void setLevelAmount(int levelAmount)
    {
        this.levelAmount = levelAmount;
    }
    
    public void setTypeOfGun(String typeOfGun)
    {
        this.typeOfGun = typeOfGun;
    }
    
    @Override
     public String newTitle()
    {
        return "This is SHOOTER";
    }
     
     @Override
     public String toString(){
        return newTitle() + "\n" +
                "Year = " + getYear() + "\n" + 
                "Rating = " + getRating() + "\n" +
                "OS = " + getOS() + "\n" +
                "Amount of levels = " + getLevelAmount() +"\n"+
                "Type of gun = " + getTypeOfGun() +"\n";
    }
    
}
