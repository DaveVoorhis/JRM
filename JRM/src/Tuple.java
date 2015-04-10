

public class Tuple implements Comparable<Tuple> {
	private String contents;
	public Tuple(String contents) {
		this.contents = contents;
	}
	public String toString() {
		return "TUPLE {" + contents + "}";
	}
	public boolean equals(Object o) {
		return contents.equals(((Tuple)o).contents);
	}
	@Override
	public int compareTo(Tuple o) {
		return contents.compareTo(o.contents);
	}
	public int hashCode() {
		return contents.hashCode();
	}
}
