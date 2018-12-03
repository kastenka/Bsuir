package orderPack;
import exibitionPack.Exibition;
import exibitionPack.countInterface;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Order implements countInterface{

    private List<Exibition> exCollection;
    private double cost;
    private double price;
    private static int orderNumber=0;

    public Order()
    {
        exCollection = new ArrayList<Exibition>();
        orderNumber +=1;
    }

    public void addExibition(Exibition obj)
    {
        exCollection.add(obj);
    }

    public void printOrder(){
        int i=1;
        Iterator it = exCollection.iterator();
        System.out.println("__________________________");
        while(it.hasNext())
        {
            System.out.println(i+")"+(it.next()).toString());
            i+=1;
        }

        System.out.println();
        System.out.println("Cost = " + cost + "\nPrice = " + price);
        System.out.println("__________________________");
    }


    @Override
    public double countPrice() {
        double tempPrice = 0, tempCost = 0;
        Iterator it = exCollection.iterator();
        Exibition obj;
        while(it.hasNext())
        {
            obj = (Exibition)it.next();
            tempCost = tempCost+obj.getCost();
            tempPrice = tempPrice+obj.getPrice();
        }
        cost = tempCost;
        price = tempPrice;
        return tempPrice;
    }

}
