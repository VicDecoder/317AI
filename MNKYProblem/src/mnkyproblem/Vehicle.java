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
public class Vehicle extends Location{
    private Package thePackage;
     public Vehicle(){
        thePackage=null;
     }
     public void addPackage(Packager p){
         thePackage=p;
     }
     public void removePackage(){
         thePackage=null;
     }

}
