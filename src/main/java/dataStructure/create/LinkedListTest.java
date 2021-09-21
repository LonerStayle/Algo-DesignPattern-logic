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
            return String.valueOf(data);
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

    public void add(int k, Object input) {
        if (k == 0)
            addFirst(input);
        else {
            Node temp1 = node(k - 1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
        }
    }

    public Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }

    public String toString() {
        if (head == null)
            return "[]";
        Node temp = head;
        StringBuilder str = new StringBuilder("[");
        while (temp.next != null) {
            str.append(temp.data).append(",");
            temp = temp.next;
        }
        str.append(temp.data);
        return str + "]";
    }


    public Object removeFirst() {
        Node temp = head;
        head = temp.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public void remove(int k) {
        if (k == 0)
            removeFirst();

        Node temp = node(k - 1);
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;

        if (todoDeleted == tail)
            tail = temp;

        size--;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return node(index);
    }

    public int indexOf(Object data) {
        Node temp = head;
        int i = 0;

        while (temp.data != data) {
            temp = temp.next;
            i++;

            if (temp == null)
                return -1;
        }
        return i;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    public class ListIterator {
        private Node lastReturned;
        private Node next;
        private int nextIndex;

        ListIterator() {
            next = head;
            nextIndex = 0;
        }
    }
}