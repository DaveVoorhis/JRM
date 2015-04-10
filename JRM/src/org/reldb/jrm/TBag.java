package org.reldb.jrm;

abstract class TBag {
	abstract Tuple getNext();

	int getDuplicateStatus() {
		return 0;
	}
}
