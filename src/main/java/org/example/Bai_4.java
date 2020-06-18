package org.example;
import java.util.Scanner;

public class Bai_4 {
    //Bai 4: Viết 1 chương trình để giải phương trình bậc 1 ax+ b = 0
    //biết rằng a và b do người dùng nhập tùy ý từ màn hình console.
    static Scanner sc = new Scanner(System.in);
    public static void ptBac1(){
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.println("Giai phuong trinh: "+a +"x + "+b +" = 0");
        /* Nếu a = 0 và b = 0: phương trình có vô số nghiệm.
        Nếu a = 0 và b <> 0: phương trình vô nghiệm.
        Nếu a <> 0: phương trình có nghiệm duy nhất x = -b/a. */
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            float nghiem = (float)-b/a;
            System.out.println("Phuong trinh co nghiem duy nhat x = "+nghiem);
        }
    }

    public static void main(String[] args) {
        ptBac1();
    }
}
