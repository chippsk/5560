/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appclient1;

import edu.wmich.CalcSessionBeanRemote;
import javax.ejb.EJB;
import javax.swing.JOptionPane;

/**
 *
 * @author malyshka
 */
public class Main {
    @EJB
    private static CalcSessionBeanRemote calcSessionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "The total is "+calcSessionBean.add(2,4));
    }
    
}
