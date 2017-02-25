package com.hacareem.operations;

import java.util.Scanner;

public class TraversalPath
{
    static final int V=9;
    static int counter;
    static int minDistance(int dist[], Boolean sptSet[])
    {
    	int[] x= {1, 2, 5, 8, 9};
    	int[] y= {0, 9, 7, 4, 3};
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    
    static void getPath(int parent[], int j, int path[])
    {
        // Base Case : If j is source
        if (parent[j]==-1)
            return;
     
        getPath(parent, parent[j],path);
        path[counter++]=j;
     
    }


    static int dijkstra(int graph[][], int src, int dest)
    {
        int dist[] = new int[V]; 
        int parent[] = new int[V]; 
        int cost=0;
        int path[]=new int[V];
        path[0]=src;
        counter=1;
        Boolean sptSet[] = new Boolean[V];

        for (int i = 0; i < V; i++)
        {
            parent[src]=-1;
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count <= V-1; count++)
        {
            
            int u = minDistance(dist, sptSet);
            if(u==dest ||count==V-1 && u==dest )
            {
              getPath(parent, u,path);
              String solution= new String();
              
              for (int i = 0; i < counter; i++)
                  solution+=(path[i]+ "\t");
              counter=0;
              return dist[u];
            }

            sptSet[u] = true;

            for (int v = 0; v < V; v++)
            {

                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                {
                    parent[v]  = u;
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        //printSolution(dist, V);
        return -1;
    }

    
    public static void main (String[] args)
    {
        
    int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                };
        Scanner sc= new Scanner(System.in);
        int source=sc.nextInt();
        int dest=sc.nextInt();
        int cost= dijkstra(graph, source , dest);
        if(cost==-1)
        {
            System.out.println(" Sorry no cabs in the root ");
            
        }
        else
        {
            System.out.println("\n your fare is "+cost);
            
        }
        
        
    }
}