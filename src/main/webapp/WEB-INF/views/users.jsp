<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>

            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Static content -->
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
            <link rel="stylesheet" href="/resources/css/style.css">
            <script type="text/javascript" src="/resources/js/app.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

            <link rel="stylesheet" href="/resources/css/style.css">

        <script type="text/javascript" src="/resources/js/app.js"></script>

        <title>HistoryGO</title>
    </head>



    <body style="background-color: aliceblue">

        <div class="jumbotron text-center">  <h1 class="display-1"> U�ytkownicy </h1>
        </div>


        <div class="container-fluid">


                <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-8">
                        <table class="table table-bordered table-striped ">
                            <thead>
                            <tr>
                                <th>Nickname</th>
                                <th>Punkty</th>
                                <th>Szczeg�y</th>
                            </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${users}" var="player">

                                    <tr>
                                        <td> <b> <c:out value="${player.name}" />  </b> </td>
                                         <td>  <c:out value="${player.points}"/> </td>
                                         <td>
                                             <form action="hello" method="post">
                                                <input type = "hidden" name="name" value="${player.name}"> <input type="submit" class="btn btn-success m-1 pl-5 pr-5" value="Zobacz profil">
                                             </form>

                                             <form action="delete" method="post">
                                                 <input type = "hidden" name="name" value="${player.name}"> <input type="submit" class="btn btn-danger m-1 pl-5 pr-5" value="USU�">
                                             </form>
                                         </td>
                                    </tr>

                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div class="col-sm-2"></div>
                </div>

            </div>


    </body>
</html>
