package exibitionPack;

public abstract class Exibition implements countInterface {
    protected int year;
    protected double price;
    protected double cost;
    protected String name;

    public int getYear() {
        return year;
    }

    public double getCost(){
        return cost;
    }

    public double getPrice() {
        return price;
    }


    public void setYear(int year){
        this.year = year;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    protected void setPrice(){
        price = countPrice();
    }

    public void setCost(int cost){
        this.cost = cost;
        setPrice();
    }

    public Exibition()
    {
        this.name = "null";
        this.price = 0;
        this.cost = 0;
        this.year = 0;
    }

    public Exibition(int year, double price, double cost){
        this.price = price;
        this.cost = cost;
        this.year = year;
    }


    abstract protected void generateName();

    @Override
    public double countPrice(){
        double price;
        price = (cost*1.2)*1.2;
        return price;
    }

    @Override
    public String toString() {

        String myString = new String();
        myString = "Name = " + name + "\n" +
                "Year = " + year + "\n" +
                "Price = " + price + "\n" +
                "Cost = " + cost ;

        return myString;
    }
}
