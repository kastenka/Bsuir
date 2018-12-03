package mainPack;
import allClasses.cardStrategy;
import allClasses.stepStrategy;
import allClasses.Quest;
import allClasses.Shooter;


public class writeInfo {

    public static void main(String[] args)
    {
        Quest quest1 = new Quest(2000, 5, "Windows", 12);
        quest1.print();
        Quest quest2 = new Quest(2000, 5, "MacOS", 12);
        quest2.print();

        Shooter shooter1 = new Shooter(2010, 4, "Linux", 55, "First");
        shooter1.print();
        Shooter shooter2 = new Shooter(2010, 4, "Windows", 55, "Second");
        shooter2.print();

        cardStrategy card1 = new cardStrategy(12, 2, false, 2030, 1, "MacOS", "new_strategy");
        stepStrategy card2 = new stepStrategy(12, 2, false, 2030, 1, "MacOS", "new_city ");
        card1.print();
        card2.print();
    }

}
