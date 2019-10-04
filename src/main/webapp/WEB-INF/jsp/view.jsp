
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <c:forEach items="${names}" var="name">
       <h1>${name}</h1>
   </c:forEach>
</body>
</html>
