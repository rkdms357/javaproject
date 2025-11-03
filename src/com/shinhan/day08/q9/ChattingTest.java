package com.shinhan.day08.q9;

class Chatting {
    //내부클래스
    class Chat {
        void start() {
        }

        void sendMessage(String message) {
            System.out.println(message);
        }
    }

    void startChat(String chatId) {
        String nickName = chatId;
        //nickName = chatId; -> nickName 변경하면 안됨

        //함수내에서
        //익명구현클래스 -> 로컬클래스
        //지역변수를 사용하면 무조건 final Modifier가 붙음
        Chat chat = new Chat() {
            @Override
            public void start() {
                if (true) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "] " + inputData;
                    sendMessage(message);
                }
            }
        };
        chat.start();
    }
}

public class ChattingTest {
    public static void main(String[] args) {
        Chatting aa = new Chatting();
        aa.startChat("green");
    }
}