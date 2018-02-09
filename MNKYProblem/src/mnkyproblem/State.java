/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

/**
 *
 * @author victor
 */
public class State{

    Vehicle veh;
    Package pac;
    boolean carry;

    public State(Vehicle v, Package p, boolean input)
    {
        veh = v;
        pac = p;
        carry = input;
    }


    public Vehicle getVehicle()
    {
        return this.veh;

    }

    public Package getPackage()
    {
        return this.pac;
    }


    public boolean getCarry()
    {
        return this.carry;

    }


    public void setVehicleLocation(float x)
    {
        this.veh.setX(x);

    }


    public void setPackageLocation(float x)
    {
        this.pac.setX(x);

    }


    public void setCarry(boolean input)
    {
        this.carry = input;

    }
    public String toString(){
        String str;
        str="V="+veh.getX();
        str=str+"\nP="+pac.getX();
        str=str+"\nC="+carry;
        str=str+"\n";
        return str;
    }
}
