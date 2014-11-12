<%-- 
    Document   : ModificarRol
    Created on : 11/11/2014, 11:13:19 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Rol" %>
<jsp:useBean id="list2" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Rol</title>
        <%@include file="../../WEB-INF/jspf/jscss.jspf" %>
        <style type="text/css">
            *{
                margin: 0 auto;
            }
            #caja{
                width: 300px;
            }
        </style>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/top.jspf" %>
        <div id="caja">
            <strong>MODIFICAR ROL</strong>
            <hr>
            <% for(int i=0; i<list2.size();i++){
                    Rol rol = new Rol();
                    rol = (Rol)list2.get(i);
            %>
            <form role="form" method="get" action="using" >
                <div class="form-group">
                    <label for="exampleInputEmail1">Rol:</label>
                    <input type="text" class="form-control" value="<%= rol.getRol()%>" name="rol">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Descripcion:</label>
                    <input type="text" class="form-control" value="<%= rol.getDescrip()%>" name="descripcion">
                </div>
                
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="Modificar">
                </div>
            </form>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>

