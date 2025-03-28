<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Register</title>
    <script>
        // Show success message and redirect after 2 seconds
        function showSuccessMessage() {
            alert("Registration successful! Redirecting to Login...");
            setTimeout(function() {
                window.location.href = "login";
            }, 2000);
        }
    </script>
    
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
        input[type="text"], 
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
            background: #27ae60;
            border: none;
            color: white;
            font-size: 18px;
            cursor: pointer;
            border-radius: 5px;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background: #2ecc71;
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

        /* Chart Styles */
        .chart-container {
            width: 80%;
            max-width: 600px;
            margin: 30px auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
        }
    </style>

    <!-- Chart.js Library -->
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>

<div class="container">
    <h2>Register</h2>
	<%
    String success = (String) request.getAttribute("Registration successful!");
    if (success != null) {
%>
    <script>showSuccessMessage();</script>
<%
    }
%>
    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
        <p class="error-message"><%= error %></p>
    <%
        }
    %>

    <form action="register" method="post">
        <label>Email:</label>
        <input type="email" name="email" required>

        <label>Username:</label>
        <input type="text" name="username" required>

        <label>Password:</label>
        <input type="password" name="password" required>

        <input type="submit" value="Register">
    </form>

    <p>Already have an account? <a href="login">Login here</a></p>
</div>

</body>
</html>
