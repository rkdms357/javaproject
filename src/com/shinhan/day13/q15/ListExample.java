package com.shinhan.day13.q15;

import java.util.*;

class Board {
    private String title;
    private String content;

    public Board(String title, String content) {
        super();
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(title).append("-").append(content);
        return builder.toString();
    }
}

class BoardDAO {
    List<Board> getBoardList() {
        List<Board> data = new ArrayList<Board>();
        data.add(new Board("제목1", "내용1"));
        data.add(new Board("제목2", "내용2"));
        data.add(new Board("제목3", "내용3"));
        return data;
    }
}

class BoardService {
    BoardDAO dao = new BoardDAO();

    List<Board> selectAll() {
        return dao.getBoardList();
    }
}

class BoardView {
    static void print(List<Board> data) {
        for (Board b : data) {
            System.out.println(b);
        }
    }
}

//사용자가 요청을 보내면 서비스에 요청을 줌
//응답을 받는다, 받은 응답은 View에 보냄
class BoardController {
    BoardService service = new BoardService();

    void dataList() {
        BoardView.print(service.selectAll());
    }
}

public class ListExample {
    public static void main(String[] args) {
        f8();
    }

    private static void f8() {
        new BoardController().dataList();
    }
}