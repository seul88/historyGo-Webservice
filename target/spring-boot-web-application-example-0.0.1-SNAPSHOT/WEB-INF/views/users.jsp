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

<body style="background-color: aliceblue">
<div class="form3">
<c:forEach items="${users}" var="player">
    <form action="hello" method="post">
        <table>
            <tr>
                <td> ${player.name}  :   ${player.points} <input type = "hidden" name="name" value="${player.name}"> <input type="submit" value="Search"> </td>
            </tr>
        </table>
    </form>

        </br> <hr> </br>
</c:forEach>


</div>

</body>

</html>
