package com.doan1.hienthi;
import com.doan1.nhanvien.*;

import java.util.ArrayList;

public class hienthi {
    ArrayList<nhanvien>nhanvienArrayList;
    public void hien(nhanvien Nhanvien){
        System.out.printf("",Nhanvien.getMaNV(),Nhanvien.getHoten(),Nhanvien.getGioitinh(),Nhanvien.getNgaysinh(),Nhanvien.getDiachi(),Nhanvien.getChucvu());
    }
    public void hienthithongtin(ArrayList<nhanvien>nhanvienArrayList){
        System.out.printf("|%8s|%20s|%20s|%20s|%20s|%8s\n","maNV","hoten","gioitinh","ngaysinh","diachi","chucvu");
        for (nhanvien Nhanvien:nhanvienArrayList){
            hien(Nhanvien);
        }
    }
}
