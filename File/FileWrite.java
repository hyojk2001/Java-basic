// import java.io.FileOutputStream;         //파일 생성
// import java.io.FileWriter;              //예외 처리
// import java.io.IOException;
// import java.io.PrintWriter;
import java.io.*;

public class FileWrite{
    public static void main(String[] args) throws IOException {
        // FileOutputStream output = new FileOutputStream("out.txt");
        // FileWriter fw = new FileWriter("out.txt");
        // PrintWriter pw = new PrintWriter("out.txt");
        // for(int i=1; i<21; i++){
        //     String data = i + " 번째 줄입니다.";
        //     pw.println(data);
        // }
        // pw.close();
        
        // PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt",true));
        // for(int i=11; i<21; i++){
        //     String data = i + " 번째 줄입니다.";
        //     pw2.println(data);
        // }
        // pw2.close();

        PrintWriter pw = new PrintWriter("odd.txt");
        for(int i=1; i<101; i++){
            if(i % 2 != 0){
                String data = i + "";
            pw.println(data);
            }
        }
        pw.close();
    }
}