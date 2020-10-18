/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String tenSP;
    private String maSP;
    private int nhomSP;
    private int nhaCungCap;
    private float giaNhap;
    private float giaBan;
    private String ngayNhap;
    private String donViTinh;
    private String hoaTiet;
    private String khoiLuong;
    private String loaiMen;
    private String dacDiem;
    private float soLuong;
    private int statusDelete;

    public SanPham() {
    }

    public SanPham(String tenSP, String maSP, int nhomSP, int nhaCungCap, float giaNhap, float giaBan, String ngayNhap, String donViTinh, String hoaTiet, String khoiLuong, String loaiMen, String dacDiem, float soLuong, int statusDelete) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.nhomSP = nhomSP;
        this.nhaCungCap = nhaCungCap;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.ngayNhap = ngayNhap;
        this.donViTinh = donViTinh;
        this.hoaTiet = hoaTiet;
        this.khoiLuong = khoiLuong;
        this.loaiMen = loaiMen;
        this.dacDiem = dacDiem;
        this.soLuong = soLuong;
        this.statusDelete = statusDelete;
    }

    public SanPham(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getNhomSP() {
        return nhomSP;
    }

    public void setNhomSP(int nhomSP) {
        this.nhomSP = nhomSP;
    }

    public int getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(int nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getHoaTiet() {
        return hoaTiet;
    }

    public void setHoaTiet(String hoaTiet) {
        this.hoaTiet = hoaTiet;
    }

    public String getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(String khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getLoaiMen() {
        return loaiMen;
    }

    public void setLoaiMen(String loaiMen) {
        this.loaiMen = loaiMen;
    }

    public String getDacDiem() {
        return dacDiem;
    }

    public void setDacDiem(String dacDiem) {
        this.dacDiem = dacDiem;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public int getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(int statusDelete) {
        this.statusDelete = statusDelete;
    }

   
}
