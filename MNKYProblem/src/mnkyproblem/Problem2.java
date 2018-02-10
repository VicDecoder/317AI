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
    
    private State2 init2;
    private State2 goal2;
    
    private LinkedList<State> stateList;
    private LinkedList<State2> state2List;
    
    public Problem2(State s,State goalState){
        initState=s;
        goal=goalState;
        stateList=new LinkedList<>();
    }
    public Problem2(State2 goalState){

       goal2=goalState;
       state2List=new LinkedList();
    }
    
    //This function is solves the M=1 N=1 k=1 y=2 problem.We kept it to understand the fucntion
    public void successor(State s){
        if(s.getVehicle().atOrigin()&&!(s.getPackage().compare(goal.getPackage()))){
            State a=new State(s.getVehicle(),s.getPackage(),s.getCarry());
            a.setVehicleLocation(a.getPackage());
            a.setCarry(true);
            System.out.println(a);
            stateList.add(a);
        }
        if(s.getVehicle().compare(s.getPackage())&&s.carry==true){
           State a=new State(s.getVehicle(),s.getPackage(),s.getCarry());
           a.setVehicleLocation(goal.getPackage());
           a.setPackageLocation(goal.getPackage());
           a.setCarry(false);
           System.out.println(a);
           stateList.add(a);
        }
        if(s.getVehicle().compare(goal.getPackage())&&s.getCarry()==false){
             State a=new State(s.getVehicle(),s.getPackage(),s.getCarry());
             a.setVehicleLocation(goal.getVehicle());
             System.out.println(a);
             stateList.add(a);
        }
    }
      //This function is solves the M=1 N=2 k=1 y=2 problem.We kept it to understand the fucntion 
    public void successor(State2 s){
        if(s.getVehicle().atOrigin()&&!(s.getfirstPackage().compare(goal2.getfirstPackage()))&& !(s.getSecPackage().compare(goal2.getSecPackage()))){
           System.out.println("1");
           
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(a.getfirstPackage());
           a.setCarry1(true);
           System.out.println(a);
           
           State2 b=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           //Im trying to recreate the state creating two stattes where it either goes to the postion of the first package or the secong package
           
           b.setVehicleLocation(b.getSecPackage());
           b.setCarry2(true);
           System.out.println(b);
           state2List.add(b);
           state2List.add(a);
           
          
           
           
           
           
        }
         //Im trying to recreate the state creating two stattes where it either goes to the postion of the first package or the secong package
         if(s.getVehicle().compare(s.getfirstPackage())&&s.getCarry1()==true){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           
            System.out.println("2");
           a.setVehicleLocation(goal2.getfirstPackage());//
           a.setPackage1Location(goal2.getfirstPackage());
           
           a.setCarry1(false);
           System.out.println(a);
           state2List.add(a);
           
           
        }
         if(s.getVehicle().compare(s.getSecPackage())&&s.getCarry2()==true){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(goal2.getSecPackage());//
           a.setPackage2Location(goal2.getSecPackage());
            System.out.println("3");
           a.setCarry2(false);
           System.out.println(a);
           state2List.add(a);
           
        }//the next two if statments Switches to the next package after the previsous package has been delivered
        if(s.getVehicle().compare(goal2.getSecPackage())&&s.getCarry2()==false){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(s.getfirstPackage());//
           
            System.out.println("4");
           a.setCarry1(false);
           System.out.println(a);
           state2List.add(a);
           
        }
        if(s.getVehicle().compare(goal2.getfirstPackage())&&s.getCarry1()==false){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(s.getSecPackage());//
           
            System.out.println("5");
           a.setCarry2(true);
           System.out.println(a);
           state2List.add(a);
           
        }
        //the next two if statements deliveres the last package statement when the 
        //First
        if(s.getVehicle().compare(s.getfirstPackage())&&s.getCarry2()==false&& s.getCarry1()==true&&s.getSecPackage().compare(goal2.getSecPackage())){
            //s.getVehicle().compare(s.getfirstPackage())&&s.getCarry1()==true
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(goal2.getfirstPackage());//
           a.setPackage1Location(goal2.getfirstPackage());
            System.out.println("6");
           a.setCarry1(false);
           System.out.println(a);
           state2List.add(a);
           
        }
        if(s.getVehicle().compare(s.getSecPackage())&&s.getCarry2()==false&& s.getCarry2()==true&&s.getfirstPackage().compare(goal2.getfirstPackage())){
            //s.getVehicle().compare(s.getfirstPackage())&&s.getCarry1()==true
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(goal2.getSecPackage());//
           a.setPackage2Location(goal2.getSecPackage());
            System.out.println("7");
           a.setCarry2(false);
           System.out.println(a);
           state2List.add(a);
           
        }
        if((s.getVehicle().compare(goal2.getSecPackage())||(s.getVehicle().compare(goal2.getfirstPackage())))&& s.getCarry1()==false && s.getCarry2()==false){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
            System.out.println("8");
           //Im trying to recreate the state creating two stattes where it either goes to the postion of the first package or the secong package
           a.setVehicleLocation(goal2.getVehicle());//
           System.out.println(a);
           state2List.add(a);
         }
        
        
        
        
    }
    
    public float distance(State state1, State state2){

        float cos = 0;

        float dis1 = (state1.getVehicle().getX() - state1.getVehicle().getY()) * (state1.getVehicle().getX() - state1.getVehicle().getY());
       float dis2 = (state2.getVehicle().getX() - state2.getVehicle().getY()) * (state2.getVehicle().getX() - state2.getVehicle().getY());
        float distance = dis1 + dis2;

        return distance;
    }
    
     public boolean isGoal(State tmp){
        if(tmp.getVehicle().compare(goal.getVehicle())){
            if(tmp.getPackage().compare(goal.getPackage())){
                if(tmp.getCarry()==goal.getCarry()){
                return true;
                }
            }
        }
        return false;
    }
     public boolean isGoal2(State2 tmp){
        if(tmp.getVehicle().compare(goal2.getVehicle())){
            if(tmp.getfirstPackage().compare(goal2.getfirstPackage())){
                if(tmp.getSecPackage().compare(goal2.getSecPackage())){
                if(tmp.getCarry1()==goal2.getCarry1()){
                  if(tmp.getCarry2()==goal2.getCarry2()){  
                
                    return true;
                  }
                }
                }
            }
        }
        return false;
    }
    public LinkedList<State2> getList2(){
        return state2List;
    }
}
    

