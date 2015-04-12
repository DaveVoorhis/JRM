package org.reldb.jrm.iterate_and_store;

import java.util.Collection;
import java.util.HashSet;

import org.reldb.jrm.Tuple;

public class Relvar {

	private Collection<Tuple> store = new HashSet<Tuple>();

	public void insert(Tuple t) {
		store.add(t);
	}

	public Relation getRelation() {
		Relation r = new Relation();
		r.add(store);
		return r;
	}

}
