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
    private State3 goal3;
    private State4 goal4;
    
    private LinkedList<State> stateList;
    private LinkedList<State2> state2List;
    private LinkedList<State3> state3List;
    private LinkedList<State4> state4List;
  
    
    public Problem2(State s,State goalState){
        initState=s;
        goal=goalState;
        stateList=new LinkedList<>();
    }
    public Problem2(State2 goalState){

       goal2=goalState;
       state2List=new LinkedList();
    }
    public Problem2(State3 g){
        goal3=g;
        state3List=new LinkedList<>();
    }
    
    public Problem2(State4 g){
        goal4=g;
        state4List=new LinkedList<>();
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
    
    
    
    public void successor(State3 s){
        boolean compare=true;
        if(s.getVehicle().atOrigin()){
                boolean tmp=false;
                for(int i=0; i<s.count;i++){
                    if(s.getPackage(i).compare(goal3.getPackage(i))){

                       tmp=true; 
                    }
                }
                if (tmp){
                    for(int i=0; i<s.count;i++){
                    System.out.println("1");
                    State3 a=new State3(s.getVehicle(),s.count);
                     a.setVehicleLocation(s.getPackage(i));
                     a.setAllPackages(s.getpackages());
                     a.setAllCarry(s.getcarrys());
                     a.setCarry(i, true);
                     state3List.add(a);
                     System.out.print(a);
                    
                }
             
            }
            
                
        }
        
      for(int i = 0; i<s.count; i++){ 
           System.out.println("1b");
          if(s.getVehicle().compare(s.getPackage(i)) && s.getCarry(i) == true){
              System.out.println("2");
              s.setVehicleLocation(goal3.getPackage(i));
              s.setPackageLocation(i, goal3.getPackage(i));
              s.setCarry(i, false);
              state3List.add(s);
              System.out.println(s);
          }
          if(s.getVehicle().compare(goal3.getPackage(i)) && s.getCarry(i)==false  )  {
               System.out.println("3");
              
              for(int j = i; j< s.count;j++){
                  if(!s.getPackage(j).compare(goal3.getPackage(j)) && s.getCarry(j) == false){
                       System.out.println("4");
                      s.setVehicleLocation(s.getPackage(j));
                     s.setCarry(j, true);
                     state3List.add(s);
                     System.out.println(s);
                     
                  }
                  
              }
          }
         compare=compare & s.getPackage(i).compare(goal3.getPackage(i));
     }
      
      if (compare==true){
          System.out.println("5");
          s.setVehicleLocation(goal3.getVehicle());
          state3List.add(s);
          System.out.println(s);
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
        return state2List;}
    public boolean isGoal3(State3 tmp){
        if(tmp.getVehicle().compare(goal3.getVehicle())){

           boolean compare=true;
         
           boolean cCarry=true;


          for(int i =0; i<tmp.count;i++){
              
                compare = compare & tmp.getPackage(i).compare(goal3.getPackage(i));
                
                cCarry=cCarry & (tmp.getCarry(i)==goal3.getCarry(i));
                
            }
          if(compare&cCarry){return true;}
         }
        return false;
    }
    public LinkedList<State3> getList3(){
        return state3List;}
    
    public void successor(State4 s){
      if(s.getVehicle1().atOrigin()&&s.getVehicle2().atOrigin()&&!(s.getfirstPackage().compare(goal4.getfirstPackage()))&&!(s.getSecPackage().compare(goal4.getSecPackage()))){
          //the first vehicle goes to first package
          State4 a=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
          a.setVehicle1Location(s.pac1);
          a.setCarry1(true);
          state4List.add(a);
          System.out.println(a);
          
          //THe first goes to second package 
          State4 b=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
          b.setVehicle1Location(s.pac2);
          b.setCarry1(true);
          state4List.add(b);
          System.out.println(b);
          
          
          //The second vehicle goes to first package
          State4 c=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
          c.setVehicle2Location(s.pac1);
          c.setVehicle1Location(goal4.getVehicle1());
          c.setCarry1(true);
          state4List.add(c);
          System.out.println(c);
          
          //The second vehicle goes to second packaage
          State4 d=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
          d.setVehicle2Location(s.pac2);
          d.setVehicle1Location(goal4.getVehicle1());
          d.setCarry2(true);
          state4List.add(d);
          System.out.println(d);
          
          //The first goes to first an dsecond car goes to second
          State4 e=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
          e.setVehicle1Location(s.pac1);
          e.setVehicle2Location(s.pac2);
          e.setCarry1(true);
          e.setCarry2(true);
          state4List.add(e);
          System.out.println(e);
          
          //The first goes to second an dsecond car goes to first
          State4 f=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
          f.setVehicle1Location(s.pac2);
          f.setVehicle2Location(s.pac1);
          f.setCarry1(true);
          f.setCarry2(true);
          state4List.add(f);
          System.out.println(f);
        }
      if((s.getVehicle1().atOrigin())&&!(s.getVehicle2().atOrigin())){
          if( !(s.getVehicle2().compare(s.getfirstPackage()))){
              State4 f=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
              State4 a=new State4(s.v1,s.v2,s.pac1,s.pac2,s.carry1,s.carry2);
              f.setVehicle2Location(goal4.getSecPackage());
              f.setPackage2Location(goal4.getSecPackage());
              f.setCarry1(false);
              state4List.add(f);
              System.out.println(f);
              s.setVehicle2Location(s.getfirstPackage());
             // s.setPackage2Location(s.getfirstPackage());
              s.setCarry1(true);
              state4List.add(s);
              System.out.println(s);
              
            }else{
              if(s.getCarry2()==false){
                s.setVehicle1Location(goal4.getSecPackage());
                s.setPackage1Location(goal4.getSecPackage());
                s.setCarry1(false);
                state4List.add(s);
                System.out.println(s);
              }
              s.setVehicle2Location(s.getSecPackage());
              s.setPackage1Location(s.getSecPackage());
              s.setCarry2(true);
              state4List.add(s);
              System.out.println(s);
          }
              
          
      }

      if((s.getVehicle2().atOrigin())&&!(s.getVehicle1().atOrigin())){
          
      }
      if(s.carry1 == true && s.carry2 == true  && s.getVehicle1().compare(s.getfirstPackage()) && s.getVehicle2().compare(s.getSecPackage())){
          System.out.println("1!!");
          s.setVehicle1Location(goal4.getfirstPackage());
          s.setCarry1(false);
          s.setVehicle2Location(goal4.getSecPackage());
          s.setCarry2(false);
          s.setPackage2Location(goal4.getSecPackage());
          s.setPackage1Location(goal4.getfirstPackage());
          state4List.add(s);
          System.out.println(s);
      }
        if(s.carry1 == true && s.carry2 == true  && s.getVehicle1().compare(s.getSecPackage()) && s.getVehicle2().compare(s.getfirstPackage())){
          System.out.println("2!!");
            s.setVehicle2Location(goal4.getfirstPackage());
            s.setCarry1(false);
            s.setVehicle1Location(goal4.getSecPackage());
            s.setCarry2(false);
            s.setPackage2Location(goal4.getfirstPackage());
            s.setPackage1Location(goal4.getSecPackage());
            state4List.add(s);
            System.out.println(s);
        }
        if(s.carry1 == false && s.carry2 == false && s.getfirstPackage().compare(goal4.getfirstPackage()) && s.getSecPackage().compare(goal4.getSecPackage())){
            System.out.println("Here");
            s.setVehicle1Location(goal4.getVehicle1());
            s.setVehicle2Location(goal4.getVehicle1());
            state4List.add(s);
            System.out.println(s);
        }



    }

}

   

    

