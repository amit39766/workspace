package amit.diu;

import java.util.*;
class Graph {
    private Map<String, LinkedHashSet<String>> map = new HashMap();

    public void addEdge(String node1, String node2) {
        LinkedHashSet<String> adjacent = map.get(node1);
        if(adjacent==null) {
            adjacent = new LinkedHashSet();
            map.put(node1, adjacent);
        }
        adjacent.add(node2);
    }

    public void addTwoWayVertex(String node1, String node2) {
        addEdge(node1, node2);
        addEdge(node2, node1);
    }

    public boolean isConnected(String node1, String node2) {
        Set adjacent = map.get(node1);
        if(adjacent==null) {
            return false;
        }
        return adjacent.contains(node2);
    }

    public LinkedList<String> adjacentNodes(String last) {
        LinkedHashSet<String> adjacent = map.get(last);
        if(adjacent==null) {
            return new LinkedList();
        }
        return new LinkedList<String>(adjacent);
    }
}

public class Search {

private static final String START = "B";
private static final String END = "E";

public static void main(String[] args) {
    // this graph is directional
    Graph graph = new Graph();
    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.addEdge("B", "A");
    graph.addEdge("B", "D");
    graph.addEdge("B", "E"); // this is the only one-way connection
    graph.addEdge("B", "F");
    graph.addEdge("C", "A");
    graph.addEdge("C", "E");
    graph.addEdge("C", "F");
    graph.addEdge("D", "B");
    graph.addEdge("E", "C");
    graph.addEdge("E", "F");
    graph.addEdge("F", "B");
    graph.addEdge("F", "C");
    graph.addEdge("F", "E");
    List<ArrayList<String>> paths = new ArrayList<ArrayList<String>>();
    String currentNode = START;
    List<String> visited = new ArrayList<String>();
    visited.add(START);
    new Search().findAllPaths(graph, seen, paths, currentNode);
    for(ArrayList<String> path : paths){
        for (String node : path) {
            System.out.print(node);
            System.out.print(" ");
        }
        System.out.println();
    }   
}

private void findAllPaths(Graph graph, List<String> visited, List<ArrayList<String>> paths, String currentNode) {        
    if (currentNode.equals(END)) { 
        paths.add(new ArrayList(Arrays.asList(visited.toArray())));
        return;
    }
    else {
        LinkedList<String> nodes = graph.adjacentNodes(currentNode);    
        for (String node : nodes) {
            if (visited.contains(node)) {
                continue;
            } 
            List<String> temp = new ArrayList<String>();
            temp.addAll(visited);
            temp.add(node);          
            findAllPaths(graph, temp, paths, node);
        }
    }
}
}