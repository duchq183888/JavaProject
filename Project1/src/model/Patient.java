/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hqd16
 */
public class Patient {
      private String ID;
    private String name;
    private String gender;
    private String address;
    private String phone;
    private int age;

    public Patient(String ID, String name, String gender, String address, String phone, int age) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public Patient() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
