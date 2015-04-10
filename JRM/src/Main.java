

public class Main {

	public static void main(String[] args) {
		Relvar rv1 = new Relvar();
		rv1.insert(new Tuple("one"));
		rv1.insert(new Tuple("two"));
		rv1.insert(new Tuple("three"));
		
		Relvar rv2 = new Relvar();
		rv2.insert(new Tuple("four"));
		rv2.insert(new Tuple("two"));
		rv2.insert(new Tuple("five"));

		System.out.println("== RelationSimple ==");
		
		RelationSimple resultS = rv1.getRelationSimple().union(rv2.getRelationSimple());
		for (Tuple t: resultS.getTuples())
			System.out.println(t.toString());
		
		System.out.println("== RelationPipelined ==");
		
		RelationPipelined resultP = rv1.getRelationPipelined().union(rv2.getRelationPipelined());
		Tuple t;
		while ((t = resultP.getNext()) != null)
			System.out.println(t.toString());
	}

}
