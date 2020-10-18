/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.helper.Connect;
import com.model.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamDAO {
    public void insert(SanPham model) {
        String sql = "insert into SanPham (tensp,masp,nhomsp,nhacungcap,gianhap,giaban,ngaynhap,donvitinh,hoatiet,khoiluong,loaimen,dacdiem,soluong,statusdelete) values (?,?,?,?,?,?,?,?,?,?,?,?,?,'0')";
        Connect.executeUpdate(sql,
                model.getTenSP(),
                model.getMaSP(),
                model.getNhomSP(),
                model.getNhaCungCap(),
                model.getGiaNhap(),
                model.getGiaBan(),
                model.getNgayNhap(),
                model.getDonViTinh(),
                model.getHoaTiet(),
                model.getKhoiLuong(),
                model.getLoaiMen(),
                model.getDacDiem(),
                model.getSoLuong());
    }

    public void update(SanPham model) {
        String sql = "update SanPham set  masp=?,nhomsp=?,nhacungcap=?,gianhap=?,giaban=?, ngaynhap=?, donvitinh=?, hoatiet=?, khoiluong=?, loaimen=?,dacdiem=?, soluong= ? where tensp = ?";
        Connect.executeUpdate(sql,
                model.getMaSP(),
                model.getNhomSP(),
                model.getNhaCungCap(),
                model.getGiaNhap(),
                model.getGiaBan(),
                model.getNgayNhap(),
                model.getDonViTinh(),
                model.getHoaTiet(),
                model.getKhoiLuong(),
                model.getLoaiMen(),
                model.getDacDiem(),
                model.getSoLuong(),
                model.getTenSP());
    }

    public void delete(SanPham model) {
        String sql = "update SanPham set  statusdelete= 'true' where TenSp = ?";
        Connect.executeUpdate(sql,
                model.getTenSP());
    }
    
    public List<SanPham> select() {
        String sql = "select * from SanPham where statusdelete='false'";
        return select(sql);
    }
    
    private List<SanPham> select(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Connect.executeQuerry(sql, args);
                while (rs.next()) {
                    SanPham model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    
    private SanPham readFromResultSet(ResultSet rs) throws SQLException {
        SanPham model = new SanPham();
                model.setTenSP(rs.getString("tensp"));
                model.setMaSP(rs.getString("masp"));
                model.setNhomSP(rs.getInt("nhomsp"));
                model.setNhaCungCap(rs.getInt("nhacungcap"));
                model.setGiaNhap(rs.getFloat("gianhap"));
                model.setGiaBan(rs.getFloat("giaban"));
                model.setNgayNhap(rs.getString("ngaynhap"));
                model.setDonViTinh(rs.getString("donvitinh"));
                model.setHoaTiet(rs.getString("hoatiet"));
                model.setKhoiLuong(rs.getString(("khoiluong")));
                model.setLoaiMen(rs.getString("loaimen"));
                model.setDacDiem(rs.getString("dacdiem"));
                model.setSoLuong(rs.getFloat("soluong"));
        return model;
    }
}
