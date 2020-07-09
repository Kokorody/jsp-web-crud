<%-- 
    Document   : index
    Created on : Jul 1, 2020, 8:44:40 AM
    Author     : kiddy
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="layouts/head.jsp">
            <jsp:param name="title" value="Hello World"></jsp:param>
        </jsp:include>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class='container pt-4'>
            <jsp:include page="layouts/navbar.jsp"></jsp:include>
            <div class="row">
                <div class="col-4">
                    <form action="create" method="POST">
                        <div class="form-group">
                            <label>Product Name</label>
                            <input class="form-control" type="text" 
                                   name="name" />
                        </div>
                        <div class="form-group">
                            <label>Product Category</label>
                            <select class="form-control" type="text" 
                                   name="category">
                                <option value="Alat Mandi">Alat Mandi</option>
                                <option value="Makanan & Minuman">Makanan & Minuman</option>
                                <option value="Pakaian">Pakaian</option>
                                <option value="Elektronik">Elektronik</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label>Product Quantity</label>
                            <input class="form-control" type="number" min="0" 
                                   name="qty" />
                        </div>
                        <div class="form-group">
                            <label>Product Expired</label>
                            <input class="form-control" type="text" 
                                   name="expired_at" id="datepicker" />
                        </div>
                        <div class="form-group">
                            <button class="btn btn-sm btn-primary">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
            <jsp:include page="layouts/footer.jsp"></jsp:include>
        </div>
        <jsp:include page="layouts/scripts.jsp"></jsp:include>        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
        <script type="text/javascript">
            $('#datepicker').datepicker({
                weekStart: 1,
                autoclose: true,
                todayHighlight: true,
                format: 'yyyy-mm-dd',
            });
            $('#datepicker').datepicker("setDate", new Date());
        </script>
    </body>
</html>
