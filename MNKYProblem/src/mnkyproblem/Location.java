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
public class Location {

    float x;
    float y;
    float distance;
    float time;


    public Location(){
        x =0;
        y =0;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }
    public void setLocation(float a, float b){
        this.x=a;
        this.y=b;
    }
    public boolean compare(Location l){
        if(this.x==l.getX()){
            if(this.y==l.getY()){
                return true;
            }
        }
        return false;
    }

    public float[] getLocation(){
        float[] tmp=new float[2];
        tmp[0]=this.x;
        tmp[1]=this.y;
        return tmp;
    }
}
