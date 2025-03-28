<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Login Error</title>
</head>
<body>
    <h2>Login Failed</h2>
    <p style="color:red;">${errorMessage}</p> <!-- ✅ Show error message -->
    <a href="login">Try Again</a>
</body>
</html>
