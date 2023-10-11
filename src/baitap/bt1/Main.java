package baitap.bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        // tao 1 file moi
        File file = new File("src/baitap/bt1/text.txt");
        // ghi file
        if (file.createNewFile()) {
            System.out.println("Da tao file thanh cong ");
            FileWriter fileWriter = new FileWriter(file) ;
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó");
            bufferedWriter.close();
        }
        // doc file
        FileReader fileReader = new FileReader(file) ;
        BufferedReader bufferedReader = new BufferedReader(fileReader) ;
        String line = "" ;

        while (true) {
            line = bufferedReader.readLine();
            if (line==null) {
                break;
            }
            String arr[] = line.split(" ") ;

            System.out.println(line);
            System.out.println("So tu trong file = " + arr.length);
        }

    }
}
