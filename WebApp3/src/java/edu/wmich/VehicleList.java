/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import java.util.ArrayList;

/**
 *
 * @author malyshka
 */
public class VehicleList {
      private ArrayList<Vehicle> allVehicles;
    
    public VehicleList(){
        allVehicles = new ArrayList<>();
        Vehicle v1 = new Vehicle();
        v1.setMake("Ford");
        v1.setModel("Focus");
        v1.setYear(2001);
               
        Vehicle v2 = new Vehicle();
        v2.setMake("Toyota");
        v2.setModel("Camery");
        v2.setYear(2002);
        
        Vehicle v3 = new Vehicle();
        v3.setMake("Nissian");
        v3.setModel("Altima");
        v3.setYear(1998);
        
        Vehicle v4 = new Vehicle();
        v4.setMake("Infiniti");
        v4.setModel("JX35");
        v4.setYear(2012);
        
        allVehicles.add(v1);
        allVehicles.add(v2);
        allVehicles.add(v3);
        allVehicles.add(v4);
    }
    
    public ArrayList<Vehicle> getAllVehicles(){
        return allVehicles;
    }
}
