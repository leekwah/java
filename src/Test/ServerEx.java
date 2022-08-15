package Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
    public static void main(String[] args) {
        BufferedReader in = null; // BufferedReader의 in의 값을 null로 설정
        BufferedWriter out = null; // BufferedWriter의 out의 값을 null로 설정
        ServerSocket listener = null; // ServerSocket의 listener의 값을 null로 설정
        Socket socket = null; // Socket의 socket의 값을 null로 설정
        Scanner scanner = new Scanner(System.in); // scanner 객체 추가

        try { // try-catch문으로 예외 처리
            listener = new ServerSocket(9999); // 클라이언트 소켓 생성 후 서버의 9999번 포트에 연결
            System.out.println("Waiting for the connection."); // 이후에 출력되는 문구
            socket = listener.accept(); //  클라이언트로부터 연결 요청 대기
            System.out.println("connented."); // 클라이언트가 소켓에 연결이 되면, 출력되는 문구
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 소켓입력스트림
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 소켓출력스트림
            while (true) {
                String inputMessage = in.readLine(); // 한 행씩 받아야한다. 그렇기에 쓰는 메소드 이다.
                if (inputMessage.equals("bye")) { // .equalas()를 통해서, "bye"를 입력하면, 반복문을 빠져나오게된다.
                    System.out.println("client said 'bye', so connetion is disconnected."); // "bye" 입력시 출력하는 문구
                    break; // "bye"입력 시에, 위 println출력 후, break문
                }
                System.out.println("client : " + inputMessage); // inputMessage가 보여진다.
                System.out.print("Send >> ");
                String outputMessage = scanner.nextLine(); // scanner를 통해서 outputMessage 입력
                out.write(outputMessage + "\n"); // scanner에 입력한 문자열 전송
                out.flush(); // out의 StreamBuffer에 있는 모든 문자열 전송
            }
        } catch (IOException e) { // 예외처리
            System.out.println(e.getMessage());
        } finally { // 예외발생여부와 관계없이 수행되어야 하는 코드
            try { // try-catch문
                scanner.close(); // scanner 닫기
                socket.close(); // 통신용 소켓 닫기
                listener.close(); // 서버 소켓 닫기
            } catch (IOException e) { // 만약에 IOExceipton이 발생할 경우
                System.out.println("Error while chatting with client"); // 출력되는 메시지
            }
        }
    }
}
