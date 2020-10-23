<%-- 
    Document   : liste
    Created on : 23 oct. 2020, 15:02:09
    Author     : TPC
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="classes.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
        Employee emp=new Employee();
        ResultSet rs=emp.affichage();
        if(!session.getAttribute("grade").equals("admin"))
        {
        response.sendRedirect("index.jsp");
        }
        %>
        
        
        
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Liste</h1>
        <table class="table table-bordered">
            <thead><tr><th>Nom</th><th>Login</th><th>Grade</th></tr></thead>
            <tbody>
                <% while(rs.next())
                {%>
                <tr><td><%= rs.getString("nom") %></td><td><%=rs.getString("login") %></td><td><%=rs.getString("grade") %></td></tr>
                <% } %>
            </tbody>
            
            
        </table>
    </body>
</html>
