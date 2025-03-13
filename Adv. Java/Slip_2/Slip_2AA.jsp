<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Perfect Number Check</title>
</head>
<body>
    <h2>Check Perfect Number</h2>
    <form method="post">
        Enter Number: <input type="text" name="number" required>
        <input type="submit" value="Check">
    </form>

    <% if (request.getParameter("number") != null) { %>
        <%@ include file="perfectLogic.jsp" %>
        <h3>Result: <%= isPerfect ? "Perfect Number" : "Not a Perfect Number" %></h3>
    <% } %>
</body>
</html>
