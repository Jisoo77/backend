package a1202.file;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input4 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);
        System.out.println(a);
    }
}
