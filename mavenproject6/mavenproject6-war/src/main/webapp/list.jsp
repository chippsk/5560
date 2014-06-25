<%-- 
    Document   : list
    Created on : Jun 18, 2014, 4:56:17 PM
    Author     : malyshka
--%>

<%@page import="com.google.appengine.api.datastore.Query"%>
<%@page import="com.google.appengine.api.users.UserServiceFactory"%>
<%@page import="com.google.appengine.api.users.User"%>
<%@page import="com.google.appengine.api.users.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserService us = UserServiceFactory.getUserService();
            User user = us.getCurrentUser();
            if(user ==null){
          %>      
            
        <a href="<%=us.createLoginURL(request.getRequestURI())%>"></a>
        <%
            } else {
                Query query = new Query("Combination");
                //query.setFileter(FilterOptions.Builder.setLimit)
        %>
        <a href="<%=us.createLogoutURL(request.getRequestURI())%>"></a>
        <%
            }
        %>
    </body>
</html>
