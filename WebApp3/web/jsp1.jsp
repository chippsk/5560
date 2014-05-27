<%-- 
    Document   : jsp1
    Created on : May 19, 2014, 3:46:32 PM
    Author     : malyshka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="edu.wmich.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <jsp.useBean id="vehicles" class="edu.wmich.VehicleList" scope="session"></jsp.usebean>
        <table>
            <thead>
            <td>Make</td>
            <td>Model</td>
            <td>Year</td>
            </thead>
        <%
            for(Vehicle v:vehicles.AllVehicles()){
                out.println("<tr><td>"+v.getMake()+"</td><td>"+v.getModel()+"</td><td>"+v.getYear()+"</td></tr>");
            }
        %>
        </table>
    </body>
</html>
