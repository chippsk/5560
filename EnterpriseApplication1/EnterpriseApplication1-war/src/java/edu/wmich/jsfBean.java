/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author malyshka
 */
@ManagedBean
@SessionScoped
public class jsfBean {
    @Resource(mappedName = "jms/myQueue")
    private Queue myQueue;
    @Inject
    @JMSConnectionFactory("jms/myQueue-ConnectionFactory")
    private JMSContext context;
    @EJB
    private CalcSessionBeanRemote calcSessionBean;
    private int val1;
    private int val2,val3;
    /**
     * Creates a new instance of jsfBean
     */
    public jsfBean() {
    }

    /**
     * @return the val1
     */
    public int getVal1() {
        return val1;
    }

    /**
     * @param val1 the val1 to set
     */
    public void setVal1(int val1) {
        this.val1 = val1;
    }

    /**
     * @return the val2
     */
    public int getVal2() {
        return val2;
    }

    /**
     * @param val2 the val2 to set
     */
    public void setVal2(int val2) {
        this.val2 = val2;
    }

    /**
     * @return the val3
     */
    public int getVal3() {
        return val3;
    }

    /**
     * @param val3 the val3 to set
     */
    public void setVal3(int val3) {
        this.val3 = val3;
    }
    
    public String add(){
        //val3 = val1 + val2;
        //call ejb instead of logic
        val3 = calcSessionBean.add(val1, val2);
        sendJMSMessageToMyQueue("The total is "+val3);
        return null;
    }

    private void sendJMSMessageToMyQueue(String messageData) {
        context.createProducer().send(myQueue, messageData);
    }
}
