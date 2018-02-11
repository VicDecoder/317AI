/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class State3 {
    Vehicle veh;
    ArrayList<Package> packages;
    int count;
    ArrayList<Boolean> carry;

    public State3(Vehicle v,int c)
    {
        veh = v;
        count=c;
        packages=new ArrayList<Package>();
        carry=new ArrayList<Boolean>();
        
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
    public ArrayList<Package> getpackages(){
        return packages;
    }
    public ArrayList<Boolean> getcarrys(){
        return carry;
    }
    public void setAllCarry(ArrayList<Boolean> tmp){
        for(int i=0;i<tmp.size();i++){
            carry.set(i,tmp.get(i));
        }
    }
    public void setAllPackages(ArrayList<Package> tmp){
        for(int i=0;i<tmp.size();i++){
            packages.set(i,tmp.get(i));
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
