<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    body {
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
      background: linear-gradient(to right, #a1c4fd, #c2e9fb);
    }

    .container {
      background: white;
      padding: 30px 25px;
      border-radius: 15px;
      box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.1);
      width: 100%;
      max-width: 400px;
      text-align: center;
    }

    h2 {
      margin-bottom: 20px;
      font-size: 26px;
      font-weight: bold;
      color: #333;
    }

    .input-group {
      width: 100%;
      margin-bottom: 15px;
      text-align: left;
    }

    .input-group label {
      display: block;
      font-weight: 600;
      margin-bottom: 6px;
      color: #444;
    }

    .input-group input {
      width: 100%;
      padding: 12px;
      border: none;
      border-radius: 8px;
      font-size: 14px;
      background-color: #f0f4ff;
      box-shadow: inset 0 0 5px rgba(0, 0, 0, 0.05);
      transition: box-shadow 0.3s;
    }

    .input-group input:focus {
      outline: none;
      box-shadow: 0 0 6px rgba(0, 123, 255, 0.3);
    }

    .btn {
      width: 100%;
      padding: 12px;
      background: #007bff;
      color: white;
      border: none;
      border-radius: 8px;
      font-size: 16px;
      cursor: pointer;
      transition: background 0.3s;
    }

    .btn:hover {
      background: #0056b3;
    }

    .register-link {
      margin-top: 15px;
      font-size: 14px;
    }

    .register-link a {
      color: #007bff;
      text-decoration: none;
      font-weight: bold;
    }

    .register-link a:hover {
      text-decoration: underline;
    }

    .error-message {
      color: red;
      margin-top: 10px;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>Login</h2>
    <form action="login" method="post">
      <div class="input-group">
        <label for="UserName">User Name</label>
        <input type="text" id="username" name="UserName" required>
      </div>
      <div class="input-group">
        <label for="Password">Password</label>
        <input type="password" id="password" name="Password" required>
      </div>
      <button type="submit" class="btn">Login</button>
    </form>
    <div class="register-link">
      Don't have an account? <a href="Registrationpage.jsp">Register here</a>
    </div>

    <!-- Error message (if any) -->
    <div class="error-message">${errorMessage}</div>
  </div>
</body>
</html>
