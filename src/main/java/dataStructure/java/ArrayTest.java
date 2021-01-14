package dataStructure.java;

import org.junit.Test;

import java.lang.reflect.Array;

public class ArrayTest {
    int[] numbers1 = new int[4];
    String[] stringArray = new String[4];

    int[] numbers2 = {10, 20, 30, 40};
    int[] numbers3 = new int[]{10, 20, 30, 40};

    @Test
    public void defaultUse() {
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;
        System.out.println(numbers1[3]);
        //결과: 0
        System.out.println(numbers1.length);
        //결과: 배열은 크기를 size가아니라 length로 계산

        stringArray[0] = "hi";
        stringArray[1] = "hi";
        stringArray[2] = "hi";
        System.out.println(stringArray[3]);
        //결과: null
    }
    @Test
    public void recycler(){
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;

        int i=0;
        while(numbers1.length > i){
            System.out.println(numbers1[i]);
            i++;
        }

        for(i=0; numbers1.length>i; i++){
            System.out.println(numbers1[i]);
        }
    }



}
