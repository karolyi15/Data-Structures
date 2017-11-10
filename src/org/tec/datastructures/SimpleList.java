package org.tec.datastructures;


public class SimpleList<T> {
	
	Node<T> root = null;
	
	private int length = 0;

	
	public SimpleList(){}
	
	public void addNode(Node<T> newNode) {
		
		if(this.root == null) {
			
			this.root = newNode;
			this.length++;
			
		}
		else {
			
			Node<T> current = this.root;
			
			while(current.getNext()!=null) {
				
				current = current.getNext();
				
			}
			
			current.setNext(newNode);
			this.length++;
			
		}
		
	}
	public Node<T> getNode(int ind) {
		
		Node<T> current = this.root;
		
		int i = 0;
		
		while(ind != i) {
			
			current = current.getNext();
			i++;
		}
		
		return current;
	}
	public T getNodeData(int ind) {
		
		Node<T> current = this.root;
		
		while(ind > 0) {
			
			current = current.getNext();
			
		}
		
		return current.getData();
	}
	
	public void deleteNode(T data) {
		
		Node<T> current = this.root;
		
		if(this.root.getData().equals(data)) {
			
			this.root = this.root.getNext();
			this.length--;
			
		}
		
		
		while(!current.getNext().getData().equals(data)) {
			
			current = current.getNext();
			
		}
		
		current.setNext(current.getNext().getNext());
		this.length--;
		
	}
	
	public void printNodes() {
		
		Node<T> current = this.root;
		
		while(current!= null) {
			
			System.out.println(current.getData());
			
			current = current.getNext();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		SimpleList<String> stringList = new SimpleList<String>();
		
		SimpleList<Integer> intList = new SimpleList<Integer>();

		for(int i = 0; i < 20; i++) {
			
			intList.addNode(new Node<Integer>(i));
			stringList.addNode(new Node<String>("Hola"));

		}
		
		stringList.printNodes();
		intList.printNodes();
		
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	
}
