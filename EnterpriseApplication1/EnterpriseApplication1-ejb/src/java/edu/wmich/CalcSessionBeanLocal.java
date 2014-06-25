/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import javax.ejb.Local;

/**
 *
 * @author malyshka
 */
@Local
public interface CalcSessionBeanLocal {

    int add(int a, int b);
    
}
