package org.example;

import java.util.Scanner;

public class HocVien {
    private String maHocVien;
    private String tenHocVien;
    private float diem;
    Integer soCMND;
    Integer soDT;
    String email;
    String ngayDangKy;
    Integer soTienDangKy;

    public String getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getTenHocVien() {
        return tenHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public HocVien() {
    }

    public HocVien(String maHocVien, String tenHocVien, Integer soCMND, Integer soDT, String email, String ngayDangKy, Integer soTienDangKy) {
        this.maHocVien = maHocVien;
        this.tenHocVien = tenHocVien;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
        this.ngayDangKy = ngayDangKy;
        this.soTienDangKy = soTienDangKy;
    }

    void nhapThongTinHocVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoc vien: ");
        maHocVien = sc.nextLine();
        System.out.print("Nhap ten hoc vien: ");
        tenHocVien = sc.nextLine();
        System.out.print("Nhap diem hoc vien: ");
        diem = sc.nextFloat();
        while (diem < 0.0f || diem > 10.0f) {
            System.out.print("Diem nhap khong hop le. Moi nhap lai diem hoc vien: ");
            diem = sc.nextFloat();
        }
        sc.nextLine();
//        System.out.print("Nhap so CMND: ");
//        soCMND = sc.nextInt();
//        System.out.print("Nhap sdt: ");
//        soDT = sc.nextInt();
//        System.out.print("Nhap email: ");
//        email = sc.nextLine();
//        System.out.print("Nhap ngay dang ki (dd/mm/yyyy): ");
//        ngayDangKy = sc.nextLine();
//        String[] date = ngayDangKy.split("/");
//        int day = Integer.parseInt(date[0]);
//        int month = Integer.parseInt(date[1]);
//        int year = Integer.parseInt(date[2]);
//        while (day<1 || day > 31 || month < 1 || month > 12 || year <1900 || year > 2020){
//            System.out.print("Nhap ngay dang ki (dd/mm/yyyy): ");
//            ngayDangKy = sc.nextLine();
//            date = ngayDangKy.split("/");
//            day = Integer.parseInt(date[0]);
//            month = Integer.parseInt(date[1]);
//            year = Integer.parseInt(date[2]);
//        }
//        System.out.print("Nhap so tien dang ki: ");
//        soTienDangKy = sc.nextInt();
        System.out.println();
    }

    void hienThiThongTin() {
        System.out.println("Ma hoc vien: " + maHocVien);
        System.out.println("Ten hoc vien: " + tenHocVien);
        System.out.println("Diem cuoi ki: " + diem);
//        System.out.println("So cmnd: " +soCMND);
//        System.out.println("SDT: " +soDT);
//        System.out.println("Email: " +email);
//        System.out.println("Ngay dang ki hoc: " +ngayDangKy);
//        System.out.println("So tien dang ki: " +soTienDangKy);
        System.out.println();
    }

    int tongDoanhThu(int tong, int soTienDangKy) {
        return tong + soTienDangKy;
    }


}
