
public class Tuple implements Comparable<Tuple> {
	private String contents;

	public Tuple(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "TUPLE {" + contents + "}";
	}

	@Override
	public boolean equals(Object o) {
		return contents.equals(((Tuple) o).contents);
	}

	@Override
	public int compareTo(Tuple o) {
		return contents.compareTo(o.contents);
	}

	@Override
	public int hashCode() {
		return contents.hashCode();
	}
}
