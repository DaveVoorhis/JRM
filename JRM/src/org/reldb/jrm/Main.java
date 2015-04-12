package org.reldb.jrm;

public class Main {

	public static void main(String[] args) {
		System.out.println("== Iterate and Store ==");
		org.reldb.jrm.iterate_and_store.Main.main(args);
		
		System.out.println("== Pipelined (using anonymous classes) ==");
		org.reldb.jrm.pipelined.Main.main(args);
		
		System.out.println("== Pipelined (using Java 8 lambdas) ==");
		org.reldb.jrm.pipelined_lambda.Main.main(args);		
	}

}
