<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
<h1>HistoryGO Players' Database</h1>
  <hr>

  <div class="form">
    <form action="hello" method="post" onsubmit="return validate()">
      <table>
        <tr>
          <td>Enter player name</td>
        </tr>
        <tr>
          <td><input id="name" name="name"></td>
          <td><input type="submit" value="Search"></td>
        </tr>
      </table>
    </form>
  </div>

  <div class="form">
    <form action="listUsers" method="post">
    List all players</br>
    <input type="submit" value="Find all">
    </form>
  </div>


  <div class="form">
    <form action="addUser" method="post">
      Insert User</br>
      <input name="name">
      <input type="submit" value="Add">
    </form>
  </div>


  <div class="form">
    <form action="delete" method="post">
      <div style="color:red; font-size: 25px;"> Delete User</br> </div>
      <input name="name">
      <input type="submit" value="DELETE">
    </form>
  </div>

</div>
</body>
</html>