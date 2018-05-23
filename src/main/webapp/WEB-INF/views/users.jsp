<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- Static content -->
    <link rel="stylesheet" href="/resources/css/style.css">
    <script type="text/javascript" src="/resources/js/app.js"></script>

    <title>HistoryGO</title>
</head>

<body>

<c:forEach items="${users}" var="player">
    <tabele>
        <tr></tr>
        <td>
    ${player.name}  :  ${player.points}</br>  :  <form action="hello" method="post"><input type = "hidden" name="name" value="${player.name}"><input type="submit" value="Search"></form>
        </td>
    </tabele>
        </br> </br>
</c:forEach>




</body>

</html>
