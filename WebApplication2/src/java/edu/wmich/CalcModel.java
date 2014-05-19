/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

/**
 *
 * @author malyshka
 */
public class CalcModel {
    private int firstNumber;
    private int secondNumber;
    private int result;
    private String operation;

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
        if(operation.equals("+")){
            result = firstNumber+secondNumber;
        }else if(operation.equals("-")){
            result = firstNumber-secondNumber;
        }else if(operation.equals("*")){
            result = firstNumber*secondNumber;
        }else if(operation.equals("/")){
            result = firstNumber/secondNumber;
        }
        return result;
    }

    /**
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
    
}
