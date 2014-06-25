/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wmich;

import net.webservicex.WeatherForecasts;

/**
 *
 * @author malyshka
 */
public class weathertest {
    
    private static WeatherForecasts getWeatherByZipCode(java.lang.String zipCode) {
        net.webservicex.WeatherForecast service = new net.webservicex.WeatherForecast();
        net.webservicex.WeatherForecastSoap port = service.getWeatherForecastSoap();
        return port.getWeatherByZipCode(zipCode);
    }
    
}
