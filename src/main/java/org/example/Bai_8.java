package org.example;
import java.util.Scanner;

public class Bai_8 {
    //Bai 8:Viết chương trình tìm bộ chung nhỏ nhất của 2 số,
    // 2 số này được nhập vào từ màn hình console.
    //UCLN của 2 số nguyên dương a và b là một số k lớn nhất, sao cho a và b đều chia hết cho k.
    //BCNN của 2 số nguyên dương a và b là một số h nhỏ nhất, sao cho h chia hết cho cả a và b.
    //BCNN(a, b) = (a * b) / UCLN(a, b).

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
    public static int BCNN(int a,int b){
        return (a*b)/UCLN(a,b);
    }
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a:");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen duong b:");
        int b = sc.nextInt();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la "+UCLN(a,b));
        System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la "+BCNN(a,b));
    }
}
