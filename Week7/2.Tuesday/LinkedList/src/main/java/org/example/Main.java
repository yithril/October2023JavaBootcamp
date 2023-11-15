package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //we can add nodes to the list
        list.addFront("C");
        list.addFront("Z");
        list.addFront("F");

        list.printList();

        list.insertAfter("Z", "L");
        System.out.println("After inserting L: ");
        list.printList();

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
    }
}