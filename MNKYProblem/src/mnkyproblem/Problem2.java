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
    private State goalState;
    private LinkedList<State> stateList;
    
    public Problem2(State s,State goal){
        initState=s;
        goalState=goal;
        stateList=new LinkedList<>();
    }
    public void successor(State s){
        if(s.getVehicle().atOrigin()&&(s.getPackage().getLocation()==s.getPackage().getPost())){
            
        }
        
    }
    public float cost(State state1, State state2){

        float cos = 0;

        float dis1 = (state1.getVehicle().getX() - state1.getVehicle().getY()) * (state1.getVehicle().getX() - state1.getVehicle().getY());
       float dis2 = (state2.getVehicle().getX() - state2.getVehicle().getY()) * (state2.getVehicle().getX() - state2.getVehicle().getY());
        float distance = dis1 + dis2;

        return distance;
    }
    
}
