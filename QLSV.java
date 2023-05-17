package bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QLSV {

    private ArrayList<SinhVien> svn = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void themSV(SinhVien sv) {
        svn.add(sv);
    }

    public void in() {
        for (SinhVien sv : svn) {
            System.out.println(sv);
        }
    }

    public void timTheoMa(String maSV) {
        for (SinhVien s : svn) {
            if (s.getMaSV().indexOf(maSV) >= 0) {
                System.out.println(s);
            }
        }
    }

    public void timTheoten(String hoten) {
        for (SinhVien s : svn) {
            if (s.getHoten().indexOf(hoten) >= 0) {
                System.out.println(s);
            }
        }
    }

    public void xoa(String maSV) {
        ArrayList<SinhVien> svCanXoa = new ArrayList<>();

        // Tìm và thêm các sinh viên cần xóa vào danh sách tạm thời
        for (SinhVien sv1 : svn) {
            if (sv1.getMaSV().equals(maSV)) {
                svCanXoa.add(sv1);
            }
        }

        // Xóa các sinh viên trong danh sách tạm thời khỏi danh sách chính
        for (SinhVien sv : svCanXoa) {
            svn.remove(sv);
        }

        System.out.println("Da xoa sinh vien");
    }

    public void sap_xep_ma_tang() {
        Collections.sort(svn, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv1.getMaSV().compareTo(sv2.getMaSV());
            }
        });
    }

    public void sua(String maSV) {
        SinhVien svCanSua = null;
        for (SinhVien s : svn) {
            if (s.getMaSV().equals(maSV)) {
                svCanSua = s;
                break;
            }
        }
        if (svCanSua == null) {
            System.out.println("Khong tim thay");
        } else {
            System.out.print("Nhap ten moi: ");
            String tenmoi = sc.nextLine();
            System.out.print("Nhap nam sinh moi: ");
            int namsinhmoi = sc.nextInt();

            svCanSua.setHoten(tenmoi);
            svCanSua.setNamsinh(namsinhmoi);
        }
    }
}
