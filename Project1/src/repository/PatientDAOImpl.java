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

/**
 *
 * @author hqd16
 */
public class PatientDAOImpl implements PatientDAO{

    @Override
    public List<Patient> getList() {
       Connection conn=new JDBCConnection().getConnection();
       ArrayList<Patient> list = new ArrayList<>();
        String sql = "SELECT * FROM Patient";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Patient s = new Patient();
                s.setID(rs.getString("PatientID"));
                s.setName(rs.getString("PatientName"));
                s.setGender(rs.getString("Gender"));
                s.setAge(Integer.parseInt(rs.getString("Age")));
                s.setAddress(rs.getString("Address"));
                s.setPhone(rs.getString("Phone"));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    
}
