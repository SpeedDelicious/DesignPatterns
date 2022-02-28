package at.fh.oo.java.HTLList;

public class Main {

    public static void main(String[] args) {
        HTLLinkedList htlLinkedList = new HTLLinkedList();

        htlLinkedList.add(3);
        htlLinkedList.add(8);
        htlLinkedList.add(11);
        htlLinkedList.add(13);
        htlLinkedList.add(20);

        htlLinkedList.printList();

        htlLinkedList.removeAtIndex(2, htlLinkedList);

        htlLinkedList.printList();

        htlLinkedList.removeAtValue(20, htlLinkedList);

        htlLinkedList.printList();
    }
}
