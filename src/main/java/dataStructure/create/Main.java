package dataStructure.create;


public class Main {
    public static void main(String[] args) {
//        arrayTest();
        setLinkedList();
    }

    public static void setLinkedList() {
        LinkedListTest linkNumbers = new LinkedListTest();
        linkNumbers.addLast(30);
        linkNumbers.addFirst(10);
        linkNumbers.addFirst(20);
        linkNumbers.remove(2);


        System.out.println(linkNumbers.indexOf(40));
    }


    private static void arrayTest() {
        ArrayList numbers = new ArrayList();

        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        numbers.add(1, 15);
        numbers.addFirst(5);
        numbers.addFirst(10);
        numbers.addLast(10);
        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers.get(0));
        System.out.println("사이즈:" + numbers.size());
        System.out.println("인덱스:" + numbers.indexOf(15));

        ArrayList.ListIterator li = numbers.listIterator();

        while (li.hasNext()) {
            System.out.println("Iterator사용++" + li.next());
        }

        while (li.hasPrevious()) {
            //이터럴 내부의 nextIndex가 올라가있는 상태여야만 실행이 된다.
            System.out.println("Iterator사용--" + li.previous());
        }

        while (li.hasNext()) {
            Integer number = (Integer) li.next();
            if (number == 30) {
//                li.add(500);
                li.remove();
            }
            System.out.println("넘버:" + number);
        }
        System.out.println("넘버:" + numbers);
    }
}

