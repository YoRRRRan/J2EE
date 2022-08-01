<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connection</title>
</head>
<body>
<%= new Date() %>
<%
            String login = request.getParameter( "txtLogin" );
            String password = request.getParameter( "txtPassword" );
            if ( login == null ) login = "";
            if ( password == null ) password = "";
            
            if ( request.getMethod().equals( "POST" ) && login.equals( "yoran" ) && password.equals( "java" ) ) {
        %>
            <p>Bienvenue <%= login %></p>
        <% } else { %>
            <form method="post" action="index.jsp">  
                <label for='txtLogin'>Login :</label>
                <input id='txtLogin' name='txtLogin' type='text' value='<%= login %>' autofocus /> <br/>
                <label for='txtPassword'>Password :</label>
                <input name='txtPassword' type='password' value='<%= password %>' /> <br/>
                <br/>
                <input name='btnConnect' type='submit' value='Se connecter' /> <br/>
            </form>
        <% } %>  
</body>
</html>