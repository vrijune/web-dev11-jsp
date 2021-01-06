<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html lang="en">
    <head>
        <title>Title</title>
    </head>
    <body>
        <h2>Converted Units:</h2>

        <%--Display the original and converted units here--%>
    <ul>
        <li>${kilos} kilograms convert to ${pounds} pounds</li>
        <li>${celsius} celsius is ${fahrenheit} degrees fahrenheit</li>
    </ul>
    </body>
</html>
