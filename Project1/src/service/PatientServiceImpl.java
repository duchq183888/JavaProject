/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Patient;
import repository.PatientDAO;
import repository.PatientDAOImpl;

/**
 *
 * @author hqd16
 */
public class PatientServiceImpl implements PatientService{
    private PatientDAO patientDAO = null;

    public PatientServiceImpl() {
        this.patientDAO = new PatientDAOImpl();
    }

    @Override
    public List<Patient> getList() {
        return patientDAO.getList();
    }
    
}
