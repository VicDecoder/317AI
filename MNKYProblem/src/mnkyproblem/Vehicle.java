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

public class Vehicle extends Location{
    private LinkedList<Package> thePackages;
    private float originX;
    private float originY;
    private float distanceTravelled;
    
     public Vehicle(float x, float y){
        thePackages=new LinkedList<>();
        originX=x;
        originY=y;
        setX(x);
        setY(y);
        distanceTravelled=0;
     }
     public void addPackage(Package p){
         thePackages.add(p);
     }
     public void removePackage(Package p){
         thePackages.remove(p);

     }
     public boolean atOrigin(){
         if(this.x==originX && this.y == originY){
             return true;
             
         }
     
         return false;
     }
     public void addtoDistance(Location l){
        
         float tmp=((l.getX()-x)*(l.getX()-x))+((l.getY()-y)*(l.getY()-y));
         
         tmp = (float)Math.sqrt(tmp);
         distanceTravelled=distanceTravelled+ tmp;
       
     }
     public float getTravelled(){
         return distanceTravelled;
     }
     

}



