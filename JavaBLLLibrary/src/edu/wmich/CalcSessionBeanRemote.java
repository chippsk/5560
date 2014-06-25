/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import javax.ejb.Remote;

/**
 *
 * @author malyshka
 */
@Remote
public interface CalcSessionBeanRemote {

    int add(int a, int b);
    
}
