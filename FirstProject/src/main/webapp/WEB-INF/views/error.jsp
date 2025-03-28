<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Error</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #ffcccc;
            text-align: center;
            padding: 50px;
        }
        .error-box {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px red;
            display: inline-block;
        }
        h2 {
            color: red;
        }
        p {
            font-size: 18px;
        }
        a {
            text-decoration: none;
            font-weight: bold;
            color: blue;
        }
    </style>
</head>
<body>

<div class="error-box">
    <h2>Error!</h2>
    <%
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage == null) {
            errorMessage = "Something went wrong. Please try again.";
        }
    %>

    <p><%= errorMessage %></p>

    <a href="index">Go to Home</a> | <a href="login">Try Again</a>
</div>

</body>
</html>
