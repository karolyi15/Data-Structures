package org.tec.datastructures;


public class Graph {
	
	int V; //V: Vertexes
	
	SimpleList<SimpleList<Integer>> edgeList;
	
	Graph(){
		
		edgeList = new SimpleList<SimpleList<Integer>>();
		
	}
		
	public void newVertex(Integer src, Integer dest) {
		
		int addings;
		
		if(src < dest) {addings = dest - edgeList.getLength();}
		
		else {addings = src - edgeList.getLength();}
		
		
		for(int i = 0; i < addings+1;i++) {
			
			this.edgeList.addNode(new Node<SimpleList<Integer>>(new SimpleList<Integer>()));
			this.V++;
		}
		
		this.edgeList.getNode(src).getData().addNode(new Node<Integer>(dest));
		this.edgeList.getNode(dest).getData().addNode(new Node<Integer>(src));
		
		
		
	}
	
	public void printGraph() {
		
		for(int i = 0; i < V; i++) {
			
			System.out.println("Adjacency for Vertex #" + i);
			
			SimpleList<Integer> current = this.edgeList.getNode(i).getData();
			if(current.getLength()>0) {
				System.out.print("head --> ");
				for(int j = 0; j < current.getLength(); j++) {
					
					System.out.print(current.getNode(j).getData());
					System.out.print(" --> ");
				}
				System.out.println();
			}
			else {System.out.println("None");}
		}
	}
	public static void main(String[] args) {
		
		
		Graph graph = new Graph();
		
		graph.newVertex(1, 2);
		graph.newVertex(1, 3);
		graph.newVertex(0, 2);
		graph.newVertex(3, 1);

		
		graph.printGraph();
		
		
	}
}
