package org.example;

public class Bai_1 {
    //Bai 1:  Viết 1 chương trình xuất ra màn hình console hình như bên dưới
    public static  void tamGiac() {
        for (int i=0; i<7; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        tamGiac();
    }
}
