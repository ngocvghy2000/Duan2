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
public class NhomSanPham {
    private String maNhom;
    private String tenNhom;
    private int statusDelete;

    public NhomSanPham() {
    }
    
    public NhomSanPham(String maNhom) {
        this.maNhom = maNhom;
    }

    public NhomSanPham(String maNhom, String tenNhom, int statusDelete) {
        this.maNhom = maNhom;
        this.tenNhom = tenNhom;
        this.statusDelete = statusDelete;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public int getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(int statusDelete) {
        this.statusDelete = statusDelete;
    }
    
    
}
