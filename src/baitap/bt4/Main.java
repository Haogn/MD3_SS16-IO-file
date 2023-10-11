package baitap.bt4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/baitap/bt4/text.txt") ;
        // viet file
        if (file.createNewFile()) {
            System.out.println("Them file thanh cong");
            FileWriter fileWriter = new FileWriter(file) ;
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) ;
            bufferedWriter.write("viết chương trình đọc nội dung từ file text và sắp xếp các từ trong file theo thứ tự bảng chữ cái");
            bufferedWriter.close();
        }

        // doc file
        FileReader fileReader = new FileReader(file) ;
        BufferedReader bufferedReader = new BufferedReader(fileReader) ;
        String line = "" ;
        while (true) {
            line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            String[] arr = line.split(" ");
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
