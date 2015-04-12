package org.reldb.jrm.pipelined;

import java.util.Collection;
import java.util.HashSet;

import org.reldb.jrm.Tuple;

public class Relation {
	// return UNION
	public static TBag union(TBag b1, TBag b2) {
		return new TBag() {
			public Tuple getNext() {
				Tuple t = b1.getNext();
				if (t != null)
					return t;
				else
					return b2.getNext();
			}
		};
	}

	public static TSet unduplicate(TBag bag) {
		if (bag.getDuplicateStatus() == 2)
			return new TSet() {
				Tuple getNext() {
					return bag.getNext();
				}
			};
		else
			return new TSet() {
				Collection<Tuple> undup = new HashSet<Tuple>();

				Tuple getNext() {
					while (true) {
						Tuple t = bag.getNext();
						if (t == null)
							return t;
						if (undup.contains(t))
							continue;
						undup.add(t);
						return t;
					}
				}
			};
	}

}
