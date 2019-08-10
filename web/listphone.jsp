<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Phuong Anh
  Date: 8/10/2019
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List phone</title>
</head>
<body>
    <h1>List phone</h1>
    <c:forEach var="phone" items="${list}">
        <li><c:out value="${phone.name}"/> - <c:out value="${phone.brand}"/> -
            <c:out value="${phone.price}"/> - <c:out value="${phone.description}"/></li>
    </c:forEach>
</body>
</html>
