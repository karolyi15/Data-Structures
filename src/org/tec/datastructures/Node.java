package org.tec.datastructures;

public class Node<T> {

	public Node(T data){

		this.data = data;
		this.next = null;

	}

	public T data;

	public Node<T> next;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}


