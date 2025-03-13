<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    int num = Integer.parseInt(request.getParameter("number"));
    int sum = 0;
    
    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }
    
    boolean isPerfect = (sum == num);
%>
