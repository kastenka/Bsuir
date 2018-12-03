package allClasses;
import allClasses.Strategy;

public class stepStrategy extends Strategy{

    private String city;

    public void setCity(String city){
        this.city = city;
    }

    public String gettCity(){
        return city;
    }

    @Override
    public String newTitle()
    {
        return "This is STEP_BY_STEP STRATEGY";
    }

    public stepStrategy(){

    }

    public stepStrategy(int maxUnit, int cardsAmount, boolean newCard, int year, int rating, String OS, String city)
    {
        super(maxUnit, cardsAmount, newCard, year, rating, OS);
        this.city = city;
    }

    @Override
    public void print(){
        System.out.println(newTitle() + "\n" +
                "City = " + gettCity() + "\n" +
                "Year = " + getYear() + "\n" +
                "Rating = " + getRating() + "\n" +
                "OS = " + getOS() + "\n" +
                "Max unit = " + getMaxUnit() +"\n"+
                "Cards amount = " + getCardsAmount() +"\n"+
                "New card = " + getNewCard() +"\n");
    }
}
