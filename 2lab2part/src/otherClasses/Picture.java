package otherClasses;
import exibitionPack.Exibition;


public class Picture extends Exibition {

    private String form;
    private int id;
    private static int number;

    public String getForma(){
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Picture(int year, double price, double cost, String form){
        super(year, price, cost);
        generateName();
        this.form = form;
        this.id = number;
        number +=1;
    }

    public Picture(){
        super();
        generateName();
        this.form = form;
        this.id = number;
        number +=1;
    }


    @Override
    protected void generateName() {
        name="Picture";
    }

    @Override
    public String toString()
    {
        String myString = new String();
        myString = super.toString() + "\n" +
                "Form = " + form + "\n";
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
            Picture temp=(Picture) obj;
            return this.id==temp.id && this.cost==temp.cost &&
                    this.form.equals(temp.form) &&
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
