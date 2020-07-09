package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Tạo mảng
//        System.out.print("Nhap so luong hoc vien: ");
//        int soLuongHocVien = sc.nextInt();
//        while (soLuongHocVien < 1){
//            System.out.print("Moi nhap lai so luong hoc vien (so luong > 1): ");
//            soLuongHocVien = sc.nextInt();
//        }
//        ArrayList<HocVien> arrListHocVien = new ArrayList<HocVien>();
//        for(int i = 0; i<soLuongHocVien; i++){
//            System.out.println("Nhap thong tin hoc vien thu "+(i+1));
//            HocVien hv = new HocVien();
//            hv.nhapThongTinHocVien();
//            arrListHocVien.add(hv);
//        }
//
//        for (HocVien hv: arrListHocVien
//             ) {
//            System.out.println(hv.tenHocVien);
//        }
        //nhập học viên tự động
        System.out.println("Bạn có muốn nhập học viên không?");
        System.out.println("1. Có");
        System.out.println("2. Không");

        ArrayList<HocVien> arrListHocVien = new ArrayList<HocVien>();
        int gt = sc.nextInt();
        while (gt == 1) {
            HocVien hv = new HocVien();
            hv.nhapThongTinHocVien();
            arrListHocVien.add(hv);

            System.out.println("Bạn có muốn tiếp tục nhập học viên không?");
            System.out.println("1. Có");
            System.out.println("2. Không");
            gt = sc.nextInt();
        }


        //Xóa hoc viên
//        System.out.println("Nhap ma hoc vien can xoa: ");
//        String maHocVienCanXoa = sc.next();
//        for (int i = 0; i < arrListHocVien.size(); i++) {
//            if (arrListHocVien.get(i).maHocVien.equals(maHocVienCanXoa)) {
//                arrListHocVien.remove(i);
//            }
//        }

        for (HocVien hv : arrListHocVien
        ) {
            hv.hienThiThongTin();
        }
    }
}
