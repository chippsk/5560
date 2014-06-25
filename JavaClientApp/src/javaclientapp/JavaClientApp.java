/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaclientapp;

import edu.wmich.addRESTClient;

/**
 *
 * @author malyshka
 */
public class JavaClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Todays market value of MSFT is"+getQuote("MSFT"));
        System.out.println("Add 1 and 2 = " +add(1,2));
        
        addRESTClient proxy = new addRESTClient();
        
        System.out.println("From rest "+proxy.getJSON("12", "13"));
        
    }

    private static String getQuote(java.lang.String symbol) {
        net.webservicex.StockQuote service = new net.webservicex.StockQuote();
        net.webservicex.StockQuoteSoap port = service.getStockQuoteSoap();
        return port.getQuote(symbol);
    }

    private static int add(int a, int b) {
        edu.wmich.CalcWebService_Service service = new edu.wmich.CalcWebService_Service();
        edu.wmich.CalcWebService port = service.getCalcWebServicePort();
        return port.add(a, b);
    }
    
}
