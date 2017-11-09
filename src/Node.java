public class Node<T> {

    public T data;
    public Node next;

    public void setData(T Data){
        this.data=Data;
    }
    public void setNext(Node Next){
        this.next=Next;
    }
    public T getData(){
        return this.data;
    }
    public Node getNext(){
        return this.next;
    }
}
