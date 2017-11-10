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
	
	public void deleteNode(T data) {
		
		DoubleNode<T> current = this.root;
		
		if(this.root.getData().equals(data)) {
			
			this.root = this.root.getNext();
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
		
		while(current!= null) {
			
			System.out.println(current.getData());
			
			current = current.getNext();
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
