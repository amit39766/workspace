package amit.diu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class FGraph {
	private Map<Integer, LinkedHashSet<Integer>> map = new HashMap();

	public void addEdge(int node1, int node2) {
		LinkedHashSet<Integer> adjacent = map.get(node1);
		if (adjacent == null) {
			adjacent = new LinkedHashSet<Integer>();
			map.put(node1, adjacent);
		}
		adjacent.add(node2);
	}

	public void addTwoWayVertex(int node1, int node2) {
		addEdge(node1, node2);
		addEdge(node2, node1);
	}

	public boolean isConnected(int node1, int node2) {
		Set<Integer> adjacent = map.get(node1);
		if (adjacent == null) {
			return false;
		}
		return adjacent.contains(node2);
	}

	public LinkedList<Integer> adjacentNodes(int last) {
		LinkedHashSet<Integer> adjacent = map.get(last);
		if (adjacent == null) {
			return new LinkedList<>();
		}
		return new LinkedList<Integer>(adjacent);
	}
}

public class FishMonger {

	private static int N;
	private static int M;
	private static int K;
	private static int start;
	private static int end;
	static boolean[] color;

	static ArrayList<Integer> list = new ArrayList<Integer>();

	static int size;
	 static FGraph graph; 
	static ArrayList<ArrayList<Integer>> path = new ArrayList<>();
	static Map<Integer, HashSet<Integer>> fishSold = new HashMap<Integer, HashSet<Integer>>();
	static Map<HashMap<Integer, Integer>, Integer> edgeWeight = new HashMap<HashMap<Integer, Integer>, Integer>();

	public static void main(String[] args) {

	   graph = new FGraph();

		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		color=new boolean[N+1];
		Arrays.fill(color, false); 
		M = in.nextInt();
		K = in.nextInt();
		for (int c = 1; c <= N; c++) {
			int nF = in.nextInt();
			HashSet<Integer> st = new HashSet<>();
			for (int f = 1; f <= nF; f++) {
				st.add(in.nextInt());
			}
			fishSold.put(c, st);
			// cmap.put(c, in.nextInt());
		}
		for (int n = 1; n <= M; n++) {
			int node1 = in.nextInt();
			int node2 = in.nextInt();
			int weight = in.nextInt();
			HashMap<Integer, Integer> arg0 = new HashMap<>();
			arg0.put(node1, node2);
			edgeWeight.put(arg0, weight);
			graph.addTwoWayVertex(node1, node2);
		}
		start = 1;
		end = N;
//		LinkedList<Integer> visited = new LinkedList<>();
//		visited.add(start);
		dfs(start, end);
		//System.out.println(path);
		ArrayList<Integer> minPathCost = new ArrayList<>();
		for (int t = 0; t < path.size(); t++) {
			Set<Integer> fS = new HashSet<>();
			int pathCostS = pathCost(path.get(t));
			fS = fishSells(path.get(t));
			for (int z = t; z < path.size(); z++) {
				int pathCostB = pathCost(path.get(z));
				Set<Integer> tempSet = new HashSet<>(fS);
				tempSet.addAll(fishSells(path.get(z)));
				if (tempSet.size() == K) {
					minPathCost.add((pathCostB > pathCostS) ? pathCostB : pathCostS);
				}

			}
		}
		if (path.size() == 1) {
			HashMap<Integer, Integer> key = new HashMap<>();
			key.put(path.get(0).get(0), path.get(0).get(1));
			int p = edgeWeight.get(key);
			minPathCost.add(p);
		}
		Collections.sort(minPathCost);
		System.out.println(minPathCost.get(0));
		in.close();
	}

	private static int pathCost(ArrayList<Integer> al) {
		int pathcost = 0;
		for (int a = 0; a < al.size() - 1; a++) {
			HashMap<Integer, Integer> key = new HashMap<>();
			if(al.get(a)<al.get(a+1))
				key.put(al.get(a), al.get(a + 1));
			else
				key.put(al.get(a+1), al.get(a));
			pathcost += edgeWeight.get(key);
		}
		return pathcost;
	}

	private static Set<Integer> fishSells(ArrayList<Integer> al) {
		Set<Integer> set = new HashSet<>();
		for (int a : al) {
			set.addAll(fishSold.get(a));
		}
		return set;
	}

	static void dfs(int src, int dst) {
		list.add(src);
		size++;

		color[src] = true;

		if (src == dst) {

			ArrayList<Integer> al = new ArrayList<Integer>();
			for (Integer node : list) {

				al.add(node);

			}
			path.add(al);
			return;
		}

		for (int I = 1; I <= N; I++) {
			if (graph.isConnected(src, I)) {

				if (color[I] == false) {

					dfs(I, dst);
					color[I] = false;

					size--;
					list.remove(size);
				}
			}
		}
	}
}