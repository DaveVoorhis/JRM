package org.reldb.jrm.pipelined;

abstract class TSet extends TBag {
	int getDuplicateStatus() {
		return 2;
	}
}
