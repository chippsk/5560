<%-- 
    Document   : result1
    Created on : May 14, 2014, 4:34:22 PM
    Author     : malyshka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="edu.wmich.*"%>
<%! int count = 10; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <form action="form1.jsp" method="GET">
    <jsp:useBean id="calc" class="edu.wmich.CalcModel" scope="session"></jsp:useBean>
    <jsp:setProperty name="calc" property="firstNumber" param="firstNumber"></jsp:setProperty>
    <jsp:setProperty name="calc" property="secondNumber" param="secondNumber"></jsp:setProperty>
    <jsp:setProperty name="calc" property="operation" param="operation"></jsp:setProperty>
    
    The Result is <%= calc.getResult() %>
    </form>
    <%
        CalcModel calc = (CalcModel)request.getAttribute("calc");
        out.println(calc.getResult());
    %>
        <%
            if(count < 10){
                
            
        %>
        <h1>Count is less than 10</h1>
        <%
            }
            else {
        %>
        <h1>Count is more than 10</h1>
        <%
            }
        %>
        <h1><%=new Date()%></h1>
        <h1><%=count%></h1>
    </body>
</html>
