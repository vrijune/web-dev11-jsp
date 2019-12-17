<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html lang="en">
    <head>
        <title>Car Ad</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/nav/nav.jsp" />

        <p>The information about the car ad below has been stored in a single instance of the car ad Java Bean class
            which has been set as a single request attribute.</p>

        <h2>${carAd.carModel} For Sale</h2>

        <p>Price: $${carAd.carPrice}</p>
        <br>
        <p>Description: ${carAd.description}</p>

    </body>
</html>
