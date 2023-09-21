/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author fa20-bse-021
 */
public class Subject {
    private List<Observer> observerpattern = new ArrayList<Observer>();
    private int state;
    public int getState(){
        
        return state;
    
    }
    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }
    public void attach(Observer observer){
        observerpattern.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer obs:observerpattern){
            obs.update();
            
        }
    }
    
}
    
