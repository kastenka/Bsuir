package otherClasses;
import exibitionPack.Exibition;

public class Book extends Exibition {

    private String country;
    private int id;
    private static int number;

    public String getCountry() {
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }

    public Book(int year, double price, double cost, String country){
        super(year, price, cost);
        generateName();
        this.country = country;
        this.id = number;
        number +=1;
    }

    public Book(){
        super();
        generateName();
        this.country = country;
        this.id = number;
        number +=1;
    }

    @Override
    protected void generateName() {
        name="Book";
    }

    @Override
    public String toString()
    {
        String myString = new String();
        myString = super.toString() + "\n" +
                "Country = " + country + "\n";
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
            Book temp=(Book)obj;
            return this.id==temp.id && this.cost==temp.cost &&
                    this.country.equals(temp.country) &&
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
