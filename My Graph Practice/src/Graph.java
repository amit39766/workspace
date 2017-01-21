import java.util.ArrayList;
import java.util.HashMap;

public class Graph<E> {
	private HashMap<E,ArrayList<E>> adjacencyLists;
	public Graph(){
		adjacencyLists=new HashMap<>();
	}
	public Graph(ArrayList<E> nodes){
		for(E e:nodes){
			adjacencyLists.put(e, new ArrayList<>());
		}
	}


}
