<%-- 
    Document   : login
    Created on : 4/03/2016, 05:22:35 PM
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="/VerifiquesePremiumAlmacen/resources/css/jsfcrud.css" />
    </head>
    <body>
        <div class="caja-login">
            <img width="400" src="/VerifiquesePremiumAlmacen/resources/img/vfqcc_almacen.png"/>
            <p>Agrega usuario y contraseña para ver los registros almacenados</p>
            <form action="j_security_check" method="post">
                <table style="margin: auto">
                    <tr>
                        <td>
                            <input type="text" name="j_username" id="j_username" placeholder="Nombre de usuario"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="password" name="j_password" id="j_password" placeholder="Contraseña"/>
                        </td>
                    </tr>
                </table>
                <input type="submit" value="Iniciar sesión">
            </form>

        </div>
    </body>
</html>
