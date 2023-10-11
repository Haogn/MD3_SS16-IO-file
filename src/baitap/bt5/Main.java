package baitap.bt5;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        try {
            File file = new File("src/baitap/bt5/text.txt") ;
            // ghi file
            if ( file.createNewFile()) {
                System.out.println("Da them moi File thanh cong");
                FileWriter fileWriter = new FileWriter(file) ;
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) ;
                bufferedWriter.write("Viết chương trình đọc nội dung từ file text và tìm và hiển thị các từ có độ dài lớn nhất trong file");
                bufferedWriter.close();
            }

            // doc file
            List<String> list = new ArrayList<>();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader) ;
            String line = "" ;
            while (true) {
                line = bufferedReader.readLine() ;
                if ( line == null) {
                    break;
                }
                String[] arr = line.split(" ") ;
                String max = arr[0] ;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].length() > max.length()){
                        max = arr[i] ; 
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                    if ( arr[i].length() == max.length()){
                        if (!list.contains(arr[i])) {
                            list.add(arr[i]) ;
                        }
                    }
                }
                System.out.println(" Tu co do dai lon nhat la " + list);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
