/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

import java.util.LinkedList;

/**
 *
 * @author victor
 */
public class State4 {
    private Vehicle v1;
   private Vehicle v2;
    private Package pac1;
    private Package pac2;
     private boolean carry1;
    private boolean carry2;

    public State4(Vehicle vehicle1,Vehicle vehicle2, Package p1,Package p2, boolean input1, boolean input2)
    {
        v1=vehicle1;
        v2 = vehicle2;
        pac1 = p1;
        pac2=p2;
        carry1 = input1;
        carry2= input2;
    }


    public Vehicle getVehicle1()
    {
        return this.v1;

    }
    public Vehicle getVehicle2()
    {
        return this.v2;

    }
    

    public Package getfirstPackage()
    {
        return this.pac1;
    }
    
     public Package getSecPackage()
    {
        return this.pac2;
    }


    public boolean getCarry1()
    {
        return this.carry1;

    }
    public boolean getCarry2()
    {
        return this.carry2;

    }



    public void setVehicle1Location(Location l)
    {
        
        this.v1.setLocation(l.getX(), l.getY());

    }
    public void setVehicle2Location(Location l)
    {
        
        this.v2.setLocation(l.getX(), l.getY());

    }


    public void setPackage1Location(Location l)
    {
        this.pac1.setLocation(l.getX(), l.getY());

    }
    public void setPackage2Location(Location l)
    {
        this.pac2.setLocation(l.getX(), l.getY());

    }


    public void setCarry1(boolean input)
    {
        this.carry1 = input;

    }
    public void setCarry2(boolean input)
    {
        this.carry2 = input;

    }
    
    public String toString(){
        String str;
        str="V=["+v1.getX()+"]["+v1.getY()+"]v=["+v2.getX()+"]["+v2.getY()+"]";
        str=str+"\nP=["+pac1.getX()+"]["+pac1.getY()+"] | "  ;
        str=str+"["+pac2.getX()+"]["+pac2.getY()+"]";
        str=str+"\nC=["+carry1+"]["+carry2+"]";
        str=str+"\n";
        return str;
    }
    
}
