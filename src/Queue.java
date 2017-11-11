public class Queue<T> {
    public QueueNode first;
    public QueueNode last;
    public int lenght;

    public void enqueue(T data){
        QueueNode<T> New=new QueueNode<T>(data);
        if(this.first==null){
            this.first=this.last=New;
        }else{
            this.last.setNext(New);
            this.last=New;
        }
        lenght++;
    }
    public QueueNode<T> dequeue(){
        QueueNode<T> current = this.first;
        this.first=this.first.getNext();
        current.next=null;
        lenght--;
        return current;
    }
    public int getLenght(){
        return this.lenght;
    }

    public void display() {
        QueueNode current = this.first;
        for(int i=0;i<lenght;i++){
            System.out.print(current.getData()+" ");
            current=current.getNext();
        }
    }
    public static void main(String[] args){
        Queue queue=new Queue();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        queue.enqueue("cuatro");
        queue.dequeue();

        queue.display();
    }
}
