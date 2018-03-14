import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
import java.io.*;
class Graph{
	int v;
	LinkedList<Integer> adjmatrix[];
	public Graph(int v){
		this.v=v;
		adjmatrix= new LinkedList[v];
		for(int i=0;i<v;i++){
			adjmatrix[i]= new LinkedList<>();
		}
	}
}	
public class BFSGraph{
		void addEdge(Graph graph,int src,int dest){
			graph.adjmatrix[src].addFirst(dest);
			graph.adjmatrix[dest].addFirst(src);
		}
		void PrintGrapgh(Graph graph){
			for(int i=0;i<graph.v;i++){
				System.out.print("Vertex "+i);
				System.out.print(" Touching Vertexes are: "+graph.adjmatrix[i]);
				
			System.out.println();
			}
		}
		void printBFS(Graph graph){
			Queue<Integer> que= new LinkedList<Integer>();
			Queue<Integer> res= new LinkedList<Integer>();
			for(int i=0;i<graph.v;i++){
				if(res.isEmpty() || (!res.contains(i))){
					res.add(i);
				}
				int ins=0;
				for(Integer a: graph.adjmatrix[i]){
					if(!res.contains(a)){
						res.add(a);
						que.add(a);
						ins++;
					}
				}
			}
			System.out.println(que);
			System.out.println(res);
			while(!que.isEmpty()){
				Integer t= que.poll();
				for(Integer a:graph.adjmatrix[t]){
					if(!res.contains(a)){
						res.add(a);	
					}
				}
			}
			
		}
		public static void main(String [] args){
			BFSGraph a = new BFSGraph();
			int V=4;
			Graph g = new Graph(V);
			a.addEdge(g,0, 1);
			a.addEdge(g,0, 2);
			a.addEdge(g,1, 2);
			a.addEdge(g,2, 0);
			a.addEdge(g,2, 3);
			a.addEdge(g,3, 3);
			
			a.PrintGrapgh(g);
			a.printBFS(g);
		}
}