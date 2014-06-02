<%-- 
    Document   : stats
    Created on : May 28, 2014, 3:44:45 PM
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
        <%
        int count = Integer.parseInt(request.getSession(true).getAttribute("page1").toString());
                %>
        The number of hits to apge 1 is <%=count%>
    </body>
</html>
