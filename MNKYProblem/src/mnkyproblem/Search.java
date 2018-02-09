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
    LinkedList<State> next=prob.getList();
            for(State i: next){
                q.add(i);
            }
    while(!q.isEmpty()){
        State tmp=q.poll();
        if(prob.isGoal(tmp)){
          System.out.println("The goal is\n"+tmp);
            return tmp;  
        }
    }
    return init;    
}

    
}
