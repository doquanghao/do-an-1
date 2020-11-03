package com.doan1.QLnhanvien;
import com.doan1.nhanvien.luong;
import java.util.ArrayList;
import java.util.Scanner;

public class QLluong {
    ArrayList<luong> QLluong;
    public QLluong(){
        QLluong=new ArrayList<luong>();
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        luong Luong;
        char ch='y';
        do {
            Luong=new luong();
            Luong.nhap();
            QLluong.add(Luong);
            System.out.printf("ban nhap tiep hay khong ? y/n :");
            ch=scanner.next().charAt(0);
        }while (ch=='y'||ch=='Y');
    }
}
