package dataStructure.create;

public class LinkedListTest {

    private Node tail;
    private Node head;
    private int size = 0;

    public static class Node {
        public Object data;
        public Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }

    }

    public void addFirst(Object input) {
        Node newMode = new Node(input);
        newMode.next = this.head;
        head = newMode;
        size++;
        if (head.next == null)
            tail = head;
    }

    public void addLast(Object input) {
        Node newMode = new Node(input);
        if (size == 0)
            addFirst(input);
        else {
            tail.next = newMode;
            tail = newMode;
            size++;
        }

    }

    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }

    public void add(int k, Object input) {
        if(k==0)
            addFirst(input);
        else {
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
        }
    }

    public String toString() {
        if(head == null){
            return "[]";
        }
        Node temp = head;
        StringBuilder str = new StringBuilder("[");
        while (temp.next!=null){
            str.append(temp.data).append(",");
            temp = temp.next;
        }
        str.append(temp.data);
        return str+"j";
    }

    public Object removeFirst() {

        Node temp = head;
        head = temp.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;

    }

}