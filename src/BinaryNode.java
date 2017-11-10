public class BinaryNode<T> {

    public T key;
    public BinaryNode rightChild;
    public BinaryNode leftChild;

    public BinaryNode(T Key){
        this.key=Key;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public T getKey() {
        return key;
    }

    public void setLeftChild(BinaryNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(BinaryNode rightChild) {
        this.rightChild = rightChild;
    }
}
