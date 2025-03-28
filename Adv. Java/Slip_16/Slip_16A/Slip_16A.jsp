<html>
<body>
<%
        String uid=request.getParameter("id");
        String password=request.getParameter("pass");

        if(uid.equals("VSH") && password.equals("vsh3004"))
			response.sendRedirect("Login.html");
        else
            response.sendRedirect("Error.html");
%>
</body>
</html>