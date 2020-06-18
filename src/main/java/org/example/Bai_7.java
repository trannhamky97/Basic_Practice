package org.example;
import java.util.Scanner;

public class Bai_7 {
    //Bai 7.1: Viết chương trình cho người dùng nhập n con số nguyên và thêm vào mảng,
    //sau đó viết code để sắp xếp mảng theo thứ tự tăng dần.
    static Scanner sc = new Scanner(System.in);
    public static void mangTangDan(){
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<n;i++){
            System.out.print("Array["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        inMang(arr);
        System.out.println();
        //Sap xep mang tang dan
        sapXepTangDan(arr);
        System.out.println("Day so sau khi sap xep theo thu tu tang dan: ");
        inMang(arr);
    }
    public static void inMang (int[] arr){
        for (int i = 0; i< arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static void sapXepTangDan (int[] arr){
        int tmp = arr[0];
        for (int i = 0; i < arr.length - 1;i++){
            for (int j = i+1; j < arr.length;j++){
                if (arr[i]>arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        mangTangDan();
    }
}
