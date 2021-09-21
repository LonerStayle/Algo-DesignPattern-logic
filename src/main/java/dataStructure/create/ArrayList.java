package dataStructure.create;


public class ArrayList {

    private int size = 0;
    private Object[] elementData = new Object[100];

    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(String.valueOf(elementData[i]));
            if (i < size - 1) {
                str.append(",");
            }
        }
        return str.append("]").toString();
    }


    public boolean add(int index, Object element) {
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
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

    public boolean remove(int index) {
        Object removed = elementData[index];
        for (int i = index; i <= size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        elementData[size] = null;
        return true;
    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(size - 1);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return nextIndex < size();
        }

        public Object next() {
            return elementData[nextIndex++];
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public Object previous() {
            return elementData[--nextIndex];
        }

        // 현재 엘리먼트를 추가합니다.
        public void add(Object element) {
            ArrayList.this.add(nextIndex++, element);
        }

        // 현재 엘리먼트를 삭제합니다.
        public void remove() {
            ArrayList.this.remove(nextIndex - 1);
            nextIndex--;
        }
    }


}

