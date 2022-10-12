package Test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
            socket = new Socket("localhost", 9999); // 클라이언트소켓 생성. 서버에 연결
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 새로운 객체 in과 out 생성
            out = new BufferedWriter(new OutputStreamWriter(socket .getOutputStream())) ;

            while (true) {
                System.out.print("Send >> "); // 프롬프트
                String outputMessage = scanner.nextLine(); // 키보드에서 한 행 읽기
                if (outputMessage.equalsIgnoreCase("bye")) {
                    out.write(outputMessage+"\n"); // "bye" 문자열 전송
                    out.flush();
                    break; // 사용자가 "bye’를 입력한 경우 서버로 전송 후 실행 종료
                }
                out.write(outputMessage+"\n" ); // 키보드에서 읽은 문자열 전송
                out.flush(); // out의 스트림 버퍼에 있는 모든 문자열 전송
                String inputMessage = in.readLine(); // 서버로부터 한 행 수신
                System.out.println("Server : " + inputMessage); // 서버로부터 받은 메시지를화면에 출력
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                scanner.close();
                if (socket != null) socket.close(); // 클라이언트 소켓 닫기
            } catch (IOException e) {
                System.out.println("Error while chatting with Server");
            }
        }
    }
}