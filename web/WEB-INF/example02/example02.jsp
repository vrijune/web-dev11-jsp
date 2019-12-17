<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html lang="en">
    <head>
        <title>forEach and if</title>
    </head>

    <body>
        <jsp:include page="/WEB-INF/nav/nav.jsp" />

        <p>The text in the bullet points below comes from a string array in the servlet
            that is set as a request attribute.</p>

        <hr>

        <h2>Example of simple forEach loop:</h2>

        <ul>
            <c:forEach var="stringValue" items="${exampleStrings}">
                <li>${stringValue}</li>
            </c:forEach>
        </ul>

        <hr>

        <h2>Example of using forEach with if in JSTL to only display strings that are longer than 3 characters:</h2>

        <ul>
            <c:forEach var="stringValue" items="${exampleStrings}">
                <c:if test="${stringValue.length()>3}">
                    <li>${stringValue}</li>
                </c:if>
            </c:forEach>
        </ul>

        <hr>

        <h2>Example of using forEach tags with choose & when tags in JSTL:</h2>

        <ul>
            <c:forEach var="stringValue" items="${exampleStrings}">
                <c:choose>
                    <c:when test="${stringValue.length() < 4}">
                        <li>${stringValue} is less than 4 characters long</li>
                    </c:when>
                    <c:when test="${stringValue.length() > 3 && stringValue.length() < 7}">
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
