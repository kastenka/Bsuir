/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import newpackage.Butter;

/**
 *
 * @author HP
 */
public class WriteInfo {
    public void showButter(Butter myButter)
    {
        System.out.println("Type of butter:   "+myButter.getName());
        if(myButter.isHerbalSupplements())
        System.out.println("Herbal supplements:  + ");
        else
        System.out.println("Herbal supplements:  - ");
        System.out.println("Price:   " +myButter.getPrice());
    }
    }
