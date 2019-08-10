<%--
  Created by IntelliJ IDEA.
  User: Phuong Anh
  Date: 8/10/2019
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add phone</title>
</head>
<body>
    <h1>Add phone</h1>
    <form action="/add" method="POST">
        <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" name="name" required>
        </div>
        <div class="form-group">
            <label>Brand</label>
            <select name="brand" class="form-control" required>
                <option selected disabled>Choose brand</option>
                <option value="Apple">Apple</option>
                <option value="Samsung">Samsung</option>
                <option value="Nokia">Nokia</option>
                <option value="Others">Others</option>
            </select>
        </div>
        <div class="form-group">
            <label>Price</label>
            <input required class="form-control" type="number" name="price">
        </div>
        <div>
            <label>Description</label>
            <textarea class="form-control" name="description" required></textarea>
        </div>
        <div class="form-group" style="text-align: center;">
            <input type="submit" class="btn btn-primary btn-block"/>
            <input type="reset" class="btn btn-primary btn-block reset"/>
        </div>
    </form>
</body>
</html>
