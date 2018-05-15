<%--
  Created by IntelliJ IDEA.
  User: NL
  Date: 2017/1/23
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1">
    <tr>
        <th>事实序号</th>
        <th>标注文件名称</th>
        <th>事实内容</th>
        <th>事实的顺序</th>
    </tr>
    <%=request.getParameter("facts") %>
    <c:forEach items="${requestScope.facts}" var="fact">
        <tr>
            <td>${fact.fact_id}</td>
            <td>${fact.instrument_id}</td>
            <td>${fact.text}</td>
            <td>${fact.num}</td>
        </tr>
    </c:forEach>
</table>
</body>
</body>
</html>
