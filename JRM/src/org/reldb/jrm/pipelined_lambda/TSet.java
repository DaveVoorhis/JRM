package org.reldb.jrm.pipelined_lambda;

@FunctionalInterface
interface TSet extends TBag {
	default DuplicateStatus getDuplicateStatus() {
		return DuplicateStatus.NO_DUPLICATES;
	}
}
