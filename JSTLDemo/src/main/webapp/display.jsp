<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSTL Demo</title>
</head>
<body>
   <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/bank" user="root" password="N3xt@321"/>
	<sql:query var="rs" dataSource="${db}">select * from details</sql:query>
	<c:forEach items="${rs.rows}" var="details">
		<c:out value="${details.name}"></c:out>   :   <c:out value="${details.password}"></c:out>
		</br>
	</c:forEach>
	<c:set var="str" value="Hello everyone"></c:set>
	<c:forEach items:"${fn:split(str,' ')}" var="s">
		<br/>
		${s}
	</c:forEach>
</body>
</html>
