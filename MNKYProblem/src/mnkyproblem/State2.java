package mnkyproblem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class State2 {
    Vehicle veh;
    Package pac1;
    Package pac2;
    boolean carry1;
    boolean carry2;

    public State2(Vehicle v, Package p1,Package p2, boolean input1, boolean input2)
    {
        veh = v;
        pac1 = p1;
        pac2=p2;
        carry1 = input1;
        carry2= input2;
    }


    public Vehicle getVehicle()
    {
        return this.veh;

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



    public void setVehicleLocation(Location l)
    {
        
        this.veh.setLocation(l.getX(), l.getX());

    }


    public void setPackage1Location(Location l)
    {
        this.pac1.setLocation(l.getX(), l.getX());

    }
    public void setPackage2Location(Location l)
    {
        this.pac2.setLocation(l.getX(), l.getX());

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
        str="V=["+veh.getX()+"]["+veh.getY()+"]";
        str=str+"\nP=["+pac1.getX()+"]["+pac1.getY()+"] | "  ;
        str=str+"["+pac2.getX()+"]["+pac2.getY()+"]";
        str=str+"\nC=["+carry1+"]["+carry2+"]";
        str=str+"\n";
        return str;
    }
}
