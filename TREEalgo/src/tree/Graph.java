package tree;
import java.util.*;
import java.io.*;


public class Graph {
	int v;
	
	LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	Graph(int v){
		this.v=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]= new LinkedList<Integer>();
			
		}
		
	}
	void addedge(int v,int w) {
		adj[v].add(w);
	}
	void util(int v,boolean visited[]) {
		visited[v]=true;
		System.out.println(v+"");
		
		Iterator<Integer> i = adj[v].listIterator();
		if(i.hasNext()) {
			int n = i.next();
			util(n,visited);	
		}	
	}
	void DFS(int v) {
		boolean visited[] = new boolean[v];
		
		util(v,visited);
	}
//	public static void main(String args[]) {
//		
//		Graph G = new Graph(5);
//		System.out.println("enter number of edges: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i =0;i<=n;i++) {
//			System.out.println("V1: ");
//			int v1 = sc.nextInt();
//			System.out.println("V2: ");
//			int v2 = sc.nextInt();
//			G.addedge(v1, v2);
//		}
//		System.out.println("Enter vertex for traversing: ");
//		int a = sc.nextInt();
//		G.DFS(a);
//	}
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num0ber of vertices in the graph: ");
        int vertices = sc.nextInt();

        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges in the graph: ");
        int edges = sc.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print("Enter edge (vertex1 vertex2): ");
            int vertex1 = sc.nextInt();
            int vertex2 = sc.nextInt();
            graph.addedge(vertex1, vertex2);
        }

        System.out.print("Enter the starting vertex for DFS: ");
        int startVertex = sc.nextInt();

        System.out.println("Depth First Traversal (starting from vertex " + startVertex + "): ");
        graph.DFS(startVertex);

        sc.close();
    }
	

}
