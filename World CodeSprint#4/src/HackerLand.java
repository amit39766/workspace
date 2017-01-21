
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class HackerLand {


    private static final int INF = 1000000;

    public int[][] allPairShortestPath(int[][] distanceMatrix) {
        
        int distance[][] = new int[distanceMatrix.length][distanceMatrix.length];
        int path[][] = new int[distanceMatrix.length][distanceMatrix.length];

        for (int i=0; i < distanceMatrix.length; i++) {
            for (int j=0; j< distanceMatrix[i].length; j++){
                distance[i][j] = distanceMatrix[i][j];
                if (distanceMatrix[i][j] != INF && i != j) {
                    path[i][j] = i;
                } else {
                    path[i][j] = -1;
                }
            }
        }

        for(int k=0; k < distanceMatrix.length; k++){
            for(int i=0; i < distanceMatrix.length; i++){
                for(int j=0; j < distanceMatrix.length; j++){
                    if(distance[i][k] == INF || distance[k][j] == INF) {
                        continue;
                    }
                    if(distance[i][j] > distance[i][k] + distance[k][j]){
                        distance[i][j] = distance[i][k] + distance[k][j];
                        path[i][j] = path[k][j];
                    }
                }
            }
        }


        return distance;
    }

    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();
    	int M=sc.nextInt();
    	int[][] graph=new int[N][N];
    	for(int k=0;k<N;k++){
    		for(int m=0;m<N;m++){
    			if(m==k)
    				graph[k][m]=0;
    			else
    			graph[k][m]=INF;
    		}
    	}
    	for(int i=0;i<M;i++){
    		int A=sc.nextInt();
    		int B=sc.nextInt();
    		int C=(int) Math.pow(2,sc.nextInt());
    		graph[A-1][B-1]=C;
    	    graph[B-1][A-1]=C;
    	}


        HackerLand shortestPath = new HackerLand();
        int[][] distance = shortestPath.allPairShortestPath(graph);
        int mindistance=0;
        for(int i=0; i < distance.length; i++){
            for(int j=0; j < i; j++){
                mindistance+=distance[i][j];
                
            }
        }
        System.out.println(Integer.toBinaryString(mindistance));
    }
}
