package test;

import java.util.*;

public class JavaTest {
    public static void main(String[] args) {
        String[] arr = {"119", "97674223", "1195524421"};
        System.out.println(solution(arr));
    }

    public static Boolean solution(String[] phone_book) {

        Map<String,String> map= new HashMap<>();
        for(String phone:phone_book){
            map.put(phone,phone);
        }

        for (String phone:phone_book){
            for(int i =0; i< phone.length();i++){
                if(map.containsKey(phone.substring(0,i)))
                return false;
            }
        }

        return true;
    }



}



