package main;

import java.util.*;
/**
 *
 * @author 
 */
public class Instrument extends Fonds{
    private ArrayList<Fonds> fonds;
    
    public ArrayList<Fonds> getFonds(){
        return fonds;
    }
    
    public void Instrument(){}
    public void Instrument(ArrayList<Fonds> fonds){
        this.fonds = fonds;
    }
    
    public void addFonds(){
        fonds.add();
    }
}
