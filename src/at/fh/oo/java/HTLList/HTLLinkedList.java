package at.fh.oo.java.HTLList;

public class HTLLinkedList implements HTLList{

    private Node root;

    @Override
    public void add(int value) {

        if (root==null){
            Node node = new Node(value);
            this.root = node;
            return;
        }

        Node pointer = this.root;
        while(pointer.getNext()!=null){
            pointer = pointer.getNext();
        }

        Node node = new Node(value);
        pointer.setNext(node);
    }

    @Override
    public void remove(int index) {

        Node pointer = this.root;
        for(int i = 0; i < index; i++){
            pointer = pointer.getNext();

            if(i == index - 1){
                pointer = pointer.getNext().getNext();
                System.out.println("Wert bei Index " + i + " wurde removed");
            }
        }
    }

    @Override
    public void get(int index) {
        
        Node pointer = this.root;

        for (int i = 0; i < index; i++){
            if(i == index - 1){
                System.out.println(pointer.getNext());
            }
        }
    }

    @Override
    public void printList() {
        Node currentNode = root;
        Node temp = new Node(2);
        System.out.println("HTL LinkedList: ");

        while(currentNode != null){
            System.out.println(currentNode.getCurrent() + " ");

            currentNode = currentNode.getNext();
        }
    }
}
