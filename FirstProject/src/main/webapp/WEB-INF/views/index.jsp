<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Home</title>
    <style>
        /* Global Styles */
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #00b4db, #0083b0);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 0;
            color: white;
        }

        /* Centered container */
        .container {
            background: rgba(0, 0, 0, 0.75);
            padding: 30px;
            border-radius: 12px;
            text-align: center;
            box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.3);
            max-width: 500px;
            width: 90%;
        }

        h2 {
            margin-bottom: 20px;
            font-size: 24px;
            font-weight: bold;
            letter-spacing: 1px;
        }

        /* Buttons */
        .buttons {
            margin-top: 20px;
        }

        .btn {
            display: inline-block;
            background: #ff4757;
            color: white;
            padding: 12px 20px;
            border-radius: 5px;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s ease;
            margin: 10px;
            font-size: 18px;
        }

        .btn:hover {
            background: #e84118;
            transform: scale(1.1);
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Welcome to JSP + Spring Boot Authentication</h2>
    
    <div class="buttons">
        <a href="register" class="btn">Register</a>
        <a href="login" class="btn">Login</a>
    </div>
</div>

</body>
</html>
