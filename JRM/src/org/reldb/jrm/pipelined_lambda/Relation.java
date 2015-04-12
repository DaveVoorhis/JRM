package org.reldb.jrm.pipelined_lambda;

import java.util.Collection;
import java.util.HashSet;

import org.reldb.jrm.Tuple;

public class Relation {
	
	// UNION
	public static TBag union(TBag b1, TBag b2) {
		return () -> {
			Tuple t1 = b1.getNext();
			if (t1 != null)
				return t1;
			return b2.getNext();
		};
	}

	public static TSet unduplicate(TBag bag) {
		if (bag.getDuplicateStatus() == 2)
			return () -> bag.getNext();
		else {
			Collection<Tuple> undup = new HashSet<Tuple>();
			return () -> {
				while (true) {
					Tuple t = bag.getNext();
					if (t == null)
						return t;
					if (undup.contains(t))
						continue;
					undup.add(t);
					return t;
				}
			};
		}
	}

}
