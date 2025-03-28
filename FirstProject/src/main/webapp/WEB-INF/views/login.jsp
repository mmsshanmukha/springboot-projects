<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Login</title>
    
    <style>
        /* Apply Background */
        body {
            background: url('https://png.pngtree.com/thumb_back/fh260/background/20230415/pngtree-website-technology-line-dark-background-image_2344719.jpg') no-repeat center center fixed;
            background-size: cover;
            font-family: Arial, sans-serif;
            color: white;
            margin: 0;
            padding: 0;
        }

        /* Center the Form */
        .container {
            width: 400px;
            margin: 100px auto;
            padding: 30px;
            background: rgba(0, 0, 0, 0.7);
            border-radius: 10px;
            box-shadow: 0px 0px 15px rgba(255, 255, 255, 0.3);
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
        }

        label {
            display: block;
            text-align: left;
            font-size: 14px;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="email"], 
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background: #3498db;
            border: none;
            color: white;
            font-size: 18px;
            cursor: pointer;
            border-radius: 5px;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background: #2980b9;
        }

        .success-message {
            color: green;
            font-weight: bold;
        }

        .error-message {
            color: red;
            font-weight: bold;
        }

        p {
            font-size: 14px;
        }

        a {
            color: #f39c12;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Login</h2>

    <%-- Display success message after registration --%>
    <%
        String success = (String) request.getAttribute("success");
        if (success != null) {
    %>
        <p class="success-message"><%= success %></p>
    <%
        }
    %>

    <%-- Display error message if login fails --%>
    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
        <p class="error-message"><%= error %></p>
    <%
        }
    %>

    <form action="login" method="post">
        <label>Email:</label>
        <input type="email" name="email" required>

        <label>Password:</label>
        <input type="password" name="password" required>

        <input type="submit" value="Login">
    </form>

    <p>Don't have an account? <a href="register">Register here</a></p>
</div>

</body>
</html>
