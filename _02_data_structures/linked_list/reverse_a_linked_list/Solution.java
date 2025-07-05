package _02_data_structures.linked_list.reverse_a_linked_list;

import _02_data_structures.linked_list.LinkedList;

public class Solution {
    public static LinkedList.Node reverseLinkedList(LinkedList list) {
        LinkedList.Node prevNode = null;
        LinkedList.Node currentNode = list.head;

        while(currentNode != null) {
            LinkedList.Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }

        return prevNode;
    }
    
}
