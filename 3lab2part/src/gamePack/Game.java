package gamePack;

public class Game {

    protected int year;
    protected int rating;
    protected String OS;

    public Game()
    {

    }

    public Game(int year,int rating, String OS)
    {
        this.year = year;
        this.rating = rating;
        this.OS = OS;
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

    public String newTitle()
    {
        return "smth";
    }
}
