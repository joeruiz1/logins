<%-- 
    Document   : login
    Created on : 23/10/2017, 09:59:35 AM
    Author     : LabingXEON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     </head>

     <h1> Bienvenido ingrese su usuario </h1>
        
        <%
                        if (request.getAttribute("resultado") != null) {
                            Boolean resultado = (Boolean) request.getAttribute("resultado");
                            if (resultado.booleanValue() == true) {
                    %>
                    <h2> se ha registrado de manera exitosa</h2>
                    <%
                    } else {
                    %>     
                    <h2> llene los campos correctamente </h2>
                    <%
                            }
                        }
                    %>
        
    <form action="Login" method="post">
          <div class="form_settings">
            <p><span>usuario</span>
                <input class="contact" type="text" name="usuario" value="" /></p>
            <p><span>contraseña</span>
                <input class="contact" type="text" name="contra" value="" /></p>

            <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="contact_submitted" value="submit" /></p>
        </div>
    </form>
    <body>
    </body>
</html>
