<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<%--
  Created by IntelliJ IDEA.
  User: wyu861
  Date: 6/01/2021
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="/WEB-INF/nav/nav.jsp" />
<c:forEach var="images" items="${files}">
    <img src="../../images/${images.getName()}" alt="images">
</c:forEach>


</body>
</html>

