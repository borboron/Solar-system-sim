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
public class Slider {
    private int max;
    private int min;
    private int mid;
    
    Slider(int min, int max, int mid) {
        this.min = min;
        this.max = max;
        this.mid = mid;
        
    }
        public double getMax() {
        return max;
    }

    /**
     * @param max the mass to set
     */
    public void setMax(double mass) {
        this.max = max;
    }
    
        public double getMin() {
        return min;
    }

    /**
     * @param min the mass to set
     */
    public void setMin(double mass) {
        this.min = min;
    }
    
        public double getMid() {
        return mid;
    }

    /**
     * @param mid the mass to set
     */
    public void setMid(double mass) {
        this.mid = mid;
    }



    
    
}

