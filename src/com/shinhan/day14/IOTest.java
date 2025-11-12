package com.shinhan.day14;

import java.io.*;
import java.util.Arrays;

import com.shinhan.day14.q16.Student;

public class IOTest {
    public static void main(String[] args) throws Exception {
        f8();
    }

    private static void f8() {
        String s = "score2.data";
        File f = new File(s);
        System.out.println("파일이 존재하는지: " + f.exists());
        System.out.println("파일크키: " + f.length());
        System.out.println("절대경로: " + f.getAbsolutePath());
    }

    private static void f7() throws IOException, ClassNotFoundException {
        //Object
        //->직렬화(메모리에 생성된 객체를 파일 또는 네트워크로 출력하기 위해 필드값을 일렬로 늘어선 바이트로 변경하는 것)
        //->내보내기
        String fname = "myobject.data";
        Student st1 = new Student("홍1", 100, 90);
        Student st2 = new Student("홍2", 80, 90);
        FileOutputStream fos = new FileOutputStream(fname);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(st1); //Object로 받음
        oos.writeObject(st2); //Object로 받음
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(fname);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s3 = (Student) ois.readObject();
        Student s4 = (Student) ois.readObject();

        System.out.println(s3);
        System.out.println(s4);
        ois.close();
        fis.close();
    }

    private static void f6() throws IOException {
        //자바의 기본형을 입출력
        FileOutputStream fos = new FileOutputStream("score2.data");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeBoolean(true);
        dos.writeInt(100);
        dos.writeDouble(3.14);
        dos.writeUTF("문자");

        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("score2.data");
        DataInputStream dis = new DataInputStream(fis);

        boolean b = dis.readBoolean();
        int i = dis.readInt();
        double d = dis.readDouble();
        String s = dis.readUTF();

        System.out.println(b ? "참" : "거짓");
        System.out.println(i + 200);
        System.out.println(d + 200);
        System.out.println(s.length());

        dis.close();
        fis.close();
    }

    private static void f5() throws IOException {
        //파일읽기 stream(1byte) reader(2byte)
        FileReader fr = new FileReader("score.txt");
        BufferedReader br = new BufferedReader(fr);

        String data = br.readLine();
        System.out.println(data.replace("/", "\t") + "\t총점");
        while ((data = br.readLine()) != null) {
            String[] arr = data.split("/"); //홍길동/90/99/88 => {"홍길동", "90", "99", "88"}
            System.out.print(arr[0]);
            int total = Arrays.stream(arr, 1, arr.length) //original stream
                    .peek(s -> System.out.print("\t" + s))

                    //.mapToInt(s->Integer.parseInt(s))
                    .mapToInt(Integer::parseInt)

                    .sum();
            System.out.println("\t" + total);
        }
        br.close();
        fr.close();
    }

    private static void f4() throws IOException {
        FileWriter fw = new FileWriter("aa2.txt"); //project아래가 현재경로
        fw.write("파일에 출력하기1\n");
        fw.write("파일에 출력하기2\n");
        fw.write("파일에 출력하기3\n");
        fw.close();
    }

    private static void f3() {
        //출력 : 모니터, 파일, 네트워크
        PrintStream ps = System.out;
        ps.println("--------------");
        ps.print("**************");
    }

    private static void f2() throws IOException {
        //파일 읽기
        FileInputStream fis = new FileInputStream("src/com/shinhan/day14/StreamTest2.java");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.println((char) data);
        }
        fis.close();
    }

    private static void f1() throws IOException {
        //InputStream --> 자바프로그램 --> OutStream

        //입력받을때 : 키보드(Enter(13)면 빠지기), 파일(EOF:-1), 네트워크프로그램
        InputStream is = System.in; //키보드로 입력받을때
        InputStreamReader ir = new InputStreamReader(is);
        //InputStreamReader : stream(1byte)->reader(2byte)
        int data;                   //데이터 읽음
        while ((data = ir.read()) != -1) {
            System.out.println((char) data);
        }
    }
}