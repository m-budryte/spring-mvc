<%--
  Created by IntelliJ IDEA.
  User: mashabudryte
  Date: 03/10/2019
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        for (int i = 0; i < 10; i++) {
            out.println(i);%> <br /><%
            out.println("Your ip address is " + request.getRemoteAddr());%> <br /><%
            out.println("Your port " + request.getLocalPort());%> <br /><%
        }
    %>
</body>
</html>
