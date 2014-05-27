<%-- 
    Document   : jsp2
    Created on : May 19, 2014, 4:10:14 PM
    Author     : malyshka
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp.useBean id="vehicles" class="edu.wmich.VehicleList" scope="session"></jsp.usebean>
        
        
        
    </head>
    <body>
        <table>
        <c:forEach var="vehicle" items="${sessionScope.vehicles.getAllVehicles()}">
        <tr>
            <td>${vehicle.make}</td>
            <td>${vehicle.model}</td>
            <td>${vehicle.year}</td>
        </tr>
        </c:forEach>
        </table>
    </body>
</html>
