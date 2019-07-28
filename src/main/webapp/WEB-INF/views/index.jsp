<%--
  Created by IntelliJ IDEA.
  User: 彭金海
  Date: 2019/6/26
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<table>
    <c:forEach items="${empinfo}" var="emp">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.name}</td>
            <td>${emp.sex}</td>
            <td>${emp.age}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
