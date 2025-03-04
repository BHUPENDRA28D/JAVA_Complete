package DSA.LinkedListPractise;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.insertAtStart(81);
        singlyLinkedList.insertAtStart(16);
        singlyLinkedList.insertAtStart(14);
        singlyLinkedList.insertAtStart(18);

        singlyLinkedList.showList();

        singlyLinkedList.insertAtEnd(33);
        singlyLinkedList.insertAtEnd(645);

        singlyLinkedList.showList();

    }
}
