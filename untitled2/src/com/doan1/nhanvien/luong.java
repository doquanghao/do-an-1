package com.doan1.nhanvien;
import java.util.Scanner;
public class luong {
    private String maphong;
    private double hesoluong;
    private static  double luongcoban=3500000;
    public luong(){
    }

    public luong(String maphong, double hesoluong) {
        this.maphong = maphong;
        this.hesoluong = hesoluong;
    }
    public void  nhap(){
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhap ma phong ban cua nhan vien :");
            maphong = scanner.nextLine().trim();
        }while (maphong.length()>5);
        do {
            System.out.println("nhap he so luong cua nhan vien :");
            hesoluong=Integer.parseInt(scanner.nextLine());
        }while (hesoluong>=9||hesoluong<1);

    }

    @Override
    public String toString() {
        return "luong{" +
                "maphong='" + maphong + '\'' +
                ", hesoluong=" + hesoluong +
                '}';
    }
    public void hienthi(){
        System.out.println(toString());
    }

}
