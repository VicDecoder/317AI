/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author victor
 */
public class State3 {
    Vehicle veh;
    LinkedList<Package> packages;
    int count;
    LinkedList<Boolean> carry;
    

    
    

    public State3(Vehicle v,int c)
    {
        veh = v;
        count=c;
        packages=new LinkedList<Package>();
        carry=new LinkedList<Boolean>();
       
        
    }


    public Vehicle getVehicle()
    {
        return this.veh;

    }
   
    public Package getPackage(int value)
    {
        return this.packages.get(value);
    }
    
    public boolean getCarry(int value)
    {
        return this.carry.get(value);

    }
    
    public void setVehicleLocation(Location l)
    {
        
        this.veh.setLocation(l.getX(), l.getX());

    }


    public void setPackageLocation(int value,Location l)
    {
        this.packages.get(value).setLocation(l.getX(), l.getX());

    }
    
    public void setCarry(int value,boolean bool)
    {   if(bool){
        this.carry.set(value,Boolean.TRUE);
    }else{
        this.carry.set(value,Boolean.TRUE);
    }
    

    }
    public void addPackage(Package p){
        packages.add(p);
        
        
       
    }
    public void addCarry(boolean value){
        carry.add(value);
    
    }
    public LinkedList<Package> getpackages(){
        return packages;
    }
    public LinkedList<Boolean> getcarrys(){
        return carry;
    }
    public void setAllCarry(LinkedList<Boolean> tmp){
       for(Boolean b: tmp){
           carry.add(b);
       }
    }
    public void setAllPackages(LinkedList<Package> tmp){
        for(Package p:tmp){
            packages.add(p);
        }
        
    }
    
    public String toString(){
        String str;
        str="V=["+veh.getX()+"]["+veh.getY()+"]";
        str=str+"\n";
        for(int i=0; i <count;i++){
        str=str+"P=["+packages.get(i).getX()+"]["+packages.get(i).getY()+"] | "  ;
        }
        str=str+"\n";
        for(int i=0; i <count;i++){
        str=str+"C=["+carry.get(i)+"]"; ;
        }
        
        str=str+"\n";
        return str;
    }
    
}
