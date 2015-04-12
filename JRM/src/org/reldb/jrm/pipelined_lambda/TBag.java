package org.reldb.jrm.pipelined_lambda;

import org.reldb.jrm.Tuple;

@FunctionalInterface
interface TBag {
	enum DuplicateStatus {
		DUPLICATES,
		NO_DUPLICATES,
		UNKNOWN
	};
	
	abstract Tuple getNext();

	default DuplicateStatus getDuplicateStatus() {
		return DuplicateStatus.UNKNOWN;
	}
}
