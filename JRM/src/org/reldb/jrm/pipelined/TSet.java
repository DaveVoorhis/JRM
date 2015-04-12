package org.reldb.jrm.pipelined;

abstract class TSet extends TBag {
	DuplicateStatus getDuplicateStatus() {
		return DuplicateStatus.NO_DUPLICATES;
	}
}
