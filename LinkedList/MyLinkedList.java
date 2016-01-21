public class MyLinkedList<E>{
    private Node<E> head;
    private int size;
    public MyLinkedList(){
        head = null;
        size = 0;
    }
    public void add(E data){
        Node<E> newNode = new Node<E>(data);
        if(head == null){
            head = newNode;
            size += 1;
        } else {
            Node<E> current = head;
            while(current.next() != null){
                current = current.next();
            }
            current.setNext(newNode);
            size += 1;
        }
    }
    public void display(){
        Node<E> current = head;
        while(current != null){
            System.out.println(current.data());
            current = current.next();
        }
    }
    public int size(){
        return size;
    }
    public Node<E> get(int index){
        Node<E> current = head;
        for(int i = 0; i <= index; i++){
                current = current.next();
        }
        return current;
    }
    public Node<E> getBefore(int index){
        Node<E> current = head;
        for(int i = 0; i < index; i++){
            current = current.next();
        }
        return current;
    }
    public void add(int index, E data){
        if(index > 0){
            Node<E> newNode = new Node<E>(data, get(index));
            Node<E> previous = getBefore(index);
            previous.setNext(newNode);
        } else {
            Node<E> newNode = new Node<E>(data, head);
            head = newNode;
        }
    }
    public void set(int index, E data){
        if(index > 0){
            Node<E> current = get(index);
            current.setData(data);  
        } else {
            head.setData(data);
        }
    }
    public void remove(int index){
        if(index > 0){
            Node<E> current = get(index);
            Node<E> previous = getBefore(index);
            previous.setNext(current.next());
        } else {
            head = head.next();
        }
    }
}