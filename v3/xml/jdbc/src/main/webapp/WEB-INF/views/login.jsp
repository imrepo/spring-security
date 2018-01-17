<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login Page</title>
</head>
<body onload="document.loginForm.j_username.focus();">
    <h3>Login with Username and Password</h3>
    <form name='loginForm' action='/j_spring_security_check' method='POST'>
        <c:choose>
            <c:when test="${param.error != null}">
                <p style="color: red;">Your login attempt was not successful</p>
            </c:when>
            <c:when test="${param.logout != null}">
                <p>Your successfuly logged out</p>
            </c:when>
        </c:choose>

        <table>
            <tr>
                <td>User:</td>
                <td><input type='text' name='j_username'/></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='j_password'/></td>
            </tr>
            <tr>
                <td colspan='2'><input name="submit" type="submit" value="Login"/></td>
            </tr>
            <tr>
                <td><input type='checkbox' name='test_remember'/></td>
                <td>Remember me on this computer.</td>
            </tr>
        </table>

        <input type="hidden"
               name="${_csrf.parameterName}"
               value="${_csrf.token}"/>
    </form>

</body>
</html>