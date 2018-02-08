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
     public Vehicle(){
        thePackages=new LinkedList<>();
     }
     public void addPackage(Package p){
         thePackages.add(p);
     }
     public void removePackage(Package p){
         thePackages.remove(p);

     }

}
