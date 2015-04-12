package org.reldb.jrm.pipelined;

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
		
		TSet resultP = Relation.unduplicate(Relation.union(rv1.getTSet(), rv2.getTSet()));
		Tuple t;
		while ((t = resultP.getNext()) != null)
			System.out.println(t.toString());
	}

}
