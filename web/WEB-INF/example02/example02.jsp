<%--
  Created by IntelliJ IDEA.
  User: tcro142
  Date: 9/04/2019
  Time: 5:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>forEach and if</title>
</head>
<body>

<jsp:include page="/WEB-INF/nav/nav.jsp"/>
The text in the bullet points below comes from a string array in the servlet
that is set as a request attribute.
<br><br>
Example of simple forEach loop:
<ul>
    <c:forEach var="stringValue" items="${exampleStrings}">
        <li>${stringValue}</li>
    </c:forEach>
</ul>

Example of using forEach with if in JSTL to only display strings that are longer than 3 characters:
<ul>
    <c:forEach var="stringValue" items="${exampleStrings}">
        <c:if test="${stringValue.length()>3}">
            <li>${stringValue}</li>
        </c:if>
    </c:forEach>
</ul>

Example of using forEach tags with choose & when tags in JSTL:
<ul>
    <c:forEach var="stringValue" items="${exampleStrings}">
        <c:choose>
            <c:when test="${stringValue.length()<4}">
                <li>${stringValue} is less than 4 characters long</li>
            </c:when>
            <c:when test="${stringValue.length()>3&&stringValue.length()<7}">
                <li>${stringValue} is less than 7 characters long</li>
            </c:when>
            <c:otherwise>
                <li>${stringValue} is greater than 6 characters long</li>
            </c:otherwise>
        </c:choose>
    </c:forEach>
</ul>

</body>
</html>
