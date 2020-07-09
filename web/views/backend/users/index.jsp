<%-- 
    Document   : index
    Created on : Jul 1, 2020, 9:32:38 AM
    Author     : kiddy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <c:forEach items="${data}" var="item">
        <p>${item.getName()}</p>
    </c:forEach>
        <h1>Hello World!</h1>
    </body>
</html>
