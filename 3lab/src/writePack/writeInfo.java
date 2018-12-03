/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writePack;
import allCLasses.Quest;
import allCLasses.Shooter;
import allCLasses.Strategy;

/*вывод инфы о классах
 *
 * @author HP
 */
public class writeInfo {
    
    public static void main(String[] args)
    {
        Quest quest1 = new Quest(2000, 5, "Windows", 12);
        System.out.println(quest1.toString());
        Quest quest2 = new Quest(2000, 5, "MacOS", 12);
        System.out.println(quest2.toString());
        
        Shooter shooter1 = new Shooter(2010, 4, "Linux", 55, "First");
        System.out.println(shooter1.toString());
        Shooter shooter2 = new Shooter(2010, 4, "Windows", 55, "Second");
        System.out.println(shooter2.toString());
        
        Strategy strategy1 = new Strategy(2018, 2, "Linux", 10, 10, false);
        System.out.println(strategy1.toString());
        Strategy strategy2 = new Strategy(2018, 2, "MacOS", 10, 10, true);
        System.out.println(strategy2.toString());
        
    }
   
}
