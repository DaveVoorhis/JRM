package org.reldb.jrm.iterate_and_store;

import java.util.Collection;
import java.util.HashSet;

import org.reldb.jrm.Tuple;

public class Relation {
    private Collection<Tuple> store = new HashSet<Tuple>();

    // used to build relation
    protected void add(Tuple t) {
    	store.add(t);
    }

    // used by relvar to build relation
    protected void add(Collection<Tuple> store) {
    	this.store = store;
    }

    // return UNION of this Relation and r
    public Relation union(Relation r) {
        Relation result = new Relation();
        for (Tuple t: store)
            result.add(t);
        for (Tuple t: r.store)
            result.add(t);
        return result;
    }

    public Collection<Tuple> getTuples() {
    	return store;
    }
}
