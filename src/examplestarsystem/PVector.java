        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;
import java.lang.Math;
/**
 *
 * @author 8753
 */
public class PVector {
    double x;
    double y;
    
    PVector(double x, double y) {
       this. x = x;
       this.y = y;
        
    }
    
    public void add(PVector v) {
        y = y + v.y;
        x = x + v.x;
        
    }
    
    public void sub(PVector v) {
        
        y = y - v.y;
        x = x - v.x;
        
    }
    
    public void times(double n) {
        
        y = y * n;
        x = x * n;
         
}
    public void div(double n) {
        
        y = y / n;
        x = x * n;
            
    }
    
    public double magnitude() {
        
        return Math.abs(Math.sqrt(x*x + y*y));
    }
    
    public void normalize() {
        
    }
    
    
    
}
