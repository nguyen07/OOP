import java.util.Set;
public interface Frontier {
	boolean isEmpty();
	Node remove();
	void Insert(Node N);
	void InsertAll(Set<Node>set_of_nodes);
}
