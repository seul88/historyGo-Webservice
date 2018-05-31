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

  <h1>Player <c:out value="${name}"/> details</h1>
  <hr>

  <h2>Name: <c:out value="${name}"/></h2>
  <h2>Points: <c:out value="${points}"/></h2>
  <h2>ID: <c:out value="${id}"/></h2>
  <h3>Visited places: </h3>

  <c:forEach items="${places}" var="place">

      Name: <c:out value="${place.name}"/></br></br>
      Description: <c:out value="${place.description}"/></br></br>
      Points: <c:out value="${place.points}"/></br></br><hr></br>

  </c:forEach>

    </div>
</body>
</html>