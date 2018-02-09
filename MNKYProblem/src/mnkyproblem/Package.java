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
    float post = 0;
    
    public Package(float p){
        post = p;
        setX(post);
       
    }
    public float getPost(){
        return post;
    }
    


}
