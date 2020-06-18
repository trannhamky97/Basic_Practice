package org.example;
import java.util.Scanner;

public class Bai_6 {
    //Bai 6: Viết 1 chương trình cho người dùng nhập vào 1 số nguyên và
    // kiểm tra số đó có phải là số nguyên tố hay không?
    static Scanner sc = new Scanner(System.in);
    public static boolean ktSNT(int so) {
        if (so < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(so); i++) {
                if (so % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void laSNT(){
        System.out.print("Nhap so nguyen: ");
        int so = sc.nextInt();
        if (ktSNT(so)){
            System.out.println("So "+so + " la so nguyen to.");
        } else {
            System.out.println("So "+so + " khong la so nguyen to.");
        }
    }

    public static void main(String[] args) {
        laSNT();
    }
}
