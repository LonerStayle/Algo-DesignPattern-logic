package dataStructure.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTest {
    //인덱스 조회가 빠르지만 추가 삭제가 느리다.
    ArrayList numbers = new ArrayList();
    //추가 삭제가 빠르지만 조회가 느리다.
    LinkedList linkedNumbers = new LinkedList();

    @Test
    public void test() {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.remove(3);
        System.out.println(numbers);

        linkedNumbers.add(10);
        linkedNumbers.add(20);
        linkedNumbers.add(30);
        linkedNumbers.add(40);
        linkedNumbers.add(50);
        linkedNumbers.remove(3);
        System.out.println(linkedNumbers);
    }

}
