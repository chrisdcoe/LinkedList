
package linkedlist;

import java.util.LinkedList;

public class MyLinkedList<D> {

    // PROPERTIES
    Node<D> head; // first 'train car' in linked list
    int count; // num of objects in linked list
    
    // CONSTRUCTORS
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }
    
    public MyLinkedList(Node newHead) {
        head = newHead;
        count = 1;
    }
    
    // add nodes
    public void add(D newData) {
        Node<D> temp = new Node(newData);
        Node<D> current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++; // one more item in the list
    }
    
    // GET: retreive nodes (data in nodes)
    public D get(int index) {
//        if (index <= 0) {
//            return -1;
//        }
        Node<D> current = head;
        for (int i = 1; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }
    
    // SIZE: how many nodes in sequence?
    public int size() {
        return count;
    }
    
    // is sequence empty?
    public boolean isEmpty() {
        return head == null; // if head is not null, returns false.
    }
    
    // remove nodes
    public void remove() {
        // remove from back of list
        Node<D> current = head;
        while(current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    // METHODS
    

    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Alice");
        System.out.println(linkedlist);
        linkedlist.add("Bill");
        System.out.println(linkedlist);
    }
    
}
