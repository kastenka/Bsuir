/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allCLasses;
import gamePack.Game;
/*
 *переопред методов
 * @author HP
 */
public class Quest extends Game{
    
    private int age;
    
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
    
    public Quest(int year,int rating, String OS, int age){
        super(year,rating,OS);
        this.age = age;
    }
    
    @Override
    public String newTitle()
    {
        return "This is QUEST";
    }
     
     @Override
     public String toString(){
        return newTitle() + "\n" +
                "Year = " + getYear() + "\n" + 
                "Rating = " + getRating() + "\n" +
                "OS = " + getOS() + "\n" +
                "Age = " + getRating() +"\n";
      
    }
}
