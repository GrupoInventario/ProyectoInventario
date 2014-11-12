<%-- 
    Document   : IngresarFacultad
    Created on : 11/11/2014, 11:26:01 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="pe.edu.upeu.inventario.modelo.Facultad" %>
<jsp:useBean id="list1" scope="session" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <%@include file="../../WEB-INF/jspf/jscss1.jspf" %>
        <title>JSP Page</title>
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
            <strong>REGISTRAR FACULTAD</strong>
            <hr>
            
            <form role="form" method="get" action="usuar">
                
          
                <div class="form-group">
                    <label for="exampleInputEmail1">Facultad:</label>
                    <input type="text" class="form-control" name="usuario" placeholder="Ingresar usuario" autofocus="">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Clave:</label>
                    <input type="text" class="form-control" name="clave" placeholder="Ingresar clave" autofocus="">
                </div>
               
                <div class="form-group">
                    <label for="exampleInputEmail1">id persona:</label>
                    <input type="text" class="form-control" name="idPersona" placeholder="Ingresar persona">
                    <input type="hidden" class="form-control" name="op" value="5">
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-warning" value="Resgistrar">
                  
                </div>
            </form>
        </div>
        <%@include file="../../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
