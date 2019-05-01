//        /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package examplestarsystem;
//
///**
// *
// * @author 8753
// */
//public class PVector {
//
//    
//    double x; // X location vector
//    double y; // Y location vector
//    
//    // Creates a constructor for a location vector
//    PVector(double x, double y) {
//       this. x = x;
//       this.y = y;
//        
//    }
//    
//    // Function that adds another PVector to the current PVector
//    public void add(PVector v) {
//        y = y + v.y;
//        x = x + v.x;
//        
//    }
//    
//    // Function that subtracts two vectors to work out the distance between two points
//    public void subtract(PVector v) {
//        
//        y = y - v.y;
//        x = x - v.x;
//        
//    }
//    
//    // Function that multiplies the PVector by a constant. Sacling the vector
//    public void multiply(double n) {
//        
//        y = y * n;
//        x = x * n;
//         
//}  
//    // Function that divides the PVector by a constant. 
//    public void divide(double n) {
//        
//        y = y / n;
//        x = x * n;
//            
//    }
//    // Function the works out the length of the vector by using the magnitude equation
//    public double magnitude() {
//        
//        return Math.abs(Math.sqrt(x*x + y*y));
//    }
//    // Function that standardizes the PVector to 1(turns it into a unit vector)
//    public void normalize() {
//        double m = magnitude();
//        if(m != 0) {
//            divide(m);
//        }
//    }
//    
//}
