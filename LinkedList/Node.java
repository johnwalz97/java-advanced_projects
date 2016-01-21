public class Node<E>{
    private E data;
    private Node<E> next;
    public Node(){
        data = null;
        next = null;
    }
    public Node(E newData){
        data = newData;
        next = null;
    }
    public Node(E newData, Node<E> newNext){
        data = newData;
        next = newNext;
    }
    public E data(){
        return data;
    }
    public void setData(E newData){
        data = newData;
    }
    public Node next(){
        return next;
    }
    public void setNext(Node<E> newNext){
        next = newNext;
    }
}