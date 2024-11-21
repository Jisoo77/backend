package a1121;

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);
    int width = 0;
    int height = 0;

    public int getArea(){
        int rec = width * height;
        return rec;
    }
}
