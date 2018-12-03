/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2labaa;

import newpackage.WriteInfo;
import newpackage.Butter;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Butter butterArray [] = new Butter[4];
        butterArray[0] = new Butter();
        butterArray[1] = new Butter("Second",23 );
        butterArray[2] = new Butter("Third", true, 24);
        butterArray[3] = new Butter();
        
         WriteInfo writeButter = new WriteInfo();
         System.out.println("1.Info about butter");
         butterArray[1].printInfo();
         System.out.println();
         
         butterArray[1].setHerbalSupplements(true);
         butterArray[0].setName("New butter");
         butterArray[0].setPrice(22);
         butterArray[0].setHerbalSupplements(false);
         
         System.out.println("2.Info about butter");
         butterArray[0].printName();
         butterArray[0].printPrice();
         boolean testButter = butterArray[0].isHerbalSupplements();
         System.out.println("HerbalSupplements(new): " + testButter);
         
         for(int i=0;i<4;i++)
         {
          System.out.println(butterArray[i].getPrice());
          System.out.println(butterArray[i].isHerbalSupplements());
         }
         System.out.println("Total price of butter: " +  Butter.f1(butterArray));
         System.out.println("Amount of butter with h.s.: " +  Butter.hasSupplements(butterArray));
    
}
}
