package dataStructure.java;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    ArrayList<Integer> numbers = new ArrayList<>();

    @Test
    public void defaultTest() {

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        //다 옆으로 한칸씩 옮겨서 1번 인덱스에 삽입
        numbers.add(1, 50);
        //2번 인덱스속한 엘리먼트를 삭제후 빈자리로 모든 엘리먼트가 한칸씩 채움
        numbers.remove(2);
        //내부적으로 배열을 사용하기 때문에 인덱스만 찾아서 빠르게 찾을수 있음
         System.out.println("get 함수 사용:"+numbers.get(2));
    }
    @Test
    public void iteratorTest(){
        defaultTest();
        Iterator<Integer> newNumbers = numbers.iterator();

        while(newNumbers.hasNext()){
            System.out.println(newNumbers.next());
            int value = newNumbers.next();
            if(value == 30){
                newNumbers.remove();
            }
        }

        for (int value:numbers){
            System.out.println("iterator 삭제후 어떻게 됬남"+value);
        }
    }

}
