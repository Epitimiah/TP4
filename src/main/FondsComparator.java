/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;

/**
 *
 * @author adrie
 */
public class FondsComparator implements Comparator<Fonds> {

    @Override
    public int compare(Fonds o1, Fonds o2) {
        return o1.compareTo(o2);
    }
    
}
