/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author victor
 */
public class Search {
public State search(Problem prob,State init){
    Queue<State> q=new LinkedList<>();
    q.add(init);
    
    while(!q.isEmpty()){
        
        State tmp=q.poll();
        if(prob.isGoal(tmp)){
          System.out.println("The goal is\n"+tmp);
            return tmp;  
        }
        else{
            prob.successor(tmp);
            LinkedList<State> next=prob.getList();
            for(State i: next){
                q.add(i);
            }
        }
    }
    return init;    
}
public State2 search2(Problem2 prob,State2 init){
    Queue<State2> q=new LinkedList<>();
    q.add(init);
    
    while(!q.isEmpty()){
        
        State2 tmp=q.poll();
        if(prob.isGoal2(tmp)){
          System.out.println("The goal is\n"+tmp);
            return tmp;  
        }
        else{
            prob.successor(tmp);
            LinkedList<State2> next=prob.getList2();
            for(State2 i: next){
                q.add(i);
            }
        }
    }
    return init;    
}

    
}
