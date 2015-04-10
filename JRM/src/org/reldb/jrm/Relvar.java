package org.reldb.jrm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Relvar {

	private Collection<Tuple> store = new HashSet<Tuple>();

	public void insert(Tuple t) {
		store.add(t);
	}

	public TSet getTSet() {
		return new TSet() {
			Iterator<Tuple> tuples = store.iterator();

			public Tuple getNext() {
				if (tuples.hasNext())
					return tuples.next();
				return null;
			}
		};
	}

	public RelationSimple getRelationSimple() {
		RelationSimple r = new RelationSimple();
		r.add(store);
		return r;
	}

}
