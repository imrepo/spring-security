<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Admin Page</title>
</head>
<body>
    <h3>Admin page</h3>
    <c:out value="Message: ${message}"/>
    <br />

    <c:url var="logoutUrl" value="/logout"/>
    <form action="${logoutUrl}" method="post">

        <input type="submit"
               value="Log out" />

        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
    </form>
</body>
</html>