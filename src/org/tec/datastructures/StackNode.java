package org.tec.datastructures;

public class StackNode<T> {
	

	public StackNode(T data){
		
		this.data = data;
		this.prev = null;
		
	}
	
	private T data;
	
	private StackNode<T> prev;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public StackNode<T> getPrev() {
		return prev;
	}

	public void setPrev(StackNode<T> prev) {
		this.prev = prev;
	}

	
}
