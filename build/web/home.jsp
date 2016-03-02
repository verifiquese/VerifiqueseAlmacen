<%-- 
    Document   : home
    Created on : 24/11/2015, 09:50:56 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            response.sendRedirect("/VerifiquesePremiumAlmacen/vs/app/document/List.xhtml");
        %>
    </body>
</html>
