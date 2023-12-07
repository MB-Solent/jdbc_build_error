<%-- 
    Document   : addstudent
    Created on : 30 Nov 2023, 13:49:37
    Author     : mihai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <%
            Connection conn = null;
            try {
                // Create DB connection object
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:/home/mihai/Documents/Year 2/OOD/students.db");
                // Create the students table if it doesnt exist already
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("create table if not exists students(id integer primary key autoincrement, name string, course string, mark string)");
                
                // Create query to add student
                //request.getParameter(name)
                
            } catch (SQLException sql_e) {
                out.println("Error:" + sql_e);
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException close_e) {
                    out.println("Close error:" + close_e);
                }
            }
        %>
    </body>
</html>
