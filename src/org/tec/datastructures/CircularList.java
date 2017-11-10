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
			
		}
		else {
			
			DoubleNode<T> current = this.root;
			
			while(current.getNext()!=this.root) {
				
				current = current.getNext();
				
			}
			
			newNode.setPrev(current);
			newNode.setNext(this.root);
			current.setNext(newNode);
			this.length++;
			
		}
		
	}
	
	public void deleteNode(T data) {
		
		DoubleNode<T> current = this.root;
		
		if(this.root.getData().equals(data)) {
			
			this.root = current.getNext();
			this.root.setPrev(current.getPrev());
			this.length--;
			
		}
		
		
		while(!current.getNext().getData().equals(data)) {
			
			current = current.getNext();
			
		}
		
		current.setNext(current.getNext().getNext());
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
