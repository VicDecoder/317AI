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
    Package iPack = new Package(1,1);
    Package gPack=new Package(5,5);
    Vehicle iVeh = new Vehicle(0,0);
    Vehicle gVeh=new Vehicle(0,0);
    State init_state = new State(iVeh,iPack,carry);
    State goal=new State(gVeh,gPack,false);

    System.out.println( "The initial state is: ");
    System.out.print(init_state);
     System.out.print("\n\n");
    Problem2 prob = new Problem2(init_state,goal);
    prob.successor(init_state);

    Search test = new Search();
    test.search2(prob, init_state);
    }
    
}
