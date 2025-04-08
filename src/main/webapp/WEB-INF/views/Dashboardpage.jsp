<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard - Payment App</title>
    <style>
        body {
            height: 100vh;
            background: linear-gradient(to right, #a1c4fd, #c2e9fb);
            display: flex;
            justify-content: center;
            align-items: flex-start;
            padding: 20px;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
        }

        .container {
            width: 100%;
            max-width: 1000px;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 6px 18px rgba(0, 0, 0, 0.1);
        }

        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 16px;
        }

        .header h2 {
            font-size: 24px;
            margin: 0;
            color: #4CAF50;
        }

        .logout {
            background-color: #f44336;
            color: white;
            padding: 6px 14px;
            font-size: 14px;
            text-decoration: none;
            border-radius: 4px;
        }

        .logout:hover {
            background-color: #d32f2f;
        }

        .user-info,
        .balance-section,
        .transactions {
            background-color: #e3f2fd;
            padding: 14px;
            margin-top: 14px;
            border-radius: 8px;
            font-size: 15px;
            border: 1px solid #90caf9;
        }

        .user-info h2,
        .balance-section h3,
        .transactions h4 {
            margin: 0 0 10px 0;
        }

        .balance-section {
            display: flex;
            justify-content: space-between;
            align-items: center;
            flex-wrap: wrap;
        }

        .send-money-btn {
            background-color: #1976d2;
            color: white;
            padding: 8px 14px;
            font-size: 14px;
            border-radius: 6px;
            border: none;
            cursor: pointer;
            margin-top: 10px;
        }

        .send-money-btn:hover {
            background-color: #0d47a1;
        }

        .bank-accounts {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
            gap: 16px;
            margin-top: 20px;
        }

        .bank-card {
            background-color: #f1f8e9;
            padding: 14px;
            border-radius: 8px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
            border: 1px solid #c5e1a5;
        }

        .bank-card h4 {
            font-size: 18px;
            color: #4CAF50;
            margin: 0 0 10px 0;
        }

        .addbankaccount {
            display: inline-block;
            background-color: #fbc02d;
            padding: 8px 12px;
            font-size: 14px;
            text-align: center;
            border-radius: 5px;
            text-decoration: none;
            color: #333;
            margin-top: 10px;
        }

        .addbankaccount:hover {
            background-color: #f57f17;
        }

        .transactions .transaction-list p {
            margin: 6px 0;
        }

        .detailed-stmt {
            display: inline-block;
            background-color: #00796b;
            color: white;
            padding: 8px 12px;
            border-radius: 6px;
            text-decoration: none;
            font-size: 14px;
            margin-top: 10px;
        }

        .detailed-stmt:hover {
            background-color: #004d40;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="header">
            <h2>Payment Web App</h2>
          <form action="/logout">
			<button type="submit" class="logout-btn">Logout</button>
		</form>
           
        </div>

        <% 
            String fullName = (String) session.getAttribute("firstname");
            String email = (String) session.getAttribute("email");
            String phone = (String) session.getAttribute("phonenumber");
        %>
        <div class="user-info">
            <h2>User Information</h2>
            <p><strong>Full Name:</strong> <%= fullName %></p>
            <p><strong>Email:</strong> <%= email %></p>
            <p><strong>Phone:</strong> <%= phone %></p>
             <a href="Editprofilepage.jsp" >Edit</a>
            
        </div>

        <% 
            HttpSession  hs = request.getSession();
            String uname = (String) hs.getAttribute("uname");
        %>
        <div class="balance-section">
            <div>
                <h3>Welcome, <%= uname %></h3>
                <p><strong>Primary Bank Account No:</strong> 1234</p>
                <p><strong>Account Balance:</strong> ₹8000.00</p>
                <p><strong>Wallet Balance:</strong> ₹2000.00</p>
            </div>
            <a href="SendMoney.jsp">
                <button class="send-money-btn">Send Money</button>
            </a>
        </div>

        <div class="bank-accounts">
            <div class="bank-card">
                <h4>State Bank</h4>
                <p><strong>Bank Acct No:</strong> 1234</p>
                <p><strong>Balance:</strong> ₹XXXXX</p>
                <p><strong>IFSC Code:</strong> XXXXXX</p>
                <p><strong>Branch:</strong> XXXXX</p>
                <a href="Edit.jsp" class="addbankaccount">Edit</a>
            </div>

            <div class="bank-card">
                <a href="AddbankAccount.jsp" class="addbankaccount">[+] Add New Bank Account</a>
            </div>
        </div>

        <div class="transactions">
            <h4>Recent 10 Transactions</h4>
            <div class="transaction-list">
                <p>₹2000 sent to RAJU</p>
                <p>₹1200 received from LATHA</p>
                <p>₹5000 received from Sister</p>
                <p>...</p>
                <a href="Detailedstatement" class="detailed-stmt">Detailed Statement</a>
            </div>
        </div>
    </div>
</body>
</html>