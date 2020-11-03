package com.doan1.QLnhanvien;
import com.doan1.nhanvien.nhanvien;
import java.util.ArrayList;
import java.util.Scanner;

public class QLnhanvien {
    ArrayList<nhanvien> QLnhanvien;
    public QLnhanvien(){
        QLnhanvien=new ArrayList<nhanvien>();
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        nhanvien Nhanvien;
        char ch='y';
        do {
            Nhanvien=new nhanvien();
            Nhanvien.nhap();
            QLnhanvien.add(Nhanvien);
            System.out.printf("ban nhap tiep hay khong ? y/n :");
            ch=scanner.next().charAt(0);
        }while (ch=='y'||ch=='Y');
    }
}
