
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%int i = 0; %>

   <c:forEach items="${names}" var="name">
       <%i++;%>
       <h1>Iterating over element <%=i%> <br/> ${name}</h1>
   </c:forEach>
</body>
</html>
