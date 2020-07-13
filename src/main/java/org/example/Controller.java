package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<HocVien> dsHocVien = new ArrayList<HocVien>();

    void hienThiMenu() {
        System.out.println("----Quan ly hoc vien----\n" +
                "1. Them mot hoc vien vao trong danh sach\n" +
                "2. Xoa mot hoc vien ra khoi danh sach\n" +
                "3. Cap nhat thong tin mot hoc vien trong danh sach\n" +
                "4. Hien thi danh sach hoc vien\n" +
                "5. Thoat");
    }

    private void themHocVien() {
        //nhập học viên
        System.out.println("Vui long nhap thong tin hoc vien sau: ");
        while (true) {
            HocVien hv = new HocVien();
            hv.nhapThongTinHocVien();
            dsHocVien.add(hv);

            System.out.println("Bạn có muốn tiếp tục nhập học viên không?\n" +
                    "1. Có\n" +
                    "2. Không");
            String continueFlag = sc.nextLine();
            if (continueFlag.equals("1")) {
                continue;
            } else if (continueFlag.equals("2")) {
                break;
            }
        }
    }

    private void xoaHocVien() {
        while (true) {
            System.out.print("Nhap ma hoc vien can xoa: ");
            String maHocVienCanXoa = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < dsHocVien.size(); i++) {
                if (dsHocVien.get(i).getMaHocVien().equals(maHocVienCanXoa)) {
                    dsHocVien.remove(i);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Ma hoc vien khong ton tai ...");
                continue;
            } else {
                break;
            }

        }
    }

    private void capNhatThongTinHocVien() {
        while (true) {
            System.out.print("Nhap ma hoc vien can cap nhat: ");
            boolean flag = false;
            String maHocVienCanCapNhat = sc.nextLine();
            for (int i = 0; i < dsHocVien.size(); i++) {
                if (dsHocVien.get(i).getMaHocVien().equals(maHocVienCanCapNhat)) {
                    System.out.print("Nhap ten moi: ");
                    String tenMoi = sc.nextLine();
                    dsHocVien.get(i).setTenHocVien(tenMoi);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Ma hoc vien khong ton tai ...");
                continue;
            } else {
                break;
            }
        }
    }

    private void hienThiDanhSach() {
        System.out.println("-- Danh sach hoc vien --");
        for (HocVien hv : dsHocVien
        ) {
            //System.out.println(hv.getMaHocVien()+"---"+hv.getTenHocVien()+"---"+hv.getDiem());
            hv.hienThiThongTin();
        }
    }

    public static void main(String[] args) {
        while (true) {
            Controller a = new Controller();
            a.hienThiMenu();
            String input = sc.nextLine();
            if (input.equals("1")) {
                a.themHocVien();
            } else if (input.equals("2")) {
                a.xoaHocVien();
            } else if (input.equals("3")) {
                a.capNhatThongTinHocVien();
            } else if (input.equals("4")) {
                a.hienThiDanhSach();
            } else if (input.equals("5")) {
                System.exit(1);
            } else {
                System.out.println("Khong hop le. Moi ban nhap lai...");
            }
        }

    }
}
