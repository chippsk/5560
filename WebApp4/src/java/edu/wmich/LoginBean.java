/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author malyshka
 */
@ManagedBean
//@RequestScoped

@Named(value="loginBean")
@SessionScoped
public class LoginBean {
    
    private String username;
    private String password;
    private String validUsername = "test";
    private String validPassword = "test";
    private boolean auth = false;
    private ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();
    private String make;
    private String model;
    private int year;
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
        allVehicles.add(new Vehicle("hyundai","sonata",2009));
        allVehicles.add(new Vehicle("ford","taurus",2001));
        allVehicles.add(new Vehicle("ford","mustang",2014));
    }

    public String addVehicle(){
        allVehicles.add(new Vehicle(getMake(), getModel(), getYear()));
        return "main";
    }
    public String deleteVehicle(Vehicle v){
        allVehicles.remove(v);
        return "main";
    }
    public String login(){
        if(username.equals(validUsername) && password.equals(validPassword)){
            auth = true;
            return "main";
        }
        else {
            auth = false;
            return "index";
        }
    }
    
    public String logout(){
        auth = false;
        return "index";
    }
    /**
     * @return the userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the userName to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the auth
     */
    public boolean isAuth() {
        return auth;
    }

    /**
     * @param auth the auth to set
     */
    public void setAuth(boolean auth) {
        this.auth = auth;
    }

    /**
     * @return the allVehicles
     */
    public ArrayList<Vehicle> getAllVehicles() {
        return allVehicles;
    }

    /**
     * @param allVehicles the allVehicles to set
     */
    public void setAllVehicles(ArrayList<Vehicle> allVehicles) {
        this.allVehicles = allVehicles;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
}
