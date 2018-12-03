package allClasses;
import gamePack.Game;
import mainPack.Object;
import gamePack.gameInterface;

public class Quest extends Game implements Object, gameInterface{

    private int age;

    public Quest(int year,int rating, String OS, int age){
        super(year, rating, OS);
        this.age = age;
    }


    public int getAge()
    {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Quest(){

    }

    public Quest(int age){
        this.age = age;
    }

    @Override
    public String newTitle()
    {
        return "This is QUEST";
    }

    @Override
    public void print(){
        System.out.println(newTitle() + "\n" +
                "Year = " + getYear() + "\n" +
                "Rating = " + getRating() + "\n" +
                "OS = " + getOS() + "\n" +
                "Age = " + getRating() +"\n");
    }
}
