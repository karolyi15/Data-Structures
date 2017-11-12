package org.tec.datastructures;

public class DoubleList<T> {
	
	private DoubleNode<T> root;
	
	private int length = 0;
	
	DoubleList(){
		
		this.root = null;
		
	}
	
	public void addNode(DoubleNode<T> newNode) {
		
		if(this.root == null) {
			
			this.root = newNode;
			this.length++;
			
		}
		else {
			
			DoubleNode<T> current = this.root;
			
			while(current.getNext()!=null) {
				
				current = current.getNext();
				
			}
			
			current.setNext(newNode);
			newNode.setPrev(current);
			
			this.length++;
			
		}
		
	}
	public DoubleNode<T> getNode(int ind) {
		
		DoubleNode<T> current = this.root;
		
		while(ind > 0) {
			
			current = current.getNext();
			
		}
		
		return current;
	}
	public T getNodeData(int ind) {
		
		DoubleNode<T> current = this.root;
		
		while(ind > 0) {
			
			current = current.getNext();
			
		}
		
		return current.getData();
	}
	
	public void deleteNode(T data) {
		
		DoubleNode<T> current = this.root;
		
		if(this.root.getData().equals(data)) {
			
            DoubleNode<T> next = this.root.getNext();

            this.root.setNext(null);

            this.root.setPrev(null);

            this.root = next;

            this.root.setPrev(null);
			this.length--;
			
		}
		
		
		while(!current.getNext().getData().equals(data)) {
			
			current = current.getNext();
			
		}
		current.getNext().setPrev(null);	
		current.setNext(current.getNext().getNext());
		current.getNext().getPrev().setNext(null);
		current.getNext().setPrev(current);
		this.length--;
	}
	
	public void printNodes() {
		
		DoubleNode<T> current = this.root;
		
		while(current!= null) {
			
			System.out.println(current.getData());
			
			current = current.getNext();
			
		}
		
	}
	
	

	public DoubleNode<T> getRoot() {
		return root;
	}

	public void setRoot(DoubleNode<T> root) {
		this.root = root;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
