<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MW
  Date: 2018/5/13
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>标注页面</title>
</head>
<body>
<table border="1">
    <tr>
        <th>事实序号</th>
        <th>标注文件名称</th>
        <th>事实内容</th>
        <th>事实的顺序</th>
    </tr>
    <c:forEach items="${requestScope.facts}" var="fact">
        <tr>
            <td><img src=images/${fact.fact_id} height="60"></td>
            <td>${fact.instrument_id}</td>
            <td>${fact.text}</td>
            <td>${fact.num}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
