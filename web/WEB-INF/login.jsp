<%-- 
    Document   : login
    Created on : Oct 9, 2022, 10:22:19 AM
    Author     : fricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <div>
            <form action="login" method="post">
                Username: <input type="text" name="username" value="${username}">
                <br>
                Password: <input type="password" name="password" value="${password}">
                <br>
                <input type="submit" value="Log In">
            </form>
        </div>
        <br>
        <div>
            <span>${note}</span>
        </div>
                    
          
    </body>
</html>
