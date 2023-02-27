package exo2;

import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {

	private int precedent = 0;
    private int actuel = 1;
    private final int borne;
    private int rang = 0;

    public FiboIterator(int borne) {
        this.borne = borne;
    }

    @Override
    public boolean hasNext() {
        return rang <= borne;
    }

    @Override
    public Integer next() {
        int resultat = precedent + actuel;
        rang++;
        precedent = actuel;
        actuel = resultat;
        return resultat;
    }
	
}