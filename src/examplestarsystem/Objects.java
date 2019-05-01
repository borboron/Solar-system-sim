/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplestarsystem;

/**
 *
 * @author cyber
 */
public class Objects {
    public static double upper = 30;
    public static double lower = 5;
    public static double starRadius = 80;
    public static double starMass = 400;
    public static double G = 20;
    public static double width = 800;
    public static double height = 600;
    public static double planetRadius = Math.floor(Math.random()* (upper - lower))+ lower; 
    public static double planetMass = Math.floor(Math.random()* (20))+ 100; 

}
