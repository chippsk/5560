/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import net.restfulwebservices.datacontracts._2008._01.Weather;
import net.restfulwebservices.servicecontracts._2008._01.IWeatherForecastServiceGetForecastByCityDefaultFaultContractFaultFaultMessage;

/**
 *
 * @author malyshka
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static Weather getForecastByCity(java.lang.String city, java.lang.String country) throws IWeatherForecastServiceGetForecastByCityDefaultFaultContractFaultFaultMessage {
        net.restfulwebservices.servicecontracts._2008._01.WeatherForecastService service = new net.restfulwebservices.servicecontracts._2008._01.WeatherForecastService();
        net.restfulwebservices.servicecontracts._2008._01.IWeatherForecastService port = service.getBasicHttpBindingIWeatherForecastService();
        return port.getForecastByCity(city, country);
    }
    
}
