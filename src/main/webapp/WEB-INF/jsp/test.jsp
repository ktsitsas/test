<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <form action="/test">
            <input type="text" name="test" value="${not empty param.test?param.test:''}">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
