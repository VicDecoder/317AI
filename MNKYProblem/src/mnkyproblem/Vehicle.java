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
    
     public Vehicle(float x, float y){
        thePackages=new LinkedList<>();
        originX=x;
        originY=y;
     }
     public void addPackage(Package p){
         thePackages.add(p);
     }
     public void removePackage(Package p){
         thePackages.remove(p);

     }
     public boolean atOrigin(){
         if(this.x==originX){
             if(this.y==originY){
                 return true;
             }
             
         }
     
         return false;
     }

}



