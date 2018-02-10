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
public class Package extends Location{
    float postX ;
    float postY;
    
    public Package(float a, float b){
        postX = a;
        postY=b;
        setX(a);
        setY(b);
       
    }
    public float getPost(){
        return postX;
    }
    


}
