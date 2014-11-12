<%-- 
    Document   : ModificarFacultad
    Created on : 11/11/2014, 11:26:21 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Facultad" %>
<jsp:useBean id="list2" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            <strong>MODIFICAR FACULTAD</strong>
            <hr>
            <% for(int i=0; i<list2.size();i++){
                    Facultad fac = new Facultad();
                    fac = (Facultad)list2.get(i);
            %>
            <form role="form" method="get" action="using" >
                <div class="form-group">
                    <label for="exampleInputEmail1">Nombres:</label>
                    <input type="text" class="form-control" value="<%= fac.getNombres()%>" name="nombres">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Apellidos:</label>
                    <input type="text" class="form-control" value="<%= fac.getApellidos()%>" name="apellidos">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Facultad:</label>
                    <input type="text" class="form-control" value="<%= fac.getFacultad()%>" name="usuario">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Clave:</label>
                    <input type="text" class="form-control" value="<%= fac.getClave()%>" name="clave">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Estado:</label>
                    <input type="text" class="form-control" value="<%= fac.getEstado()%>" name="estado">
                    <input type="hidden" name="id" value="<%= fac.getIdusuario()%>">
                    <input type="hidden" name="op" value="4">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" value="Modificar">
                </div>
            </form>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
