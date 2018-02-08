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
public class Package extends Location{
    float post = 0;
    float dest = 0;

    public Package(float p, float d){
        post = p;
        setX(post);
        dest = d;
    }
    public float getPost(){
        return post;
    }
    public float getDest(){
        return dest;
    }
}
