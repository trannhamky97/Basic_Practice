package org.example;
import java.util.Scanner;

public class Bai_5 {
    //Bai 5: Viết 1 chương trình để giải phương trình bậc 2 ax^2+ bx + c = 0
    // biết rằng a và b và c do người dùng nhập tùy ý từ màn hình console.
    static Scanner sc = new Scanner(System.in);
    public static void ptBac2(){
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();
        System.out.print("Nhap c: ");
        int c = sc.nextInt();
        System.out.println("Giai phuong trinh: "+a +"x^2 + "+b +"x + " +c +" = 0");

        if (a == 0){
            if( b== 0){
                if (c == 0){
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                float nghiem = (float)-c/b;
                System.out.println("Phuong trinh co nghiem duy nhat x = -c/b = "+nghiem);
            }
        } else {
            /* delta = b^2 - 4ac
            delta < 0: pt vo nghiem
            delta = 0: pt co nghiem kep x1 = x2 = -b/2a
            delta > 0: pt co 2 nghiem x1 = -b - can(delta) / 2a, x2 = -b + can(delta) / 2a
            */
            float delta = (float) (Math.pow(b,2) -4 *a *c);
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0){
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = -b/2a = "+(-b/(2*a)));
            } else {
                float x1 = (float) ((-b -Math.sqrt(delta))/(2*a));
                float x2 = (float) ((-b +Math.sqrt(delta))/(2*a));
                System.out.println("Phuong trinh co nghiem x1 = "+x1);
                System.out.println("Phuong trinh co nghiem x2 = "+x2);
            }
        }
    }

    public static void main(String[] args) {
        ptBac2();
    }
}
