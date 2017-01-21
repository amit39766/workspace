package com.interview.graph;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * http://www.careercup.com/question?id=5922416572235776
 * Test case
 * Source or destination vertex does not exist in the graph
 * There is no path between src to dest vertex
 */
public class PrintAllPathFromSourceToDestination {

    public void printPath(Graph<Integer> graph,Vertex<Integer> start, Vertex<Integer> destination){
        Set<Vertex<Integer>> visited = new LinkedHashSet<Vertex<Integer>>();
        printPath(visited,destination,start);
    }
    
    private void printPath(Set<Vertex<Integer>> visited,Vertex<Integer> destination,Vertex<Integer> current){
        if(visited.contains(current)){
            return;
        }
        if(destination.equals(current)){
            for(Vertex<Integer> v : visited){
                System.out.print(v.id + " ");
            }
            System.out.println(destination.id);
            return;
        }
        
        visited.add(current);
        for(Vertex<Integer> child : current.getAdjacentVertexes()){
            printPath(visited,destination,child);
        }
        visited.remove(current);
    }
    
    public static void main(String args[]){
        Graph<Integer> graph = new Graph<Integer>(false);
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int cost[]=new int[N+1];
        for(int i=1;i<=N;i++) cost[i]=sc.nextInt();
        for(int i=0;i<M;i++) graph.addEdge(sc.nextLong(), sc.nextLong());
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(2, 4);
//        graph.addEdge(2, 5);
//        graph.addEdge(3, 6);
//        graph.addEdge(5, 6);
//        graph.addEdge(5, 7);
//        graph.addEdge(6, 7);
//        graph.addEdge(4, 7);
//        graph.addEdge(1, 8);
//        graph.addEdge(8, 9);
//        graph.addEdge(9, 1);
         Vertex<Integer> start = graph.getVertex(1);
         Vertex<Integer> dest = graph.getVertex(3);
        PrintAllPathFromSourceToDestination pap = new PrintAllPathFromSourceToDestination();
        pap.printPath(graph, start, dest);
    }
}
