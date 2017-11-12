package org.tec.datastructures;

public class CircularList<T> {
	
	private DoubleNode<T> root;
	
	private int length = 0;

	
	CircularList(){
		
		this.root = null;
		
	}
	
	public void addNode(DoubleNode<T> newNode) {
		
		if(this.root == null) {
			
			this.root = newNode;
			this.length++;
			this.root.setNext(this.root);
			this.root.setPrev(this.root);
			
		}
		else {
			
			DoubleNode<T> current = this.root;
			
			while(current.getNext()!=this.root) {
				
				current = current.getNext();
				
			}
			this.root.setPrev(newNode);
			newNode.setPrev(current);
			newNode.setNext(this.root);
			current.setNext(newNode);
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
			
			DoubleNode<T> prev = this.root.getPrev();
            DoubleNode<T> next = this.root.getNext();

            this.root.setNext(null);

            this.root.setPrev(null);

            this.root = next;

            this.root.setPrev(prev);
            this.root.getPrev().setNext(this.root);

			this.length--;
			return;
		}
		
		
		while(!current.getNext().getData().equals(data)) {
			
			current = current.getNext();
			
		}
		DoubleNode<T> next = current.getNext().getNext();
		
		current.getNext().setNext(null);
		current.getNext().setPrev(null);
		current.setNext(next);
		current.getNext().setPrev(current);
		
		
		
		this.length--;
		
	}
	
	public void printNodes() {
		
		DoubleNode<T> current = this.root;
		
		while(current.getNext() != this.root) {
			
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
