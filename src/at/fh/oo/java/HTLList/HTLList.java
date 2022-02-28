package at.fh.oo.java.HTLList;

public interface HTLList {
    public void add(int value);
    public HTLLinkedList removeAtIndex(int index, HTLLinkedList htlLinkedList);
    public HTLLinkedList removeAtValue(int value, HTLLinkedList htlLinkedList);
    public void get(int index);
    public void printList();
}
