<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Register on Payment</title>
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #a1c4fd, #c2e9fb);
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    .form-box {
      background: #ffffff;
      padding: 20px 20px;
      border-radius: 15px;
      box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.1);
      width: 350px;
      text-align: center;
    }

    h2 {
      color: #333;
      margin-bottom: 15px;
      font-size: 20px;
    }

    label {
      display: block;
      text-align: left;
      margin: 5px 0 2px;
      color: #444;
      font-size: 13px;
      font-weight: 600;
    }

    input[type="text"],
    input[type="password"],
    input[type="email"],
    input[type="tel"] {
      width: 100%;
      padding: 8px 10px;
      margin-bottom: 8px;
      border: 1px solid #ccc;
      border-radius: 6px;
      font-size: 14px;
      transition: 0.2s;
    }

    input[type="text"]:focus,
    input[type="password"]:focus,
    input[type="email"]:focus,
    input[type="tel"]:focus {
      border-color: #007bff;
      outline: none;
      box-shadow: 0 0 3px rgba(0, 123, 255, 0.2);
    }

    input[type="submit"] {
      background: #007bff;
      color: white;
      padding: 10px;
      border: none;
      border-radius: 6px;
      cursor: pointer;
      width: 100%;
      font-size: 15px;
      margin-top: 10px;
      transition: background 0.3s;
    }

    input[type="submit"]:hover {
      background: #0056b3;
    }

    .login-link {
      margin-top: 12px;
      font-size: 13px;
    }

    .login-link a {
      color: #007bff;
      text-decoration: none;
      font-weight: bold;
    }

    .login-link a:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
  <div class="form-box">
    <h2>Register on Payment</h2>
    <form action="register" method="post">
      <label for="UserId">UserId</label>
      <input type="text" id="username" name="UserId" required>
    
      <label for="UserName">Username</label>
      <input type="text" id="username" name="UserName" required>

      <label for="FirstName">First Name</label>
      <input type="text" id="firstname" name="FirstName" required>

      <label for="LastName">Last Name</label>
      <input type="text" id="lastname" name="LastName" required>

      <label for="Password">Password</label>
      <input type="password" id="password" name="Password" required>

     
      <label for="PhoneNumber">Phone Number</label>
      <input type="tel" id="phone" name="PhoneNumber" required>
       
      <label for="Email">Email</label>
      <input type="email" id="email" name="Email" required>
      

      <label for="Address">Address</label>
      <input type="text" id="address" name="Address" required>

      <input type="submit" value="Create Account">
    </form>
    <div class="login-link">
      Already have an account? <a href="/login">Login here</a>
    </div>
  </div>
</body>
</html>
