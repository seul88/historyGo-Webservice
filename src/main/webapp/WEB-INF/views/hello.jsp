<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>Spring Boot</title>
</head>
<body>
  <h1>Player ${name} details</h1>
  <hr>

  <h2>Player: ${name}</h2>
  <h2>Points: ${points}</h2>
  <h2>ID: ${id}</h2>
  <h3>Visited places: </h3>
  <c:forEach items="${places}" var="player">
    ${player.name}</br>
    ${player.description}</br>
    ${player.points}</br></br>
  </c:forEach>
</body>
</html>