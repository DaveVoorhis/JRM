package org.reldb.jrm.pipelined;

import org.reldb.jrm.Tuple;

abstract class TBag {
	enum DuplicateStatus {
		DUPLICATES,
		NO_DUPLICATES,
		UNKNOWN
	};
	
	abstract Tuple getNext();

	DuplicateStatus getDuplicateStatus() {
		return DuplicateStatus.UNKNOWN;
	}
}
