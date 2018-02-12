/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
public State2 DFS(Problem2 prob, State2 init){
    Stack<State2> s = new Stack<>();
    s.add(init);
    while(!s.isEmpty()){
        State2 temp = s.pop();
        if(prob.isGoal2(temp)){
            System.out.println("The goal is\n" + temp);
            return temp;
        }

        else{
            prob.successor(temp);

            //LinkedList<State> next = prob.ge();
           // for(State i: next){
             //   s.add(i);

            LinkedList<State2> next = prob.getList2();
            for(State2 i: next){
                s.push(i);
            }

        }
    }

    return init;
}

public State3 search3(Problem2 prob,State3 init){
    Queue<State3> q=new LinkedList<>();
    q.add(init);
    
    while(!q.isEmpty()){
        
        State3 tmp=q.poll();
        if(prob.isGoal3(tmp)){
          System.out.println("The goal is\n"+tmp);
            return tmp;  
        }
        else{
            prob.successor(tmp);
            LinkedList<State3> next=prob.getList3();
            for(State3 i: next){
                q.add(i);
            }
        }
    }
    return init;    
} 
public State4 search4(Problem2 prob, State4 init){
      Queue<State4> q=new LinkedList<>();
    q.add(init);
    
    while(!q.isEmpty()){
        
        State4 tmp=q.poll();
        if(prob.isGoal4(tmp)){
          System.out.println("The goal is\n"+tmp);
            return tmp;  
        }
        else{
            prob.successor(tmp);
            LinkedList<State4> next=prob.getList4();
            //System.out.println("The lsit is "+next);
            for(State4 i: next){
                q.add(i);
            }
        }
    }
    return init; 
    
}

public State4 DFS4(Problem2 prob, State4 init){
      Stack<State4> q=new Stack<>();
    q.push(init);
    
    while(!q.isEmpty()){
        
        State4 tmp=q.pop();
        if(prob.isGoal4(tmp)){
          System.out.println("The goal is\n"+tmp);
            return tmp;  
        }
        else{
            prob.successor(tmp);
            LinkedList<State4> next=prob.getList4();
            for(State4 i: next){
                q.push(i);
            }
        }
    }
    return init; 
}
    
}




