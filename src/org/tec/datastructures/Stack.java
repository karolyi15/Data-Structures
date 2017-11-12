package org.tec.datastructures;

public class Stack<T> {
	
	private StackNode<T> last;
	
	private int length = 0;
	
	public void enqueue(StackNode<T> newNode) {
		
		StackNode<T> current = this.last;
		
		if(this.last == null) {
			
			this.last = newNode;
			this.length--;
			
		}
		else {
			
			while(current.getPrev()!=null) {
				
				current = current.getPrev();
				
			}
		
			current.setPrev(newNode);
			this.last = newNode;
			this.length--;
		}
		
	}
	
	public StackNode<T> dequeue(){
		
		StackNode<T> out = this.last;
		
		this.last = out.getPrev();
		
		return out;
	}
	
}
