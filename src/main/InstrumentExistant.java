/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author lelel
 */
public class InstrumentExistant extends Exception {

    /**
     * Creates a new instance of <code>InstrumentExistant</code> without detail
     * message.
     */
    public InstrumentExistant() {
    }

    /**
     * Constructs an instance of <code>InstrumentExistant</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InstrumentExistant(String msg) {
        super(msg);
    }
}
