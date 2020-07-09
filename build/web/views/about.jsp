<%-- 
    Document   : index
    Created on : Jul 1, 2020, 8:44:40 AM
    Author     : kiddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="layouts/head.jsp">
            <jsp:param name="title" value="Halaman About"></jsp:param>
        </jsp:include>
    </head>
    <body>
        <div class='container pt-4'>
            <jsp:include page="layouts/navbar.jsp"></jsp:include>
        
            <h1>Hello World, you're in the about page!</h1>
        
            <jsp:include page="layouts/footer.jsp"></jsp:include>
        </div>
        <jsp:include page="layouts/scripts.jsp"></jsp:include>        
    </body>
</html>
