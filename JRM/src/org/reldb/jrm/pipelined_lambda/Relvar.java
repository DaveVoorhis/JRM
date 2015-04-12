package org.reldb.jrm.pipelined_lambda;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.reldb.jrm.Tuple;

public class Relvar {

	private Collection<Tuple> store = new HashSet<Tuple>();

	public void insert(Tuple t) {
		store.add(t);
	}

	public TSet getTSet() {
		Iterator<Tuple> tuples = store.iterator();
		return () -> (tuples.hasNext()) ? tuples.next() : null;
	}

}
