package org.reldb.jrm;


import java.util.Collection;
import java.util.HashSet;

public class RelationSimple {
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
    public RelationSimple union(RelationSimple r) {
        RelationSimple result = new RelationSimple();
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
