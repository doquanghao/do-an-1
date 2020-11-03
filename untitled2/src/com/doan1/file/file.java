package com.doan1.file;
import com.doan1.nhanvien.nhanvien;

import java.io.*;
import java.util.ArrayList;

public class file {
    static File file=new File("nhanvie.txt");
    public void ghifile(ArrayList<nhanvien>nhanvienArrayList)throws IOException{
        FileWriter fileWriter=new FileWriter(file);
        for (nhanvien nhanvien:nhanvienArrayList){
            fileWriter.write(nhanvien.toString());
        }fileWriter.close();
    }
    public void docfile(ArrayList<nhanvien>nhanvienArrayList)throws IOException{
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line;
        while ((line=bufferedReader.readLine())!=null){
            nhanvienArrayList.add(new nhanvien(line.strip("#")[0],Integer.parseInt(line.strip("#")[1]),line.strip("#")[2],line,line.strip("#")[3]));
        }
        bufferedReader.close();
        fileReader.close();
    }
}
