package com.shinhan.day09.q11;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriterChild extends FileWriter {

    FileWriterChild() throws IOException {
        super("문자");
    }

    //Override할때 주의
    //부모의 메서드를 재정의(덮어쓰기, Override)
    //메서드이름 같고, 매개변수 타입과 개수가 같고, return타입 같고
    //접근지정자가 같거나 더 넓어야 함
    //throws 예외 : 같거나 더 작음
    //Exception > IOException > FileNotFoundException
    @Override
    public void write(String data) throws IOException {
        super.write("");
    }
}