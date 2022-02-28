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
    public HTLLinkedList removeAtIndex(int index, HTLLinkedList htlLinkedList) {

        Node currentNode = root, previousNode = null;
        int counter = 0;

        //Should the head be deleted?
        if(index == 0 && currentNode != null){
            root = currentNode.getNext();

            System.out.println("Element at position " + index + " got removed");

            return htlLinkedList;
        }

        //Any other element but head and not out of range
        while(currentNode != null){
            if(counter == index){
                previousNode.setNext(currentNode.getNext());

                System.out.println("Element at position " + index + " got removed");
                break;
            }
            else{
                previousNode = currentNode;
                currentNode = currentNode.getNext();
                counter++;
            }
        }

        //Element is out of range
        if(currentNode == null){
            System.out.println("Index is out of range (" + index + ")");
        }

        return htlLinkedList;
    }

    @Override
    public HTLLinkedList removeAtValue(int value, HTLLinkedList htlLinkedList) {
        Node currentNode = root, previousNode = null;

        //if root contains wanted value
        if(currentNode != null && currentNode.getCurrent() == value){
            root = currentNode.getNext();

            System.out.println("Element with value " + value + "got removed");

            return htlLinkedList;
        }

        //if any other index contains wanted value
        while(currentNode != null && currentNode.getCurrent() != value){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if(currentNode != null){
            previousNode.setNext(currentNode.getNext());

            System.out.println("Element with value " + value + " got removed");
        }

        //no index contains wanted value
        if(currentNode == null){
            System.out.println("Element with value " + value + " not found");
        }

        return htlLinkedList;
    }

    @Override
    public void get(int index) {
        

    }

    @Override
    public void printList() {
        Node currentNode = root;
        System.out.println("HTL LinkedList: ");

        while(currentNode != null){
            System.out.println(currentNode.getCurrent() + " ");

            currentNode = currentNode.getNext();
        }
    }
}
