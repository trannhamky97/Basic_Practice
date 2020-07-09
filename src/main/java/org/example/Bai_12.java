package org.example;
import java.util.ArrayList;
import java.util.Scanner;


public class Bai_12 {
    //Bai12: Xây dựng 1 class Học viên bao gồm những thuộc tính: Mã học viên, tên học viên, số chứng minh nhân dân,
    //số điện thoại và email, ngày đăng ký học, số tiền đăng ký.
    //a. Tạo class học viên với các thuộc tính như trên và 1 hàm tạo mặc định.
    //b. Cho người dùng nhập thông tin của học viên từ màn hình console và lưu thông tin này vào cho 1 đối tượng được tạo bởi class học viên trên
    //c. Giả sử lớp có 3 học viên, bạn hãy tạo ra 3 đối tượng học viên này và lưu toàn bộ chúng vào 1 mảng dữ liệu biết rằng mỗi học viên ứng với 1 phần tử trong mảng.
    //d. Sắp xếp các học viên trong mảng theo thứ tự tăng dần về ngày đăng ký học.
    //e. Viết hàm tính tổng doanh thu từ lớp này.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc vien: ");
        int soLuongHocVien = sc.nextInt();
        while (soLuongHocVien < 1){
            System.out.print("Moi nhap lai so luong hoc vien (so luong > 1): ");
            soLuongHocVien = sc.nextInt();
        }


        HocVien[] dsHocVien = new HocVien[soLuongHocVien];
        for(int i = 0; i<soLuongHocVien ; i++){
            System.out.println("Nhap thong tin hoc vien thu "+(i+1));
            HocVien hv = new HocVien();
            hv.nhapThongTinHocVien();
            dsHocVien[i]=hv;
        }

        for(int i = 0 ; i<soLuongHocVien;i++){
            dsHocVien[i].hienThiThongTin();
        }

        //Sap xep tang dan theo ngay dang ki
        for(int i = 0 ; i<soLuongHocVien -1;i++){
            for(int j = i + 1 ; j< soLuongHocVien; j++){
                String[] date1 = dsHocVien[i].ngayDangKy.split("/");
                String[] date2 = dsHocVien[j].ngayDangKy.split("/");
                if(Integer.parseInt(date1[2])>Integer.parseInt(date2[2])){
                    HocVien tmp = dsHocVien[i];
                    dsHocVien[i]=dsHocVien[j];
                    dsHocVien[j]=tmp;
                    break;
                } else if(Integer.parseInt(date1[1])>Integer.parseInt(date2[1])){
                    HocVien tmp = dsHocVien[i];
                    dsHocVien[i]=dsHocVien[j];
                    dsHocVien[j]=tmp;
                    break;
                } else if(Integer.parseInt(date1[0])>Integer.parseInt(date2[0])){
                    HocVien tmp = dsHocVien[i];
                    dsHocVien[i]=dsHocVien[j];
                    dsHocVien[j]=tmp;
                    break;
                }
            }
        }
        //Test
        for(int i = 0 ; i<soLuongHocVien;i++){
            System.out.println(dsHocVien[i].ngayDangKy);
        }


        // Tong doanh thu
        System.out.println("Tinh tong doanh thu: ");
        int tong = 0;
        for(int i = 0; i< soLuongHocVien; i++){
            tong = dsHocVien[i].tongDoanhThu(tong, dsHocVien[i].soTienDangKy);
        }
        System.out.println("Tong doann thu :" +tong);
        // ....
    }
}
