<%-- 
    Document   : form1
    Created on : May 14, 2014, 4:21:44 PM
    Author     : malyshka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%out.println("Some text");%>
        <form action="controller" method="GET">
            <input type="text" name="firstNumber">
            <select>
                <option name="op1" value="+">+</option>
                <option name="op1" value="-">-</option>
                <option name="op1" value="*">*</option>
                <option name="op1" value="/">/</option>
            </select>
            <input type="text" name="secondNumber"><br>
            <input type="submit" value=">>"><
        </form>
    </body>
</html>
