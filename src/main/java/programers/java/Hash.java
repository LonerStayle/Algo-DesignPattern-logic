package programers.java;

import java.util.Arrays;

public class Hash {
    public static void main(String[] args) {

    }

    private static void phoneNumber() {
        String[] phoneBook = {"123", "5555", "7766", "12359"};
        boolean answer = true;
        for (int i = 0; i < phoneBook.length - 1; i++) {
            for (int j = i + 1; j < phoneBook.length; j++) {
                if (phoneBook[i].startsWith(phoneBook[j])) {
                    answer = false;
                }
                if (phoneBook[j].startsWith(phoneBook[i])) {
                    answer = false;
                }
            }
        }
        System.out.println(answer);
    }

    private static boolean realPhoneNumber() {
        String[] phone_book = {"123", "5555", "7766", "12359"};
        for (int i = 0; i < phone_book.length - 1; i++) {
            int hashPhone = phone_book[i].hashCode();
            int len = phone_book[i].length();

            for (int j = i + 1; j < phone_book.length; j++) {

                if (phone_book[j].length() >= len
                        && hashPhone == (phone_book[j].substring(0, len).hashCode())) {
                    return false;

                } else if (phone_book[j].length() < len
                        && phone_book[i].substring(0, phone_book[j].length())
                        .hashCode() == phone_book[j].hashCode()) {
                    return false;
                }

            }
        }

        return true;
    }

    //완주하지 못한 선수
    private static void first() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"mislav", "stanko", "ana"};
        String answer = "ㅁㅁ";

        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                System.out.println(answer);
                return;
            }
        }
        answer += participant[participant.length - 1];
        System.out.println(answer);
    }


}
