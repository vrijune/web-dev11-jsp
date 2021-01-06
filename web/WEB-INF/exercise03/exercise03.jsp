<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>




<%--
  Created by IntelliJ IDEA.
  User: wyu861
  Date: 6/01/2021
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Display user details for ${firstName} ${lastName} </h2>
<p>First Name : ${firstName} </p>
<p>Last Name : ${lastName} </p>


        <c:if test="${type == 'admin'}">
            <li>This user is an ADMIN user! Here is a picture of cat;</li>
            <img src='../../images/Pallas_Cat_1.jpg' alt="Cat picture">
        </c:if>










</body>
</html>
