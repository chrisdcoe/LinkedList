

package linkedlist;



public class Node<D> {
    // PROPERTIES
    Node next;
    D data;
    
    // METHODS
    // Constuctors
    public Node(D newData) {
        data = newData;
        next = null;
    }
    
    public Node(D newData, Node newNext) {
        data = newData;
        next = newNext;
    }
    
    // Getters and Setters
    public D getData() {
        return data;
    }
    
    public Node<D> getNext() {
        return next;
    }
    
    public void setData(D newData) {
        data = newData;
    }
    
    public void setNext(Node<D> newNext) {
        next = newNext;
    }
    
}
