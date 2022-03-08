/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import model.Patient;
import model.Symptom;

/**
 *
 * @author hqd16
 */
public class JDBCConnection {

//    private Connection conn;
//
//    public JDBCConnection() {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
//                    + "databasename=Project1;"
//                    + "username=sa;password=160220");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
                    + "databasename=Project1;"
                    + "username=sa;password=160220");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


//    public static void main(String[] args) {
//        Symptom s1 = new Symptom("Ho khan", 0.5);
//        Symptom s2 = new Symptom("Hắt hơi", 0.7);
//        Symptom s3 = new Symptom("Chán ăn", 0.6);
//        ArrayList<Symptom> l1 = new ArrayList<>();
//        l1.add(s1);
//        l1.add(s2);
//        l1.add(s3);
//        ArrayList<Double> list = new ArrayList<>();
//        double t1=new JDBCConnection().camCum(l1);
//        double t2=new JDBCConnection().viemPhoi(l1);
//        double t3=new JDBCConnection().suyHo(l1);
//        double t4=new JDBCConnection().ungThu(l1);
//        System.out.println(t1);
//        System.out.println(t2);
//        System.out.println(t3);
//        System.out.println(t4);
//
//    }
    
    public ArrayList<Double> getL(ArrayList<Symptom> l){
        ArrayList<Double> t=new ArrayList<>();
        double t1=new JDBCConnection().camCum(l);
        double t2=new JDBCConnection().viemPhoi(l);
        double t3=new JDBCConnection().suyHo(l);
        double t4=new JDBCConnection().ungThu(l);
        t.add(t1);t.add(t2);t.add(t3);t.add(t4);
        return t;
    }
     public static double mins(ArrayList<Double> l) {
        double min = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (min> l.get(i)) {
                min = l.get(i);
            }
        }
        return min;
    }

//    public boolean addPatient(Patient s) {
//
//        String sql = "INSERT INTO Patient(PatientID, PatientName, Gender, Age, Address,Phone) "
//                + "VALUES(?,?,?,?,?,?)";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, s.getID());
//            ps.setString(2, s.getName());
//            ps.setString(4, s.getGender());
//            ps.setString(5, String.valueOf(s.getAge()));
//            ps.setString(6, s.getAddress());
//            ps.setString(7, s.getPhone());
//
//            return ps.executeUpdate() > 0;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return false;
//    }
//
//    public ArrayList<Patient> getListPatient() {
//        ArrayList<Patient> list = new ArrayList<>();
//        String sql = "SELECT * FROM Patient";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Patient s = new Patient();
//                s.setID(rs.getString("PatientID"));
//                s.setName(rs.getString("PatientName"));
//                s.setGender(rs.getString("Gender"));
//                s.setAge(Integer.parseInt(rs.getString("Age")));
//                s.setAddress(rs.getString("Address"));
//                s.setPhone(rs.getString("Phone"));
//
//                list.add(s);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return list;
//    }
//
    public Double camCum(ArrayList<Symptom> list) {
        Connection conn=new JDBCConnection().getConnection();
        String sql, sql1;
        ArrayList<Double> l1 = new ArrayList<>();
     
        for (int i = 0; i < list.size(); i++) {
            sql ="SELECT TOP 1 (CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE ["+list.get(i).getSymptomName()+"] =1 AND"
                    + " Conclusion=N'Cảm cúm thông thường'))/CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE Conclusion=N'Cảm cúm thông thường'))) as ok FROM Positive";
         
            try {
                PreparedStatement ps1 = conn.prepareStatement(sql);
                ResultSet rs1 = ps1.executeQuery();
                while(rs1.next()){
                double s;
                float s1;
                s1 = Float.parseFloat(rs1.getString("ok"));
                s=s1;
                l1.add(s);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        
        return mins(l1);

    }
     public Double viemPhoi(ArrayList<Symptom> list) {
        Connection conn=new JDBCConnection().getConnection();
        String sql, sql1;
        ArrayList<Double> l1 = new ArrayList<>();
       
        for (int i = 0; i < list.size(); i++) {
            sql ="SELECT TOP 1 (CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE ["+list.get(i).getSymptomName()+"] =1 AND"
                    + " Conclusion=N'Viêm phổi'))/CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE Conclusion=N'Viêm phổi'))) as ok FROM Positive";
         
            try {
                PreparedStatement ps1 = conn.prepareStatement(sql);
             
                ResultSet rs1 = ps1.executeQuery();
                while(rs1.next()){
                double s;
                float s1;
                s1 = Float.parseFloat(rs1.getString("ok"));
                s=s1;
                l1.add(s);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return mins(l1);

    }
      public Double suyHo(ArrayList<Symptom> list) {
        Connection conn=new JDBCConnection().getConnection();
        String sql, sql1;
        ArrayList<Double> l1 = new ArrayList<>();
       

        for (int i = 0; i < list.size(); i++) {
            sql ="SELECT TOP 1 (CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE ["+list.get(i).getSymptomName()+"] =1 AND"
                    + " Conclusion=N'Suy hô hấp'))/CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE Conclusion=N'Suy hô hấp'))) as ok FROM Positive";
         
            try {
                PreparedStatement ps1 = conn.prepareStatement(sql);
             
                ResultSet rs1 = ps1.executeQuery();
                while(rs1.next()){
                double s;
                float s1;
                s1 = Float.parseFloat(rs1.getString("ok"));
                s=s1;
                l1.add(s);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return mins(l1);
    }
       public Double ungThu(ArrayList<Symptom> list) {
        Connection conn=new JDBCConnection().getConnection();
        String sql, sql1;
        ArrayList<Double> l1 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            sql ="SELECT TOP 1 (CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE ["+list.get(i).getSymptomName()+"] =1 AND"
                    + " Conclusion=N'Ung thư phổi'))/CONVERT(float,(SELECT COUNT(STT) FROM Positive WHERE Conclusion=N'Ung thư phổi'))) as ok FROM Positive";
         
            try {
                PreparedStatement ps1 = conn.prepareStatement(sql);
             
                ResultSet rs1 = ps1.executeQuery();
                while(rs1.next()){
                double s;
                float s1;
                s1 = Float.parseFloat(rs1.getString("ok"));
                s=s1;
                l1.add(s);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return mins(l1);

    }

}
