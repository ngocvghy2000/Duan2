/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.helper.Connect;
import com.model.NhomSanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhomSanPhamDAO {
    public void insert(NhomSanPham model) {
        String sql = "insert into NhomSP (tennhom,statusdelete,manhom) values (?,'false',?)";
        Connect.executeUpdate(sql,
                model.getTenNhom(),
                model.getMaNhom());
    }

    public void update(NhomSanPham model) {
        String sql = "update NhomSP set  tennhom=? where manhom = ?";
        Connect.executeUpdate(sql,
                model.getTenNhom(),
                model.getMaNhom());
    }

    public void delete(NhomSanPham model) {
        String sql = "update NhomSP set  statusdelete= 'true' where manhom = ?";
        Connect.executeUpdate(sql,
                model.getMaNhom());
    }
    
    public List<NhomSanPham> select() {
        String sql = "select * from NhomSP where statusdelete='false'";
        return select(sql);
    }
    
    private List<NhomSanPham> select(String sql, Object... args) {
        List<NhomSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = Connect.executeQuerry(sql, args);
                while (rs.next()) {
                    NhomSanPham model = readFromResultSet(rs);
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
    
    private NhomSanPham readFromResultSet(ResultSet rs) throws SQLException {
        NhomSanPham model = new NhomSanPham();
                model.setMaNhom(rs.getString("manhom"));
                model.setTenNhom(rs.getString("tennhom"));
        return model;
    }
}
