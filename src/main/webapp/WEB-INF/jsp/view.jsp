
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${numbers}" var="number">
        <c:choose>
            <c:when test="${number % 2 == 0}">
                <h2> ${number} is even </h2>
                <br />
            </c:when>
            <c:otherwise>
                <h2> ${number} is odd </h2>
                <br />
            </c:otherwise>
        </c:choose>
    </c:forEach>
</body>
</html>
