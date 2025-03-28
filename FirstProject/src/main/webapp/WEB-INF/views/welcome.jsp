<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Welcome Page</title>
    <style>
        /* Background styling */
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #00c6ff, #0072ff);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
            color: white;
        }

        /* Centered container */
        .container {
            background: rgba(0, 0, 0, 0.8);
            padding: 30px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.3);
            max-width: 400px;
            width: 90%;
        }

        h2 {
            margin-bottom: 20px;
            font-size: 24px;
        }

        p {
            font-size: 18px;
            margin: 10px 0;
        }

        /* Stylish logout button */
        a {
            display: inline-block;
            background: #ff4757;
            color: white;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s ease;
            margin-top: 20px;
        }

        a:hover {
            background: #e84118;
            transform: scale(1.1);
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Welcome to the Application!</h2>

    <%-- Check if the username exists in the request scope --%>
    <%
        String username = (String) request.getAttribute("username");
        if (username != null) {
    %>
        <p>Hello, <strong><%= username %></strong>! You have successfully logged in.</p>
    <%
        }
    %>

    <p><a href="login" >Logout</a></p>
</div>

</body>
</html>
