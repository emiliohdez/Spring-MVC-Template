<%--
  Author: emiliohdez
  Date: 4/12/20
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
  <head>
    <title>MVC Base</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/reset.css" />">
  </head>
  <body>
    <h1>Welcome to the View Side!</h1>
    <p>The controller sent a list: <c:out value="${list}"/></p>
  </body>
</html>
