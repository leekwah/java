package chapter11;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        ServerSocket listener = null;
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
        listener = new ServerSocket(9999);
        System.out.println("Waiting for the connection.");
        socket = listener.accept();
        System.out.println("connented.");
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (true) {
            // 한 행씩 받아야한다. 그렇기에 쓰는 메소드 이다.
            String inputMessage = in.readLine();
            if (inputMessage.equals("bye")) {
                System.out.println("client said 'bye', so connetion is disconnected.");
                break; // break문 사용
            }
            System.out.println("client : " + inputMessage);
            System.out.print("Send >> ");
            String outputMessage = scanner.nextLine(); // 키보드에서 한 행 읽기
            out.write(outputMessage + "\n"); // 키보드에서 읽은 문자열 전송
            out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    } finally {
        try {
            scanner.close();
            socket.close();
            listener.close();
        } catch (IOException e) {
            System.out.println("Error while chatting with client");
        }
    }
    }
}
