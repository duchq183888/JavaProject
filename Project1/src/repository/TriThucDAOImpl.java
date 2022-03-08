/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Patient;
import model.TriThuc;

public class TriThucDAOImpl implements TriThucDAO {
    
    @Override
    public List<TriThuc> getList() {
        Connection conn = new JDBCConnection().getConnection();
        ArrayList<TriThuc> list = new ArrayList<>();
        String sql = "SELECT * FROM Positive";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TriThuc t = new TriThuc();
                t.setSTT(Integer.parseInt(rs.getString("STT")));
                t.setHokhan(Integer.parseInt(rs.getString("Ho khan")));
                t.setSomui(Integer.parseInt(rs.getString("Sổ mũi")));
                t.setSot(Integer.parseInt(rs.getString("Sốt")));
                t.setHathoi(Integer.parseInt(rs.getString("Hắt hơi")));
                t.setMoitim(Integer.parseInt(rs.getString("Môi tím tái")));
                t.setDauhong(Integer.parseInt(rs.getString("Đau họng")));
                t.setDaunguc(Integer.parseInt(rs.getString("Đau ngực")));
                t.setKhotho(Integer.parseInt(rs.getString("Khó thở")));
                t.setChanan(Integer.parseInt(rs.getString("Chán ăn")));
                t.setHodam(Integer.parseInt(rs.getString("Ho đàm")));
                t.setHomau(Integer.parseInt(rs.getString("Ho ra máu")));
                t.setConclusion(rs.getString("Conclusion"));
                
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
        
    }
    
}
