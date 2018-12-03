/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePack;

/*
 *год выпуска, рейтинг и ОС
геттеры
метод класса название, который будет потом переопределяться
 * @author HP
 */
public abstract class Game {
    
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
    
    @Override
    public String toString(){
        return "Year = " + getYear() + "\n" +
                "Rating = " + getRating() +"\n"+
                "OS = " + getOS() +"\n";
      
    }
}

