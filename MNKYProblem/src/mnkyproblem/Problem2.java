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
public class Problem2 {
    private State initState;
    private State goal;
    private LinkedList<State> stateList;
    
    public Problem2(State s,State goalState){
        initState=s;
        goal=goalState;
        stateList=new LinkedList<>();
    }
    public void successor(State s){
        if(s.getVehicle().atOrigin()&&!(s.getPackage().compare(goal.getPackage()))){
            State a=new State(s.getVehicle(),s.getPackage(),s.getCarry());
            a.setVehicleLocation(a.getPackage());
            a.setCarry(true);
            stateList.add(a);
        }
        if(s.getVehicle().compare(s.getPackage())&&s.carry==true){
            
        }
        
    }
    
}
