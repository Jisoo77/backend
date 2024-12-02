package a1202.filewrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite4_1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("c:/abc/out3.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.\r\n";
            pw.println(data); // println 메서드 사용가능
        }
        pw.close();
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/abc/out3.txt",true));
        for(int i=21; i<31 ; i++){
            String data = i + " 번째 줄입니다.\r\n";
            pw2.println(data); // println 메서드 사용가능
        }
        pw2.close();
    }
}
// File Writer를 이용하여 byte 배열 대신 문자열 사용