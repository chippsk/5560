/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import javax.ejb.Stateless;

/**
 *
 * @author malyshka
 */
@Stateless
public class CalcSessionBean implements CalcSessionBeanRemote, CalcSessionBeanLocal {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
