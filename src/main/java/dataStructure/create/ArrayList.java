package dataStructure.create;


import org.junit.Test;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];


//    public boolean add(int index, Object element) {
//        for (int i = size - 1; i >= index; i--) {
//            elementData[i + 1] = elementData[i];
//        }
//        elementData[index] = element;
//        size++;
//        return true;
//
//    }
    public boolean add(int index, Object element) {
        int changeCycle = index + 1 ;
        for (int i = changeCycle; i < size; i++) {
            elementData[i] = elementData[i-1];
        }
        elementData[index] = element;
        size++;
        return true;
    }
    public void addFirst(Object element) {
        add(0, element);
    }

    public void addLast(Object element) {
        elementData[size] = element;
        size++;
    }


    public void removeFirst() {
        remove(0);
    }


    public Object remove(int index) {
        Object removed = elementData[index];
        for (int i = index; i <= size - 1; i++) {

            elementData[i] = elementData[i+1];
        }
        size--;
        elementData[size] = null;
        return true;
    }


    public void removeLast() {
        remove(size - 1);
    }




    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(elementData[i]);
            if (i < size - 1) {
                str.append(",");
            }
        }
        return str + "]";
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public Object indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public ListIterator listIterator(){
        return new ListIterator();
    }
    class ListIterator{
        private int nextIndex = 0;
        public boolean hasNext(){
            return nextIndex <size();
        }
        public boolean hasPrevious(){
            return nextIndex>0;
        }
        public Object previous(){
            return elementData[--nextIndex];
        }
        public Object next(){
            return elementData[nextIndex++];
        }
        public void add(Object o){
            ArrayList.this.add(nextIndex++,o);
        }
        public void remove(){
            ArrayList.this.remove(--nextIndex);
        }
    }

}

