package bai3;

public class SinhVien implements Comparable<SinhVien> {

    private String maSV, hoten;
    private int namsinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoten, int namsinh) {
        this.maSV = maSV;
        this.hoten = hoten;
        this.namsinh = namsinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", hoten=" + hoten + ", namsinh=" + namsinh + '}';
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }
}
