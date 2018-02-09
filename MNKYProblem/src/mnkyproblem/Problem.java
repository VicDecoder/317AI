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
    public void successor(State state){
        if((state.veh.getX()==0)&&(state.getCarry()==false)&&(state.getPackage().getX()==state.getPackage().getPost())){
            State victor=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            victor.setCarry(true);
            victor.getVehicle().setX(state.getPackage().getPost());
            System.out.println(victor);
            this.stateList.add(victor);
            //this.successor(victor);
           
        }
        if((state.getVehicle().getX() == state.getPackage().getPost()) &&( state.getCarry() == true)){
            State surj=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            surj.setCarry(false);
            surj.getVehicle().setX(goalState.getPackage().getX());
            surj.getPackage().setX(goalState.getPackage().getX());
            System.out.println(surj);
            this.stateList.add(surj);
            //this.successor(surj);
            
        }
        if(state.getVehicle().getX() == goalState.getPackage().getX() &&(state.getCarry() == false)){
            State lar=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            
            lar.getVehicle().setX(0);
            lar.getVehicle().setX(state.getPackage().getPost());
            this.stateList.add(lar);
            System.out.println(lar);
            //this.successor(lar);
            
        }
        
    }
    public boolean isGoal(State tmp){
        if(tmp.getVehicle().getX()==goalState.getVehicle().getX()){
            if(tmp.getPackage().getX()==goalState.getPackage().getX()){
                if(tmp.getCarry()==tmp.getCarry()){
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
