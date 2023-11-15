package org.example;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList(){
        this.head = null;
    }

    public void addFront(T data){
        //make a node to be the first node
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        //set the current head node to that node
        head = newNode;
    }

    public void insertAfter(T key, T data){
        Node<T> current = head;

        //search for the node where I want to insert a node after it
        while(current != null && !current.data.equals(key)){
            current = current.next;
        }

        //lets say we did find it
        if(current != null){
            Node<T> newNode = new Node<>(data);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        Node<T> current = head;

        while(current != null){
            System.out.println(current.data +" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
