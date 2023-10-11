package baitap.bt3;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Viết chương trình đọc nội dung từ file text và hiển thị các từ trùng lặp trong file đó.
        File file = new File("src/baitap/bt3/text");
        try {
            // ghi file
            if ( file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("vl vcl vkl dkm vl cc dm vl ");
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
                String[] arr = line.split(" ") ;
                Set<String> dulicateArr = new HashSet<>();
                Set<String> seenArr = new HashSet<>();
                int count= 1 ;
                for (String str : arr) {
                    if (!seenArr.add(str)) {
                        dulicateArr.add(str);
                        count++ ;
                    }
                }

                System.out.println("tu trung lap trong file ");
                for (String dulicate : dulicateArr) {
                    System.out.println(dulicate + " xuat hien " + count + " lan");
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
