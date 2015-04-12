package org.reldb.jrm.pipelined;

import org.reldb.jrm.Tuple;

abstract class TBag {
	abstract Tuple getNext();

	int getDuplicateStatus() {
		return 0;
	}
}
