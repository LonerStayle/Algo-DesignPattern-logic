package garbege;

import java.io.*;


public class BufferedOutputStreamBasicExample {

    public static void main(String[] args) {
        try {
            FileInputStream f_stream = new FileInputStream("test");
            byte receive[] = new byte[32];
            BufferedInputStream stream = new BufferedInputStream(f_stream, 1024);
            stream.read(receive);

            for (int i = 0; i < receive.length; ++i) {
                System.out.println(receive[i]);
            }
            f_stream.close();
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
