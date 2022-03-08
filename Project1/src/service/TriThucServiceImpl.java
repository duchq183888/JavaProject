/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Patient;
import model.TriThuc;
import repository.PatientDAO;
import repository.PatientDAOImpl;
import repository.TriThucDAO;
import repository.TriThucDAOImpl;

/**
 *
 * @author hqd16
 */
public class TriThucServiceImpl implements TriThucService {

     private TriThucDAO triThucDAO = null;

    public TriThucServiceImpl() {
        this.triThucDAO = new TriThucDAOImpl();
    }

    @Override
    public List<TriThuc> getList() {
        return triThucDAO.getList();
    }
}
