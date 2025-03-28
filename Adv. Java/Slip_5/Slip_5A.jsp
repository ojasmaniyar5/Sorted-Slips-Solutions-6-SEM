<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Sum of First and Last Digit</title>
</head>
<body>
    <h2>Calculate Sum of First and Last Digit</h2>
    
    <form method="post">
        Enter Number: <input type="text" name="number" required>
        <input type="submit" value="Calculate">
    </form>

    <% 
        if (request.getParameter("number") != null) {
            int num = Integer.parseInt(request.getParameter("number"));
            int lastDigit = num % 10;
            int firstDigit = num;
            
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            
            int sum = firstDigit + lastDigit;
    %>
        <h3 style="color: red; font-size: 18px;">Sum: <%= sum %></h3>
    <% } %>
</body>
</html>
