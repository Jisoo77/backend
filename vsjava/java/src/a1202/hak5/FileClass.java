package a1202.hak5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

public class FileClass {
    private File file;
    private String dir;
    private String fileName;
    
    public FileClass(String dir, String fileName) {
        file = new File("c:\\" + dir + "\\" + fileName + ".txt");
        this.dir = "c:\\"+dir;
        this.fileName = fileName + ".txt";
        // 디렉토리 경로와 파일 이름을 받아 파일 객체 초기화
        // 디렉토리가 없는 경우 디렉토리도 생성
        // file = c:\\student\\student_Grade.txt
        // dir = c:\\student
        // fileName = student_Grade.txt
    }

    public FileClass(){
        file = new File("c:\\");
        // 기본생성자로, 기본디렉토리 c:\\ 로 설정
    }

    private boolean check(File file) {
        if(file.exists()){ // 파일이 존재하면
            return true;
        }
        return false;
    }

    public void create() throws Exception {
        boolean exist = check(file);
        if(exist){
            file.delete(); // 파일이 있으면 파일을 지우고
            file.createNewFile(); // 새로운 파일 생성
        }else{
            file = new File(dir); // c:\\dir
            file.mkdir(); // 디렉토리(폴더) 생성
            file = new File(dir+"\\"+fileName); // c:\\student\\student_Grade.txt
            file.createNewFile(); // 새로운 파일 생성
        }
    }

    public void write(String str) throws Exception {
        FileWriter fw = new FileWriter(file); // 파일 쓰기를 위한 FileWriter 생성(쓰기작업생성)
        PrintWriter pw = new PrintWriter(fw); // 파일에 데이터를 출력하기위해 편리한 메서드
        pw.println(str);
        fw.close();
    }

    public void read() throws Exception {
        boolean exist = check(file);
        if(exist){
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while ((str = bw.readLine()) != null) {
                System.out.println(str);
            }
            bw.close();
        }else{
            System.out.println("읽을 파일이 없습니다.");
        }
    }
}
