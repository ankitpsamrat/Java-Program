//  reverse a linked list

import java.util.LinkedList;

public class linked_list2 {

    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        while (!list.isEmpty()) {
            reversedList.addFirst(list.removeFirst());
        }
        return reversedList;
    }

    private static void printList(LinkedList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // print original linked list
        System.out.println("Original linked list:");
        printList(list);

        // reverse linked list
        list = reverseLinkedList(list);

        // print reversed linked list
        System.out.println("Reversed linked list:");
        printList(list);
    }
}