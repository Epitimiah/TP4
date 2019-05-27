package main;

/**
 *
 * @author 
 */
public class Fonds implements Comparable<Fonds> {
    private double amount;
    
    public double getAmount(){
        return amount;
    }
    
    public Fonds(double amount){
        this.amount = amount;
    }
    
    public Fonds(){}

    @Override
    public int compareTo(Fonds o) {
        if (o.getAmount() < this.amount)
            return 1;
        if (o.getAmount() > this.amount)
            return -1;
        return 0;
    }
    
    @Override
    public boolean equals(Object o) {
        return o instanceof Fonds && ((Fonds) o).getAmount() == this.amount;
    }
}