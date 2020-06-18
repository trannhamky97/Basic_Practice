package org.example;
import java.util.Scanner;

public class Bai_2 {
    //Bai 2: Viết 1 chương trình có chứa 1 function cộng 2 số, biết rằng khi người dùng truyền vào 2 số
    //thì chương trình sẽ trả về 1 kết quả số nguyên là tổng của 2 số nguyên đó.
    static Scanner sc = new Scanner(System.in);
    //C1
    public static int sum(int a, int b){
        return a + b;
    }
    //C2
    public static void congHaiSo(){
        System.out.print("Nhap vao so thu 1: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap vao so thu 2: ");
        int so2 = sc.nextInt();

        int tong = so1 + so2;
        System.out.println("Tong : "+so1+" + "+so2+" = " +tong);
    }

    public static void main(String[] args) {
        //System.out.println(sum(2,3));
        congHaiSo();
    }
}
