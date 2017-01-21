
        import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
        import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

        class Vertex implements Comparable<Vertex>
        {
            public final String name;
            public Edge[] adjacencies;
            public double minDistance = Double.POSITIVE_INFINITY;
            public Vertex previous;
            public Vertex(String argName) { name = argName; }
            public String toString() { return name; }
            public int compareTo(Vertex other)
            {
                return Double.compare(minDistance, other.minDistance);
            }

        }


        class Edge
        {
            public final Vertex target;
            public final double weight;
            public Edge(Vertex argTarget, double argWeight)
            { target = argTarget; weight = argWeight; }
        }

        public class Dijkstra
        {
            public static void computePaths(Vertex source)
            {
                source.minDistance = 0.00;
                PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
            vertexQueue.add(source);

            while (!vertexQueue.isEmpty()) {
                Vertex u = vertexQueue.poll();

                    // Visit each edge exiting u
                    for (Edge e : u.adjacencies)
                    {
                        Vertex v = e.target;
                        double weight = e.weight;
                        double distanceThroughU = u.minDistance + weight;
                if (distanceThroughU < v.minDistance) {
                    vertexQueue.remove(v);

                    v.minDistance = distanceThroughU ;
                    v.previous = u;
                    vertexQueue.add(v);
                }
                    }
                }
            }

            public static List<Vertex> getShortestPathTo(Vertex target)
            {
                List<Vertex> path = new ArrayList<Vertex>();
                for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
                    path.add(vertex);

                Collections.reverse(path);
                return path;
            }

            public static void main(String[] args)
            {
            	Map<Vertex,Vertex> cmap=new HashMap<Vertex,Vertex>();
            	Scanner sc=new Scanner(System.in);
            	int N=sc.nextInt();
                for(int c=1;c<=N;c++){
                	cmap.put(new Vertex(String.valueOf(c)),new Vertex(String.valueOf(sc.nextInt())));
                }
                Vertex[] ve=new Vertex[N+1];
                for(int n=1;n<=N;n++){
                	ve[n]=new Vertex(String.valueOf(n));
                }
                for(int n=1;n<N;n++){
                	int L=sc.nextInt();
                	Vertex argTarget=new Vertex(String.valueOf(sc.nextInt()));
                	ve[L].adjacencies=new Edge[]{new Edge(argTarget,  n)};
                }

                for(Vertex vx:ve){
                	computePaths(vx);
                	int sum=1;
                	for(Vertex v:ve){
                		if(v.equals(vx))
                			continue;
                		List<Vertex> path=getShortestPathTo(v);
                		Set<Vertex>set=new HashSet<Vertex>();
                		for(Vertex p:path){
                			set.add(cmap.get(p));
                		}
                		sum+=set.size();
                	}
                	System.out.println(sum);
                }
//                computePaths(A); // run Dijkstra
//                System.out.println("Distance to " + Z + ": " + Z.minDistance);
//                List<Vertex> path = getShortestPathTo(Z);
//                System.out.println("Path: " + path);
            }
        }