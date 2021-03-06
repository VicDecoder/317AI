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
             
            stateList.add(a);
        }
        if(s.getVehicle().compare(s.getPackage())&&s.carry==true){
           State a=new State(s.getVehicle(),s.getPackage(),s.getCarry());
           a.setVehicleLocation(goal.getPackage());
           a.setPackageLocation(goal.getPackage());
           a.setCarry(false);
           
           stateList.add(a);
        }
        if(s.getVehicle().compare(goal.getPackage())&&s.getCarry()==false){
             State a=new State(s.getVehicle(),s.getPackage(),s.getCarry());
             a.setVehicleLocation(goal.getVehicle());
         
             stateList.add(a);
        }
    }
      //This function is solves the M=1 N=2 k=1 y=2 problem.We kept it to understand the fucntion 
    public void successor(State2 s){
        if(s.getVehicle().atOrigin()&&!(s.getfirstPackage().compare(goal2.getfirstPackage()))&& !(s.getSecPackage().compare(goal2.getSecPackage()))){
           
           
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(a.getfirstPackage());
           a.setCarry1(true);
            
           
           State2 b=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           //Im trying to recreate the state creating two stattes where it either goes to the postion of the first package or the secong package
           
           b.setVehicleLocation(b.getSecPackage());
           b.setCarry2(true);
            
           state2List.add(b);
           state2List.add(a);
           
          
           
           
           
           
        }
         //Im trying to recreate the state creating two stattes where it either goes to the postion of the first package or the secong package
         if(s.getVehicle().compare(s.getfirstPackage())&&s.getCarry1()==true){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           
           
           a.setVehicleLocation(goal2.getfirstPackage());//
           a.setPackage1Location(goal2.getfirstPackage());
           
           a.setCarry1(false);
           
           state2List.add(a);
           
           
        }
         if(s.getVehicle().compare(s.getSecPackage())&&s.getCarry2()==true){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(goal2.getSecPackage());//
           a.setPackage2Location(goal2.getSecPackage());
            
           a.setCarry2(false);
            
           state2List.add(a);
           
        }//the next two if statments Switches to the next package after the previsous package has been delivered
        if(s.getVehicle().compare(goal2.getSecPackage())&&s.getCarry2()==false){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(s.getfirstPackage());//
           
           
           a.setCarry1(false);
            
           state2List.add(a);
           
        }
        if(s.getVehicle().compare(goal2.getfirstPackage())&&s.getCarry1()==false){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(s.getSecPackage());//
           
           
           a.setCarry2(true);
            
           state2List.add(a);
           
        }
        //the next two if statements deliveres the last package statement when the 
        //First
        if(s.getVehicle().compare(s.getfirstPackage())&&s.getCarry2()==false&& s.getCarry1()==true&&s.getSecPackage().compare(goal2.getSecPackage())){
            //s.getVehicle().compare(s.getfirstPackage())&&s.getCarry1()==true
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(goal2.getfirstPackage());//
           a.setPackage1Location(goal2.getfirstPackage());
          
           a.setCarry1(false);
           
           state2List.add(a);
           
        }
        if(s.getVehicle().compare(s.getSecPackage())&&s.getCarry2()==false&& s.getCarry2()==true&&s.getfirstPackage().compare(goal2.getfirstPackage())){
            //s.getVehicle().compare(s.getfirstPackage())&&s.getCarry1()==true
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.setVehicleLocation(goal2.getSecPackage());//
           a.setPackage2Location(goal2.getSecPackage());
            
           a.setCarry2(false);
           
           state2List.add(a);
           
        }
        if((s.getVehicle().compare(goal2.getSecPackage())||(s.getVehicle().compare(goal2.getfirstPackage())))&& s.getCarry1()==false && s.getCarry2()==false){
           State2 a=new State2(s.getVehicle(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
             
           //Im trying to recreate the state creating two stattes where it either goes to the postion of the first package or the secong package
           a.setVehicleLocation(goal2.getVehicle());//
           
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
            
          if(s.getVehicle().compare(s.getPackage(i)) && s.getCarry(i) == true){
               
              s.setVehicleLocation(goal3.getPackage(i));
              s.setPackageLocation(i, goal3.getPackage(i));
              s.setCarry(i, false);
              state3List.add(s);
               
          }
          if(s.getVehicle().compare(goal3.getPackage(i)) && s.getCarry(i)==false  )  {
               
              
              for(int j = i; j< s.count;j++){
                  if(!s.getPackage(j).compare(goal3.getPackage(j)) && s.getCarry(j) == false){
                        
                      s.setVehicleLocation(s.getPackage(j));
                     s.setCarry(j, true);
                     state3List.add(s);
                     
                     
                  }
                  
              }
          }
         compare=compare & s.getPackage(i).compare(goal3.getPackage(i));
     }
      
      if (compare==true){
           
          s.setVehicleLocation(goal3.getVehicle());
          state3List.add(s);
           
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
       //  "THe lsit in the successor"+state4List);
      if(s.getVehicle1().atOrigin()&&s.getVehicle2().atOrigin()&&!(s.getfirstPackage().compare(goal4.getfirstPackage()))&&!(s.getSecPackage().compare(goal4.getSecPackage())) && s.getCarry1() ==false && s.getCarry2() == false){
          //the first vehicle goes to first package
          State4 a=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.getVehicle1().addtoDistance(s.getfirstPackage());
          a.setVehicle1Location(s.getfirstPackage());
         
          a.setCarry1(true);
          state4List.add(a);
          
          
          //THe first goes to second package 
          State4 b=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
          b.getVehicle1().addtoDistance(s.getSecPackage());
          b.setVehicle1Location(s.getSecPackage());
          
         

          b.setCarry1(true);
          state4List.add(b);
           
          
          
          //The second vehicle goes to first package
          State4 c=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());

          c.setVehicle2Location(s.getfirstPackage());
          c.getVehicle2().addtoDistance(s.getfirstPackage());
          c.setVehicle1Location(goal4.getVehicle1());
          c.getVehicle1().addtoDistance(goal4.getVehicle1());
          c.setCarry1(true);
          state4List.add(c);
           
          
          //The second vehicle goes to second packaage
          State4 d=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
          d.getVehicle2().addtoDistance(s.getSecPackage());
          d.setVehicle2Location(s.getSecPackage());
         
          d.getVehicle1().addtoDistance(goal4.getVehicle1());
          d.setVehicle1Location(goal4.getVehicle1());
          
          d.setCarry2(true);
          state4List.add(d);
           
//          
          //The first goes to first an dsecond car goes to second
          State4 e=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
          e.getVehicle1().addtoDistance(s.getfirstPackage());
          e.setVehicle1Location(s.getfirstPackage());
          
          e.getVehicle2().addtoDistance(s.getSecPackage());
          e.setVehicle2Location(s.getSecPackage());
          

          e.setCarry1(true);
          e.setCarry2(true);
          state4List.add(e);
           
          
          //The first goes to second an dsecond car goes to first
          State4 f=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           f.getVehicle2().addtoDistance(s.getfirstPackage());
          f.setVehicle2Location(s.getfirstPackage());
         f.getVehicle1().addtoDistance(s.getSecPackage());
          f.setVehicle1Location(s.getSecPackage());
          


          f.setCarry1(true);
          f.setCarry2(true);
          state4List.add(f);
           
        }
       // ""+(s.getVehicle1().atOrigin())+(s.getVehicle2().atOrigin()));
      if((s.getVehicle1().atOrigin())&&!(s.getVehicle2().atOrigin())){
           
          if( !(s.getVehicle2().compare(s.getfirstPackage()))){
             
              State4 f=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
              State4 a=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());

             

              f.getVehicle2().addtoDistance(goal4.getSecPackage());
              f.setVehicle2Location(goal4.getSecPackage());
              
              f.setPackage2Location(goal4.getSecPackage());
              
              f.setCarry1(false);
              
              state4List.add(f);
              


               s.getVehicle2().addtoDistance(s.getfirstPackage());
              s.setVehicle2Location(s.getfirstPackage());
             
              s.setPackage2Location(s.getfirstPackage());
              s.setPackage1Location(s.getfirstPackage());
              s.setCarry1(true);
              s.setCarry2(true);
              
              state4List.add(s);
               
              
            }else{
              State4 f=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());

              f.getVehicle2().addtoDistance(goal4.getfirstPackage());
              f.setVehicle2Location(goal4.getfirstPackage());
              
              f.setPackage1Location(goal4.getfirstPackage());
              f.setCarry1(false);
              state4List.add(f);
             
              
              State4 a=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
              s.getVehicle2().addtoDistance(s.getSecPackage());
              s.setVehicle2Location(s.getSecPackage());
              
              s.setPackage2Location(s.getSecPackage());
              s.setPackage1Location(s.getSecPackage());
              s.setCarry1(true);
              s.setCarry2(true);
             
              state4List.add(s);
              
          }
              
          
      }

      if((s.getVehicle2().atOrigin())&&!(s.getVehicle1().atOrigin())){
                 
          if( !(s.getVehicle1().compare(s.getfirstPackage()))){
             
              State4 f=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
              State4 a=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());

             

               f.getVehicle1().addtoDistance(goal4.getSecPackage());
              f.setVehicle1Location(goal4.getSecPackage());
             
              f.setPackage2Location(goal4.getSecPackage());
              f.setCarry1(false);
              
              state4List.add(f);
             


               s.getVehicle1().addtoDistance(s.getfirstPackage());
              s.setVehicle1Location(s.getfirstPackage());
             
              s.setPackage2Location(s.getfirstPackage());
              s.setPackage1Location(s.getfirstPackage());
              s.setCarry1(true);
              s.setCarry2(true);
              
              state4List.add(s);
              
              
            }else{
              State4 f=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());

              f.getVehicle1().addtoDistance(goal4.getfirstPackage());
              f.setVehicle1Location(goal4.getfirstPackage());
              
              f.setPackage1Location(goal4.getfirstPackage());
              f.setCarry1(false);
              state4List.add(f);
              
              
              
              State4 a=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
              s.getVehicle1().addtoDistance(s.getSecPackage());
              s.setVehicle1Location(s.getSecPackage());
              
              s.setPackage2Location(s.getSecPackage());
              s.setPackage1Location(s.getSecPackage());
              s.setCarry1(true);
              s.setCarry2(true);
              
              state4List.add(s);
               
          }
              
          
      }
       if(s.getCarry1() == true && s.getCarry2() == true  && s.getVehicle1().compare(s.getfirstPackage()) && s.getVehicle2().atOrigin()){
           
          State4 a=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
          a.getVehicle1().addtoDistance(goal4.getfirstPackage());
          a.setVehicle1Location(goal4.getfirstPackage());
          
          a.setPackage1Location(goal4.getfirstPackage());
          a.setCarry1(false);
          state4List.add(a);
           
          
          s.getVehicle1().addtoDistance(goal4.getSecPackage());
          s.setVehicle1Location(goal4.getSecPackage());
          
          s.setCarry2(false);
          s.setPackage2Location(goal4.getSecPackage());
          state4List.add(s);
          
      }
       if(s.getCarry1() == true && s.getCarry2() == true  && s.getVehicle2().compare(s.getfirstPackage()) && s.getVehicle1().atOrigin()){
         
          State4 a=new State4(s.getVehicle1(),s.getVehicle2(),s.getfirstPackage(),s.getSecPackage(),s.getCarry1(),s.getCarry2());
           a.getVehicle2().addtoDistance(goal4.getfirstPackage());
          a.setVehicle2Location(goal4.getfirstPackage());
         
          a.setPackage1Location(goal4.getfirstPackage());
          a.setCarry1(false);
          state4List.add(a);
          
          
           s.getVehicle2().addtoDistance(goal4.getSecPackage());
          s.setVehicle2Location(goal4.getSecPackage());
         
          s.setCarry2(false);
          s.setPackage2Location(goal4.getSecPackage());
          state4List.add(s);
           
      }
       if(s.getCarry1() == false && s.getCarry2() == true  && s.getVehicle1().compare(goal4.getfirstPackage()) && s.getVehicle2().atOrigin()){
          s.getVehicle1().addtoDistance(goal4.getSecPackage()); 
          s.setVehicle1Location(goal4.getSecPackage());
          
          s.setCarry2(false);
          state4List.add(s);
           
      }
       if(s.getCarry1() == true && s.getCarry2() == false  && s.getVehicle1().compare(goal4.getSecPackage()) && s.getVehicle2().atOrigin()){
          s.getVehicle1().addtoDistance(goal4.getfirstPackage());
          s.setVehicle1Location(goal4.getfirstPackage());
          
          s.setCarry1(false);
          state4List.add(s);
          
      }
       
       
       
       if(s.getCarry1() == false && s.getCarry2() == true  && s.getVehicle2().compare(goal4.getfirstPackage()) && s.getVehicle1().atOrigin()){
           s.getVehicle2().addtoDistance(s.getSecPackage());
          s.setVehicle2Location(goal4.getSecPackage());
          
          s.setCarry2(false);
          state4List.add(s);
         
      }
       if(s.getCarry1() == true && s.getCarry2() == false  && s.getVehicle2().compare(goal4.getSecPackage()) && s.getVehicle1().atOrigin()){
           s.getVehicle2().addtoDistance(goal4.getfirstPackage());
          s.setVehicle2Location(goal4.getfirstPackage());
         
          s.setCarry1(false);
          state4List.add(s);
           
      }
       
       
       
       
       
      if(s.getCarry1() == true && s.getCarry2() == true  && s.getVehicle1().compare(s.getfirstPackage()) && s.getVehicle2().compare(s.getSecPackage())){
          s.getVehicle1().addtoDistance(goal4.getfirstPackage());
          s.setVehicle1Location(goal4.getfirstPackage());
          
          s.setCarry1(false);
          s.getVehicle2().addtoDistance(goal4.getSecPackage());
          s.setVehicle2Location(goal4.getSecPackage());
          
          
          s.setCarry2(false);
          s.setPackage2Location(goal4.getSecPackage());
          s.setPackage1Location(goal4.getfirstPackage());
          state4List.add(s);
           
      }
        if(s.getCarry1() == true && s.getCarry2() == true  && s.getVehicle1().compare(s.getSecPackage()) && s.getVehicle2().compare(s.getfirstPackage())){
           s.getVehicle1().addtoDistance(goal4.getfirstPackage());
            s.setVehicle1Location(goal4.getfirstPackage());
            
            s.setCarry1(false);
            s.getVehicle2().addtoDistance(goal4.getSecPackage());
            s.setVehicle2Location(goal4.getSecPackage());
            
            
            s.setCarry2(false);
            s.setPackage1Location(goal4.getfirstPackage());
            s.setPackage2Location(goal4.getSecPackage());
            state4List.add(s);
             
        }
        if(s.getCarry1() == false && s.getCarry2() == false && s.getfirstPackage().compare(goal4.getfirstPackage()) && s.getSecPackage().compare(goal4.getSecPackage())){
            s.getVehicle1().addtoDistance(goal4.getVehicle1());
            s.setVehicle1Location(goal4.getVehicle1());
            s.getVehicle2().addtoDistance(goal4.getVehicle2());
            s.setVehicle2Location(goal4.getVehicle2());
            
            state4List.add(s);
             
        }



    }
     public LinkedList<State4> getList4(){
         return state4List;
     }

     public boolean isGoal4(State4 tmp){
        if(tmp.getVehicle1().compare(goal4.getVehicle1())){
            if(tmp.getVehicle2().compare(goal4.getVehicle2())){
            if(tmp.getfirstPackage().compare(goal4.getfirstPackage())){
                if(tmp.getSecPackage().compare(goal4.getSecPackage())){
                if(tmp.getCarry1()==goal4.getCarry1()){
                  if(tmp.getCarry2()==goal4.getCarry2()){  
                
                    return true;
                  }
                }
                }
                }
            }
        }
        return false;
    }
}

   

    

