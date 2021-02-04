package programers.java.hash;

import java.util.Arrays;

public class Hash {
    public static void main(String[] args) {
        String[] participant =  {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"mislav", "stanko", "ana"};
        String answer = "ㅁㅁ";

        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                System.out.println(answer);
                return;
            }
        }
        answer += participant[participant.length-1];
        System.out.println(answer);


    }

}
