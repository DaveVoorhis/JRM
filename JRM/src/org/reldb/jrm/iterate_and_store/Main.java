package org.reldb.jrm.iterate_and_store;

import org.reldb.jrm.Tuple;

public class Main {

	public static void main(String[] args) {
		Relvar rv1 = new Relvar();
		rv1.insert(new Tuple("one"));
		rv1.insert(new Tuple("two"));
		rv1.insert(new Tuple("three"));
		
		Relvar rv2 = new Relvar();
		rv2.insert(new Tuple("four"));
		rv2.insert(new Tuple("two"));
		rv2.insert(new Tuple("five"));
		
		Relation resultS = rv1.getRelation().union(rv2.getRelation());
		for (Tuple t: resultS.getTuples())
			System.out.println(t.toString());
	}

}
