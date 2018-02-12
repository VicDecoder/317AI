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
public class Problem {
    private State initState;
    private State goalState;
    private LinkedList<State> stateList;
    public Problem(State s,State goal){
        initState=s;
        goalState=goal;
        stateList=new LinkedList<>();
    }
    public void successor(State s){
        
        if(s.getVehicle().atOrigin()&&!s.getPackage().compare(goalState.getPackage())){
            
            s.getVehicle().setX(s.getPackage().getX());
            s.setCarry(true);
            //System.out.println(s);
            stateList.add(s);
        }
        if(s.getVehicle().compare(s.getPackage())&&s.getCarry()==true){
            s.setVehicleLocation(goalState.getPackage());
            s.setCarry(false);
            s.setPackageLocation(goalState.getPackage());
            //System.out.println(s);
             stateList.add(s);
        }
        if(s.getPackage().compare(goalState.getPackage())&& s.getCarry()==false){
            s.setVehicleLocation(goalState.getVehicle());
            //System.out.println(s);
             stateList.add(s);
        }
        
    }
    public boolean isGoal(State tmp){
        if(tmp.getVehicle().getX()==goalState.getVehicle().getX()){
            if(tmp.getPackage().getX()==goalState.getPackage().getX()){
                if(tmp.getCarry()==goalState.getCarry()){
            return true;
                }
            }
        }
        return false;
    }
    public LinkedList<State> getList(){
        return stateList;
    }
    
}
