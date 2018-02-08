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
public class State {

    Vehicle v;
    Package p;
    boolean carry;

    public State(Vehicle v, Package p, boolean input)
    {
        v.x = 0.0;
        v.y = 0.0;
        carry = input;
    }


    public Vehicle getVehicle()
    {
        return this.v;

    }

    public Package getPackage()
    {
        return this.p;
    }


    public boolean getCarry()
    {
        return this.carry;

    }


    public void setVehicle(float x)
    {
        this.v.x = x;

    }


    public void setPackage(float x)
    {
        this.p.x = x;

    }


    public void setCarry(boolean input)
    {
        this.carry = input;

    }
}
