<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<%--
  Created by IntelliJ IDEA.
  User: wyu861
  Date: 6/01/2021
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> ${names}'s Favourite Movies: </h2>
<ul>

    <c:forEach var="movies" items="${movies}">
    <c:if test="${movies.length() >0 }">
        <li>${movies}</li>
        </c:if>
        </c:forEach>

</ul>


</body>
</html>
