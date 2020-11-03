package com.doan1.nhanvien;

import java.util.Scanner;

public class nhanvien {
    private String hoten;
    private String ngaysinh;
    private String diachi;
    private String gioitinh;
    private String maNV;
    private String chucvu;
    public  nhanvien(){

    }

    public nhanvien(String hoten, String ngaysinh, String diachi, String gioitinh, String chucvu, String s) {
        this.hoten = hoten;
        this.ngaysinh = this.ngaysinh;
        this.diachi = this.diachi;
        this.gioitinh = this.gioitinh;
        this.maNV = maNV;
        this.chucvu = this.chucvu;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    @Override
    public String toString() {
        return maNV+"#"+hoten+"#"+gioitinh+"#"+ngaysinh+"#"+diachi+"#"+chucvu;
    }

    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        boolean kt;
        do{
           do {
            System.out.println("nhap ma nhan vien cp 8 ki tu:");
            maNV=scanner.nextLine().trim();
            }while (maNV.length()>6||maNV.length()<1);
           kt=maNV.trim().equals(" ")==true;
           if(kt){
               System.out.println("Ma nhan vien vua nhap da ton tai , moi nhap lai :");
           }
        }while (kt);
        do {
            System.out.println("nhap ho ten nhan vien :");
            hoten=scanner.nextLine();
        }while (hoten.equals(" "));
        do {
            System.out.println("nhap ngay sinh :");
            ngaysinh=scanner.nextLine();
        }while (ngaysinh.equals(""));
        do {
            System.out.println("nhap gioi tinh nhan vien : ");
            gioitinh=scanner.nextLine();
        }while (gioitinh.equals(" "));
        do {
            System.out.println("nhap dia chi nhan vien :");
            diachi=scanner.nextLine();
        }while (diachi.equals(" "));
        do {
            System.out.println("nhap chuc vu nhan vien :");
            chucvu=scanner.nextLine();
        }while (chucvu.equals(" "));
    }
}
