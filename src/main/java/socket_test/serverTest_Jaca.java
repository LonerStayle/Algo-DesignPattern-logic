package socket_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class TCPServer implements Runnable {

    public static final int ServerPort = 9999;
    public static final String ServerIP = "172.30.1.4";

    @Override
    public void run() {

        try {
            System.out.println("S: Connecting...");
            ServerSocket serverSocket = new ServerSocket(ServerPort);

            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("S: 데이터 받는중...");
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                    String str = in.readLine();
                    System.out.println("S: 반환했다.: '" + str + "'");

                    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())), true);
                    out.println("서버 반환값 " + str);
                } catch (Exception e) {
                    System.out.println("S: 에러");
                    e.printStackTrace();
                } finally {
                    client.close();
                    System.out.println("S: 완료.");
                }
            }
        } catch (Exception e) {
            System.out.println("S: 에러");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread desktopServerThread = new Thread(new TCPServer());
        desktopServerThread.start();
    }

}


