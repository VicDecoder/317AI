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
    /*
    System.out.println( "The initial state is: ");
    System.out.print(init_state);
    System.out.print("\n\n");
    Problem prob = new Problem2(init_state,goal);
    prob.successor(init_state);
    */
    Search test = new Search();
  
    iPack = new Package(1,1);
    Package iPack2=new Package(2,2);
    Package gPack1=new Package(3,3);
    Package gPack2=new Package(4,4);
    
    Package iP1=new Package(6,6);
    Package iP2=new Package(8,8);
    Package iP3=new Package(10,10);
    iVeh = new Vehicle(0,0);
    gVeh=new Vehicle(0,0);
    State2 init = new State2(iVeh,iPack,iPack2,carry,carry);
    State2 g=new State2(gVeh,gPack1,gPack2,false,false);
    State3 i1 = new State3(iVeh,3);
    i1.addPackage(iPack);
    i1.addPackage(iPack2);
    i1.addPackage(gPack1);
    i1.addCarry(false);
    i1.addCarry(false);
    i1.addCarry(false);
    
    State3 g1 = new State3(iVeh,3);
    g1.addPackage(iP1);
    g1.addPackage(iP2);
    g1.addPackage(iP3);
    g1.addCarry(false);
    g1.addCarry(false);
    g1.addCarry(false);
    

    System.out.println( "The initial state is: ");
    System.out.print(i1);
    System.out.print("\n\n");
    Problem2 pro = new Problem2(g1);
    pro.successor(i1);
    

    //test.search2(pro, init);

    //test.search2(prob, init_state);
   // test.DFS(prob,init_state);

    //test.search2(pro, init);
    //test.search2(prob, init_state);
    //test.DFS(pro,init);
    test.search3(pro, i1);


    }
    
}
