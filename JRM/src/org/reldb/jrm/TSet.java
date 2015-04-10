package org.reldb.jrm;

abstract class TSet extends TBag {
	int getDuplicateStatus() {
		return 2;
	}
}
