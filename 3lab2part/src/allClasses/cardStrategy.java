package allClasses;
import allClasses.Strategy;

public class cardStrategy extends Strategy{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public cardStrategy(){

    }

    public cardStrategy(int maxUnit, int cardsAmount, boolean newCard, int year, int rating, String OS, String name)
    {
        super(maxUnit, cardsAmount, newCard, year, rating, OS);
        this.name = name;
    }

    @Override
    public String newTitle()
    {
        return "This is CARD STRATEGY";
    }

    @Override
    public void print(){
        System.out.println(newTitle() + "\n" +
                "Name = " + getName() + "\n" +
                "Year = " + getYear() + "\n" +
                "Rating = " + getRating() + "\n" +
                "OS = " + getOS() + "\n" +
                "Max unit = " + getMaxUnit() +"\n"+
                "Cards amount = " + getCardsAmount() +"\n"+
                "New card = " + getNewCard() +"\n");
    }
}
