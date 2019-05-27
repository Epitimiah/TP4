package main;

import java.util.*;
/**
 *
 * @author lelel
 */
public class Portefeuille {
    private HashMap<String, Fonds> fondsMap;
    private HashMap<String, Instrument> instrumentsMap;
    
    public HashMap<String, Fonds> getFondsMap(){
        return fondsMap;
    }
    
    public HashMap<String, Instrument> getInstruMap(){
        return instrumentsMap;
    }
    
    public void Portefeuille(){
        fondsMap = new HashMap<>();
        instrumentsMap = new HashMap<>();
    }
}
