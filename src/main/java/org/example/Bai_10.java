package org.example;
import java.util.Scanner;

public class Bai_10 {
    //Viết chương trình có chứa 1 function tính toán, trong function này người dùng được phép truyền vào 3 tham số,
    // tham số thứ nhất là số nguyên, tham số thứ 2 là số nguyên,tham số thứ 3 là 1 ký tự
    // thể hiện phép tính cộng, trừ, nhân hoặc chia, kết quả trả về nên là kết quả của tham số thứ nhất phép tính với tham số thứ 2
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so nguyen thu 1: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen thu 2: ");
        int b = sc.nextInt();
        System.out.print("Nhap phep toan (+,-,*,/): ");
        char pt = sc.next().charAt(0);

        switch (pt){
            case '+':
                System.out.println(a +" + "+b+" = "+(a+b));
                break;
            case '-':
                System.out.println(a +" - "+b+" = "+(a-b));
                break;
            case '*':
                System.out.println(a +" * "+b+" = "+(a*b));
                break;
            case '/':
                if(b==0){
                    System.out.println("So bi chia phai khac 0");
                } else {
                    System.out.println(a +" / "+b+" = "+((float)a/b));
                }
                break;
            default:
                System.out.println("Nhap phep tinh khong hop le. ");
        }
    }
}
