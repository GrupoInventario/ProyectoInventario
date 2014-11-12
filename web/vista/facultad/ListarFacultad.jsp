<%-- 
    Document   : ListarFacultad
    Created on : 11/11/2014, 11:22:50 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Rol" %>
<jsp:useBean id="list1" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../../WEB-INF/jspf/estiloPrincpal.jspf" %>
        <%@include file="../../WEB-INF/jspf/jscss1.jspf" %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="../../WEB-INF/jspf/top.jspf" %>
        <div class="table-responsive">
            <a href="<%= request.getContextPath()%>/rol?op=2" class="btn btn-mini btn-primary" role="button">Nuevo</a>
            <hr>
            <table class="table table-bordered" style="width: 800px;">
                <tr>
                    <th>Id</th>
                    <th>rol</th>
                    <th>descripcion</th>
                    <th></th>
                </tr>
                <% for(int i=0; i<list1.size();i++){
                    Rol rol = new Rol();
                    rol = (Rol)list1.get(i);
                    %>
                <tr>
                    <td><%= rol.getIdrol()%></td>
                    <td><%= rol.getRol()%></td>
                    <td><%= rol.getDescrip()%></td>
                    <td>
                        <a href="rol?op=3&id=<%= rol.getIdrol()%>" class="btn btn-mini btn-primary" role="button">Editar</a>
                        <a href="rol?op=6&id=<%= rol.getIdrol()%>" class="btn btn-mini btn-primary" role="button">Eliminar</a>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
