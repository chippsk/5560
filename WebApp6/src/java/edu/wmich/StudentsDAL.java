/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import java.util.List;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author malyshka
 */
@Named(value = "studentsDAL")
@ManagedBean
@RequestScoped
public class StudentsDAL {
    @PersistenceUnit
    EntityManagerFactory emf;
    
    @Resource
    UserTransaction utx;
    /**
     * Creates a new instance of StudentsDAL
     */
    public StudentsDAL() {
    }
    
    public List getAllStudents(){
        StudentsJpaController sjpac = new StudentsJpaController(utx,emf);
        Students st = new Students(123,"Ala","Al","al@b.com");
        try{
        sjpac.create(st);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            return sjpac.findStudentsEntities();
        }
        catch (Exception e){
            
        }
        return null;
    }
}
