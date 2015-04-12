package org.reldb.jrm.pipelined_lambda;

@FunctionalInterface
interface TSet extends TBag {
	default int getDuplicateStatus() {
		return 2;
	}
}
