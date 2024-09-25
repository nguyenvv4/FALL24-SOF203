package com.example.sd19306.model;

public class SinhVien {
    private String id, hoTen;
    private String diaChi, lop;
    private String trangThai;

    public SinhVien() {
    }

    public SinhVien(String id, String hoTen, String diaChi, String lop, String trangThai) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.lop = lop;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
