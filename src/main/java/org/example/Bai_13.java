package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai_13 {
    //Bai 13: Viết chương trình đọc file txt từ hoc_vien1.txt, lấy những thông tin của học viên in ra ngoài màn hình.
    //Biết răng thông tin cần lấy ra chỉ bao gồm phần nội dung, ko bao gồm phần tiêu đề.


    public static void main(String[] args) {
        try {
            File x = new File("D:\\javaCore\\bt\\hoc_vien1.txt");
            Scanner sc = new Scanner(x);
            String content ="";
            String arr [] = new String[0];
            while(sc.hasNextLine()){
                content += sc.nextLine() +"\r\n"; // cho tất cả giá trị nằm trong content
                arr = content.split("\r\n"); // cắt content thành các phần nhỏ theo "Enter"
            }
            //System.out.println(content);
            for(int i = 0 ; i < arr.length;i++){
                String mangNoiDung [] = arr[i].split(":"); //Cắt từng phần nhỏ trên theo ":"
                System.out.println(mangNoiDung[1]); // rồi chỉ lấy nội dung sau dấu ":"
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Error");
        }
    }


    
}
