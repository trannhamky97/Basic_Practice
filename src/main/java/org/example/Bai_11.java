package org.example;
import java.util.Scanner;

public class Bai_11 {
    //Bai 11: Viết 1 chương trình tính giá trị của giai thừa của 1 số do người dùng nhập vào,
    // ví dụ như người dùng nhập vào 3 thì 3! = 6
    static Scanner sc = new Scanner(System.in);
    public static int tinhGiaiThua(int n){
        int gt = 1;
        for(int i = 1 ; i <= n;i++){
            gt *= i;
        }
        return gt;
    }
    public static int tinhGiaiThua_DeQuy(int n){
        if (n==1)
            return 1;
        return n * tinhGiaiThua_DeQuy(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("So n phai duong. Nhap lai so n: ");
            n = sc.nextInt();
        }
        //System.out.println(n+"! = "+tinhGiaiThua(n));
        System.out.println(n+"! = "+tinhGiaiThua_DeQuy(n));
    }
}
