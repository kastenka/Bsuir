package otherClasses;
import exibitionPack.Exibition;


public class Vase extends Exibition{

    private String factory;
    private int id;
    private static int number;

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory){
        this.factory = factory;
    }

    public Vase(int year, double price, double cost, String factory){
        super(year, price, cost);
        generateName();
        this.factory = factory;
        this.id = number;
        number +=1;
    }

    public Vase(){
        super();
        generateName();
        this.factory = factory;
        this.id = number;
        number +=1;
    }


    @Override
    protected void generateName() {
        name="Vase";
    }

    @Override
    public String toString()
    {
        String myString = new String();
        myString = super.toString() + "\n" +
                "Factory = " + factory + "\n";
        return myString;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;
        if(this==obj)
            return true;
        if(obj instanceof Book )
        {
            Vase temp=(Vase) obj;
            return this.id==temp.id && this.cost==temp.cost &&
                    this.factory.equals(temp.factory) &&
                    this.name.equals(temp.name) &&
                    this.price==temp.price &&
                    this.year==temp.year;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        return hash;
    }
}
