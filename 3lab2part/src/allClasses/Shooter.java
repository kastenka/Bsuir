package allClasses;
import gamePack.Game;
import mainPack.Object;
import gamePack.gameInterface;

public class Shooter extends Game implements Object, gameInterface{

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

    public void print() {

        System.out.println(newTitle() + "\n" +
                "Year = " + getYear() + "\n" +
                "Rating = " + getRating() + "\n" +
                "OS = " + getOS() + "\n" +
                "Amount of levels = " + getLevelAmount() +"\n"+
                "Type of gun = " + getTypeOfGun() +"\n");
    }
}
