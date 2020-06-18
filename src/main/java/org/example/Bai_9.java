package org.example;
import java.util.Scanner;

public class Bai_9 {
    //Bai 9:Viết một chương trình tìm ước chung lớn nhất của 2 số,
    // biết rằng 2 số này được người dùng nhập vào từ màn hình console.
    static Scanner sc = new Scanner(System.in);
    public static int UCLN(int a, int b){
        int a2 = a;
        int b2 = b;
        while(a2 != b2){
            if(a2>b2){
                a2 -= b2;
            } else {
                b2 -= a2;
            }
        }
        int ucln=a2;
        return ucln;
    }
    public static int UCLN_2(int a, int b){
        if(b==0){
            return a;
        }
        return UCLN_2(b,a%b);
    }
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a:");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen duong b:");
        int b = sc.nextInt();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la "+UCLN_2(a,b));
    }
}
