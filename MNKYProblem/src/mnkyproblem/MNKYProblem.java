/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

/**
 *
 * @author victor
 */
public class MNKYProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    boolean carry = false;
    Package p = new Package(1);
    Package pack=new Package(2);
    Vehicle v = new Vehicle();
    Vehicle f=new Vehicle();
    State init_state = new State(v,p,carry);
    v.setX(0);
    f.setX(0);
    pack.setX(2);
    
    State goal=new State(f,pack,false);

    System.out.println( "The initial state is: ");
    System.out.print(init_state);
    Problem prob = new Problem(init_state,goal);
    prob.successor(init_state);

    Search test = new Search();
    test.search(prob, init_state);
    }
    
}
