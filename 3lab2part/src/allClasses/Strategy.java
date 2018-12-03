package allClasses;
import gamePack.Game;
import mainPack.Object;
import gamePack.gameInterface;

public abstract class Strategy implements Object, gameInterface {

    protected int maxUnit;
    protected int cardsAmount;
    protected boolean newCard;
    protected int year;
    protected int rating;
    protected String OS;

    public Strategy(){

    }

    public Strategy(int maxUnit, int cardsAmount, boolean newCard, int year, int rating, String OS)
    {
        this.maxUnit = maxUnit;
        this.cardsAmount = cardsAmount;
        this.newCard = newCard;
        this.year = year;
        this.rating = rating;
        this.OS = OS;
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

    public int getYear()
    {
        return year;
    }

    public int getRating(){
        return rating;
    }

    public String getOS()
    {
        return OS;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public void setOS(String OS)
    {
        this.OS = OS;
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
}
