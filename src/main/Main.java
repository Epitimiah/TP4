package main;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OneBinomeToRuleThemAll
 * @author leNavetCeleste
 */
public class Main {
    
    public static void println(String s) {
        System.out.println(s);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Portefeuille p = new Portefeuille();
        Scanner scan = new Scanner(System.in);
        
        /* AJOUT DE TRUCS PAR DEFAUT */
        try {
            p.ajouteFondsMap("df", 42.0);
            p.ajouteInstrumentMap("di", new Instrument());
        } catch (FondsExistant | InstrumentExistant e) {
            println(e.toString());
        }
        /* FINI */
        
        /** Test ajouter fonds **/
        println("Ajouter un nouveau fond.");
        println("Clef ? ");
        String s = scan.nextLine();
        println("Valeur ? ");
        double val = scan.nextDouble();
        try {
            p.rechercheFonds(s);
            println("Un fond du meme nom existe deja");
        } catch (FondsInexistant e) {
            try {
                p.ajouteFondsMap(s, val);
                println("Le fonds " + s + " a ete ajoute.");
            } catch (FondsExistant fe) {
                println(fe.toString());
            }   
        }
        
        /** Test ajouter instrument **/
        scan.nextLine();
        println("Ajouter un nouvel instrument.");
        println("Clef de l'instrument ? ");
        s = scan.nextLine();
        
        try {
            p.rechercheInstrument(s);
            println("L'instrument " + s + " existe deja");
        } catch (InstrumentInexistant ex) {
            Instrument i = new Instrument();
            try {
                p.ajouteInstrumentMap(s, i);
                println("L'instrument " + s + " a ete ajoute.");
            } catch (InstrumentExistant ex1) {
                println(ex1.toString());
            }
        } 
        
        /** Test supprimer fonds **/
        println("Supprimer un fonds de la hashmap.");
        println("Clef du fonds ? ");
        s = scan.nextLine();
        
        try {
            p.rechercheFonds(s);
            p.supprFondsMap(s);
            println("Le fonds " + s + " a ete supprime."); 
        } catch (FondsInexistant ef) {
            println("Le fonds n'existe pas.");
        }    
        
        /** Test supprimer instrument **/
        println("Supprimer un instrument de la hashmap.");
        println("Clef de l'instrument ? ");
        s = scan.nextLine();
        
        try {
            p.rechercheInstrument(s);
            p.supprInstrMap(s);
            println("L'instrument " + s + " a ete supprime.");
        } catch (InstrumentInexistant ei) {           
            println("L'instrument n'existe pas.");
        }       
    }
    
}
