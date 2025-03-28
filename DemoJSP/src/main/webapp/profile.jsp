<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*,java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	101</br>
	Shanmukha</br>
	87</br>
	<% 
	String url="jdbc:mysql://localhost:3306/bank";
	String userName="root";
	String pass="N3xt@321";
	String sql="select * from details where name='shanmukha'";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,userName,pass);
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery(sql);
	rs.next();
	%>	
	name: <%= rs.getString(1)  %></br>
	password: <%= rs.getString(2) %></br>
	balance: <%= rs.getDouble(3) %></br>
	
</body>
</html>