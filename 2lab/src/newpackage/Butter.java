/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author HP
 */
public class Butter {
    
    private String name;
    
        private boolean herbalSupplements;
        private double price;
        public static int commonSupplements = 0;
        public static double myPrice = 0;
        
        public void setName(String name) //присвоить значение полю
        {
            this.name = name;
        }
        
        public void setHerbalSupplements(boolean herbalSupplements)
        {
            this.herbalSupplements = herbalSupplements;
        }
        
        public void setPrice(double price)
        {
            this.price = price;
        }
        
        public Butter()
        {
            name = "Land Lakes";
            herbalSupplements = true;
            price = 21;
        }
        
        public Butter(String name,boolean herbalSupplements,double price)
        {
            this.herbalSupplements = herbalSupplements;
            this.price = price;
            this.name = name;
        }
        
        public Butter(String name,double price)
        {
            this.price = price;
            this.name = name;
        }
        
        public String getName() //получаем данные, тк доступ ограничен
        {
            return name;
        }
        
        public boolean isHerbalSupplements()
        {
            return herbalSupplements;
        }
        
        public double getPrice()
        {
            return price;
        }

        public void printInfo()
        {
            System.out.println("Type of butter: "+name);
            
            if(herbalSupplements)
               System.out.println("Herbal supplements: +"); 
            else
                System.out.println("Herbal supplements: -"); 
         
            System.out.println("Price: "+price);
        }
        
        public void printPrice()
        {
            System.out.println("Price: "+price);
        }
        
        public void printName()
        {
            System.out.println("Name: "+name);
        }
        
        public static double f1(Butter [] commonPrice)
        {
            int p=0;
            for(int i =0;i<4;i++)
            {
                p+=commonPrice[i].getPrice();
            }
            return p;
        }
        
        public static int hasSupplements(Butter[] commonSupplements)
        {
            int p=0;
            for(int i =0;i<4;i++)
            {
                if(commonSupplements[i].isHerbalSupplements())
                    p++;
            }
            return p;
        }
}
