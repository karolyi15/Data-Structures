public class QueueNode<T> {

    public T data;
    public QueueNode next;

    public QueueNode(T Data){

        this.data=Data;
    }
    public void setNext(QueueNode Next){
        this.next=Next;
    }
    public T getData(){
        return this.data;
    }
    public QueueNode getNext(){
        return this.next;
    }
}
