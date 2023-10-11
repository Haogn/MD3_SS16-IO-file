package baitap.bt2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/baitap/bt2/text.txt");
        if (file.createNewFile()) {
            // ghi file
            System.out.println("Them moi File thanh cong");
            FileWriter fileWriter = new FileWriter(file) ;
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "Viết chương trình đọc nội dung từ file text và đếm số dòng trong file đó";
            bufferedWriter.write(line);
            String[] arr = line.split(" ") ;
            int count = 0 ;

            for (String str : arr) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                count++ ;
            }
            bufferedWriter.close();

            System.out.println("Doan van ban co " + count + " dong");
        }
    }
}
