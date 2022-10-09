<%-- 
    Document   : home
    Created on : Oct 9, 2022, 12:01:01 PM
    Author     : fricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <div>
            <span>Hello <b>${user.username}</b></span>
        </div>
        
        <a href="login?logout">Log Out</a>
       
    </body>
</html>
