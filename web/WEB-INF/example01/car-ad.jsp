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
    <title>Car Ad</title>
</head>
<body>
<jsp:include page="/WEB-INF/nav/nav.jsp" />
The information about the car ad below has been stored in a single instance of the
car ad Java Bean class which has been set as a single request attribute.
<h2>${carAd.carModel} For Sale</h2>

Price: $${carAd.carPrice}
<br>
Description: ${carAd.description}

</body>
</html>
