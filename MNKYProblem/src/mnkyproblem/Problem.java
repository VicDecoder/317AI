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
           System.out.println("1");
            State victor=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            victor.getVehicle().setX(state.getPackage().getPost());
            System.out.println(victor);
            this.stateList.add(victor);
            //this.successor(victor);
           
        }
        if((state.getVehicle().getX() == state.getPackage().getPost()) &&( state.getCarry() == false)&&state.getVehicle().getX()!=goalState.getVehicle().getX()){
            System.out.println("2");
            State surj=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            surj.setCarry(true);
            
            System.out.println(surj);
            this.stateList.add(surj);
            //this.successor(surj);
            
        }
        if(state.getVehicle().getX() == state.getPackage().getX() &&(state.getCarry() == true)&& state.getVehicle().getX()!=goalState.getVehicle().getX()){
            System.out.println("3");
            State lar=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            lar.getVehicle().setX(goalState.getPackage().getX());
            lar.getPackage().setX(goalState.getPackage().getX());
            this.stateList.add(lar);
            System.out.println(lar);
            //this.successor(lar);
            
        }
        if(state.getVehicle().getX() ==2 &&(state.getCarry() == true)&& state.getVehicle().getX()!=goalState.getVehicle().getX()){
            System.out.println("3");
            State lar=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            lar.getVehicle().setX(goalState.getVehicle().getX());
            lar.getPackage().setX(goalState.getPackage().getX());
            this.stateList.add(lar);
            System.out.println(lar);
            //this.successor(lar);
        }
        if(state.getVehicle().getX()==goalState.getVehicle().getX()&&state.getCarry()==true){
            System.out.println("4");
            State umar=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            umar.setCarry(false);
            this.stateList.add(umar);
            
        }
        if(state.getVehicle().getX()==goalState.getVehicle().getX() && state.getCarry()==false){
            System.out.println("5");
            state.getVehicle().setX(0);
            State random=new State(state.getVehicle(),state.getPackage(),state.getCarry());
            random.setCarry(false);
            this.stateList.add(random);
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
