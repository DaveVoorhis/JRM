package org.reldb.jrm.pipelined_lambda;

import org.reldb.jrm.Tuple;

@FunctionalInterface
interface TBag {
	abstract Tuple getNext();

	default int getDuplicateStatus() {
		return 0;
	}
}
