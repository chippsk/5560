/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author malyshka
 */
@ManagedBean
@SessionScoped
public class Calc {
    private int firstNumber;
    private int secondNumber;
    private int result;
    /**
     * Creates a new instance of Calc
     */
    public Calc() {
    }

    /**
     * @return the firstNumber
     */
    public int getFirstNumber() {
        return firstNumber;
    }

    /**
     * @param firstNumber the firstNumber to set
     */
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * @return the secondNumber
     */
    public int getSecondNumber() {
        return secondNumber;
    }

    /**
     * @param secondNumber the secondNumber to set
     */
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * @return the result
     */
    public int getResult() {
        result = firstNumber + secondNumber;
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(int result) {
        this.result = result;
    }
    
    public String click(){
        return "jsf2";
    }
    
}
