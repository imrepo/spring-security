<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home Page</title>
</head>
<body onload="document.loginForm.j_username.focus();">
    <h3>Home</h3>
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