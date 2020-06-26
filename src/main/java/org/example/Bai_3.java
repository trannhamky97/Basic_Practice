package org.example;
import java.util.Scanner;

public class Bai_3 {
    //Bai 3: Viết 1 chương trình in ra giá trị mà người dùng nhập vào từ ngoài màn hình console.
    //giá trị được nhập vào có thể là số hoặc chuỗi tùy ý
    static Scanner sc = new Scanner(System.in);
    public static void inGiaTri(){
        System.out.print("Nhap gia tri: ");
        String giaTri = sc.nextLine();
        System.out.println(giaTri);

        //Chuyen cho bien gia tri chuoi tren thanh so nguyen
        int so = Integer.parseInt(giaTri);
        System.out.println(so);
    }

    public static void main(String[] args) {
        inGiaTri();
    }
}
