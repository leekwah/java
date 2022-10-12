package Test;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcServerEx {
    public static String calc(String exp) {
        StringTokenizer st = new StringTokenizer(exp, " ");
        if (st.countTokens() !=3) return "error";

        String res="";
        int x = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int y = Integer.parseInt(st.nextToken());
        switch (op) {
            case "+" : res = Integer.toString(x + y);
                break;
            case "-" : res = Integer.toString(x - y);
                break;
            case "*" : res = Integer.toString(x * y);
                break;
            case "/" : res = Integer.toString(x / y);
                break;
            default : res = "잘못된 연산자입니다.";
        }
        return res;
    }

    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        ServerSocket listener = null;
        Socket socket = null;

        try {
            listener = new ServerSocket(9999);
            System.out.println("Waiting for the connection."); // 이후에 출력되는 문구
            socket = listener.accept();
            System.out.println("connected");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // getInputStream과 getOutputStream의 예외처리가 필요하다.
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            while (true) {
                String inputMessage = in.readLine();
                if (inputMessage.equalsIgnoreCase("bye")) {
                    System.out.println("client said 'bye', so connetion is disconnected."); // "bye" 입력시 출력하는 문구
                    break;
                }
                System.out.println(inputMessage);
                String res = calc(inputMessage); // 계산결과는 res로 대입연산자로 대입
                out.write(res + "\n"); // 문자열 전송
                out.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (socket != null) socket.close();
                if (listener != null) listener.close();
            } catch (IOException e) {
                System.out.println("Error Occurred with Client"); // 출력되는 메시지
            }
        }
    }
}