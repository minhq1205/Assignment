<%-- 
    Document   : login
    Created on : Mar 19, 2023, 4:20:26 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST"> 
            username: <input type="text" name="username"/> <br/>
            password:<input type="password" name="password"/> <br/>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>