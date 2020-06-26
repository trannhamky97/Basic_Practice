package org.example;
import java.util.Scanner;

public class HocVien {
    String maHocVien;
    String tenHocVien;
    Integer soCMND;
    Integer soDT;
    String email;
    String ngayDangKy;
    Integer soTienDangKy;

    public HocVien(){}
    public HocVien(String maHocVien, String tenHocVien, Integer soCMND, Integer soDT, String email, String ngayDangKy, Integer soTienDangKy){
        this.maHocVien = maHocVien;
        this.tenHocVien = tenHocVien;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
        this.ngayDangKy = ngayDangKy;
        this.soTienDangKy = soTienDangKy;
    }

    void nhapThongTinHocVien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hoc vien: ");
        maHocVien = sc.next();
        System.out.print("Nhap ten hoc vien: ");
        tenHocVien = sc.next();
        System.out.print("Nhap so CMND: ");
        soCMND = sc.nextInt();
        System.out.print("Nhap sdt: ");
        soDT = sc.nextInt();
        System.out.print("Nhap email: ");
        email = sc.next();
        System.out.print("Nhap ngay dang ki (dd/mm/yyyy): ");
        ngayDangKy = sc.next();
        String[] date = ngayDangKy.split("/");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);
        while (day<1 || day > 31 || month < 1 || month > 12 || year <1900 || year > 2020){
            System.out.print("Nhap ngay dang ki (dd/mm/yyyy): ");
            ngayDangKy = sc.next();
            date = ngayDangKy.split("/");
            day = Integer.parseInt(date[0]);
            month = Integer.parseInt(date[1]);
            year = Integer.parseInt(date[2]);
        }
        System.out.print("Nhap so tien dang ki: ");
        soTienDangKy = sc.nextInt();
        System.out.println();
    }
    void hienThiThongTin(){
        System.out.println("Ma hoc vien :" +maHocVien);
        System.out.println("Ten hoc vien :" +tenHocVien);
        System.out.println("So cmnd :" +soCMND);
        System.out.println("SDT :" +soDT);
        System.out.println("Email :" +email);
        System.out.println("Ngay dang ki hoc :" +ngayDangKy);
        System.out.println("So tien dang ki :" +soTienDangKy);
        System.out.println();
    }

    int tongDoanhThu(int tong, int soTienDangKy){
        return tong + soTienDangKy;
    }

}
