

import java.util.Collection;
import java.util.HashSet;

public abstract class RelationPipelined {
	// Get the next Tuple, return null if there isn't one.
	public abstract Tuple getNext();

	// return UNION of this Relation and r
	public RelationPipelined union(RelationPipelined r) {
		return new RelationPipelined() {
			public Tuple getNext() {
				Tuple t = RelationPipelined.this.getNext();
				if (t == null)
					t = r.getNext();
				return t;
			}
		}.deduplicate();
	}

	protected RelationPipelined deduplicate() {
		return new RelationPipelined() {
			Collection<Tuple> nodups = new HashSet<Tuple>();

			public Tuple getNext() {
				while (true) {
					Tuple t = RelationPipelined.this.getNext();
					if (t == null)
						return t;
					if (nodups.contains(t))
						continue;
					nodups.add(t);
					return t;
				}
			}
		};
	}

}
