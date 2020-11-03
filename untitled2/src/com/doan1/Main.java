package com.doan1;
import com.doan1.hienthi.*;
import com.doan1.nhanvien.*;
import com.doan1.QLnhanvien.*;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(System[]arg){
        nhanvien nhanvien=new nhanvien();
        luong luong=new luong();
        int chon;
        Scanner scanner=new Scanner(System.in);
        do {
            chonmenu();
            chon=scanner.nextInt();
            switch (chon){
                case 1:break;
            }
        }while (chon!=7);

    }
    static void chonmenu(){
        System.out.println("1.nhap thong tin nhan vien :");
    }
}
