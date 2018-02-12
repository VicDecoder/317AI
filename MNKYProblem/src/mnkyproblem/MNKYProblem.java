/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mnkyproblem;

import java.util.ArrayList;

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
    Search test = new Search();   
    boolean carry = false;
    Package iPack = new Package(1,0);
    Package gPack=new Package(5,0);
    Vehicle iVeh = new Vehicle(0,0);
    Vehicle gVeh=new Vehicle(0,0);
    State init_state = new State(iVeh,iPack,carry);
    State goal=new State(gVeh,gPack,false);
    System.out.println( "\n\nTetsing the basic case\n\n");
    System.out.println( "The initial state is: ");
    System.out.print(init_state);
    Problem prob = new Problem(init_state,goal);
   // prob.successor(init_state);
    test.search(prob, init_state);
    System.out.print("\n\n");
    
    
    
  
    iPack = new Package(1,1);
    Package iPack2=new Package(2,2);
    Package iP1=new Package(6,6);
    Package iP2=new Package(8,8);
    Package gPack1=new Package(3,3);
    Package gPack2=new Package(4,4);
    
    
    Package iP3=new Package(10,10);
    iVeh = new Vehicle(0,0);
    Vehicle iVeh2 = new Vehicle(0,0);
    gVeh=new Vehicle(0,0);
    
    
    System.out.println("\n\nTesting the M=1 N=2 K=1 Y=1\n\n");
    State2 init = new State2(iVeh,iPack,iPack2,false,carry);
    State2 g=new State2(gVeh,gPack1,gPack2,false,false);
    
    Problem2 p=new Problem2(g);
    p.successor(init);
    test.search2(p, init);
    
     System.out.println("\n\nTesting the M=1 N>2 K=1 Y=1\n\n");
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
    //prob.successor(i1,g1);
    
    Vehicle vech2 = new Vehicle(0,0);
    vech2.setX(0);
    vech2.setY(0);
    Vehicle veh3 = new Vehicle(0,0);
    veh3.setX(0);
    veh3.setY(0);
    
    iP1=new Package(6,6);
    iP2=new Package(8,8);
    iVeh=new Vehicle(0,0);
    iVeh2=new Vehicle(0,0);

    State4 i4 = new State4(vech2,veh3,iPack,iPack2,false,false);
    System.out.println(i4);
    State4 g4 = new State4(iVeh,iVeh2,iP1,iP2,false,false);
    Problem2 problem2 = new Problem2(g4);
    
//    problem2.successor(i4);
    System.out.println("\n\nTesting the M=2 N=2 K=2 Y=2\n");
    System.out.println(i4);
    System.out.println("\n\nTesting the BFS\n\n");
    test.search4(problem2,i4);
    System.out.println( "Testing the DFS\n\n");
    test.DFS4(problem2,i4);

//
//    System.out.println( "The initial state is: ");
//    System.out.print(i1);
//    System.out.print("\n\n");
//    Problem2 pro = new Problem2(g1);
//   pro.successor(i1);
////

    //test.search2(pro, init);

    //test.search2(prob, init_state);
   // test.DFS(prob,init_state);

    //test.search2(pro, init);
    //test.search2(prob, init_state);
    //test.DFS(pro,init);
//    test.search3(pro, i1);

 


    }
    
}
