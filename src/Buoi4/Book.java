package Buoi4;

public class Book {
    private int maSach;
    private String tenSach;
    private TacGia tacGia;
    private int namSanXuat;
    private String tomTatNoiDung;
    private double giaTien;

    // Constructor không tham số
    public Book() {}

    // Constructor có tham số
    public Book(int maSach, String tenSach, TacGia tacGia, int namSanXuat, String tomTatNoiDung, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namSanXuat = namSanXuat;
        this.tomTatNoiDung = tomTatNoiDung;
        this.giaTien = giaTien;
    }

    // Getters và Setters
    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public TacGia getTacGia() {
        return tacGia;
    }
    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }
    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    public double getGiaTien() {
        return giaTien;
    }
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }


    @Override
    public String toString() {
        return "Book{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tacGia=" + tacGia +
                ", namSanXuat=" + namSanXuat +
                ", tomTatNoiDung='" + tomTatNoiDung + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }

    public void display() {
        System.out.println(this.toString());
    }


}


