package main;

import java.util.*;
/**
 *
 * @author 
 */
public class Portefeuille{
    private HashMap<String, Fonds> fondsMap;
    private HashMap<String, Instrument> instrumentsMap;
    
    public HashMap<String, Fonds> getFondsMap(){
        return fondsMap;
    }
    
    public HashMap<String, Instrument> getInstruMap(){
        return instrumentsMap;
    }
    
    public Portefeuille(){
        fondsMap = new HashMap<>();
        instrumentsMap = new HashMap<>();
    }
    
    public double rechercheFonds(String s) throws FondsInexistant{
        Fonds f;
        if (this.fondsMap.isEmpty())
            f = null;
        else
            f = this.fondsMap.get(s);

        if(f == null){
            throw new FondsInexistant("Il n'existe pas de fonds avec ce nom");
        }
        else{
            return f.getAmount();
        }
    }
    
    public ArrayList<Fonds> rechercheInstrument(String s) throws InstrumentInexistant{
        Instrument f = instrumentsMap.get(s);
        if(f == null){
            throw new InstrumentInexistant("Il n'existe pas d'instrument avec ce nom");
        }
        else{
            return f.getFonds();
        }
    }
    
    public void ajouteFondsMap(String clef, double valeur) throws FondsExistant{
        if(fondsMap.containsKey(clef)){
            throw new FondsExistant("Ce fonds existe deja");
        }
        else{
            Fonds f = new Fonds(valeur);
            fondsMap.put(clef, f);
        }     
    }
    
    public void ajouteInstrumentMap(String clef, Instrument i) throws InstrumentExistant {
        if (instrumentsMap.containsKey(clef)) {
            throw new InstrumentExistant("Cet instrument existe deja");
        } else {
            instrumentsMap.put(clef, i);
        }
    }
    
    public void ajouteFondsInstrument(String clef, Fonds f) throws InstrumentInexistant{
        Instrument i = instrumentsMap.get(clef);
        if(i == null){
            throw new InstrumentInexistant("Il n'existe pas d'instrument avec ce nom");
        }
        else{
            i.addFonds(f);
        }
    }
    
    public void supprFondsMap(String clef){
        try {
            rechercheFonds(clef);
            fondsMap.remove(clef);
        } catch (FondsInexistant e) {
            System.out.println(e);
        }
    }
    
    public void supprInstrMap(String clef){
        try {
            rechercheInstrument(clef);
            Instrument i = instrumentsMap.get(clef);
            i.clearFonds();
            instrumentsMap.remove(clef);
        } catch (InstrumentInexistant e) {
            System.out.println(e);
        }
    }
    
}
