<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>HistoryGO</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body style="background-color: aliceblue">


<div class="form3">

  <h1>Player ${name} details</h1>
  <hr>

  <h2>Name: ${name}</h2>
  <h2>Points: ${points}</h2>
  <h2>ID: ${id}</h2>
  <h3>Visited places: </h3>

  <c:forEach items="${places}" var="place">

      Name: ${place.name}</br></br>
      Description: ${place.description}</br></br>
      Points: ${place.points}</br></br><hr></br>

  </c:forEach>

    </div>
</body>
</html>