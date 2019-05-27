package main;

import java.util.*;
import java.util.Collections;
/**
 *
 * @author 
 */
public class Instrument {
    private ArrayList<Fonds> fonds;
    
    public ArrayList<Fonds> getFonds(){
        return fonds;
    }
    
    public Instrument(){
        this.fonds = new ArrayList<>();
    }
    public Instrument(ArrayList<Fonds> fonds){
        this.fonds = fonds;
    }
    
    public void addFonds(Fonds f){
        fonds.add(f);
    }
    
    public void clearFonds() {
        fonds.clear();
    }
    
    public void tri() {
        Collections.sort(fonds, new FondsComparator());
    }
}
