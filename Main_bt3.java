package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QLSV ql = new QLSV();
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("1. them");
            System.out.println("2. in");
            System.out.println("3. xoa");
            System.out.println("4. sua");
            System.out.println("5. tim theo ma");
            System.out.println("6. tim theo ten");
            System.out.println("7. sap tang dan theo ma");
            System.out.print("Nhap: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nhap ma sv:");
                    String maSV = sc.nextLine();
                    System.out.print("Nhap ten sv:");
                    String hoten = sc.nextLine();
                    System.out.print("Nhap nam sinh sv:");
                    int namsinh = sc.nextInt();
                    SinhVien sv = new SinhVien(maSV, hoten, namsinh);
                    ql.themSV(sv);
                    break;
                case 2:
                    ql.in();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Nhap ma sinh vien can xoa:");
                    maSV = sc.nextLine();
                    ql.xoa(maSV);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Nhap ma sinh vien can sua:");
                    maSV = sc.nextLine();

                    ql.sua(maSV);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Nhap ma can tim");
                    maSV = sc.nextLine();
                    ql.timTheoMa(maSV);
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Nhap ten can tim");
                    hoten = sc.nextLine();
                    ql.timTheoten(hoten);
                    break;
                case 7:
                    ql.sap_xep_ma_tang();
                    ql.in();
                    break;
                default:
                    if (menu != 0) {
                        System.out.println("Thoat thanh cong");
                    } else {
                        System.out.println("Nhap lai");
                    }
            }
        } while (menu != 0);
    }
}
