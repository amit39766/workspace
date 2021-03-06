package amit.diu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution2 {

    static int[][] graph;
    static List<int[]> cycles = new ArrayList<int[]>();
    static int[][] uniqeEdge;
    static Set<HashSet<Integer>> set=new HashSet<HashSet<Integer>>();


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	int M=sc.nextInt();
    	uniqeEdge=new int[N+2][N+2];
    	graph=new int[M][2];
    	for(int n=1;n<=M;n++){
    		int node1=sc.nextInt();
    		int node2=sc.nextInt();
    		graph[n-1][0]=node1;
    		graph[n-1][1]=node2;
    		uniqeEdge[node1][node2]=n;
    		uniqeEdge[node2][node1]=n;

    	}
        for (int i = 0; i < graph.length; i++)
            for (int j = 0; j < graph[i].length; j++)
            {
                findNewCycles(new int[] {graph[i][j]});
            }
        int maxcycle=0;
        for (int[] cy : cycles)
        {
//        	 String s = "" + cy[0];
//
//             for (int i = 1; i < cy.length; i++)
//             {
//                 s += "," + cy[i];
//             }
//
//             o(s);
        	if(cy.length>=4){
        		maxcycle++;
        	}
        }
        o(String.valueOf(maxcycle));

    }

    static void findNewCycles(int[] path)
    {
            int n = path[0];
            int x;
            int[] sub = new int[path.length + 1];

            for (int i = 0; i < graph.length; i++)
                for (int y = 0; y <= 1; y++)
                    if (graph[i][y] == n)
                    //  edge refers to our current node
                    {
                        x = graph[i][(y + 1) % 2];
                        if (!visited(x, path))
                        //  neighbor node not on path yet
                        {
                            sub[0] = x;
                            System.arraycopy(path, 0, sub, 1, path.length);
                            //  explore extended path
                            findNewCycles(sub);
                        }
                        else if ((path.length > 2) && (x == path[path.length - 1]))
                        //  cycle found
                        {	
                        	if(path.length>=4){
                        	HashSet<Integer> st=new HashSet<>();
                            for(int k=0;k<path.length-1;k++){
                            	
                            	if(k==path.length-2){
                    				st.add(uniqeEdge[path[k+1]][path[0]]);
                    			}
                            	st.add(uniqeEdge[path[k]][ path[k+1]]);
                            }
                            if(!set.contains(st)){
                            	cycles.add(path);
                            	set.add(st);
                            }
                            }
                        }
                    }
    }


    static void o(String s)
    {
        System.out.println(s);
    }
    static Boolean visited(int n, int[] path)
    {
        Boolean ret = false;

        for (int p : path)
        {
            if (p == n)
            {
                ret = true;
                break;
            }
        }

        return ret;
    }

}

