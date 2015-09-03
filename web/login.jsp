<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  User: Martin Alejandro Melo
  Date: 28/08/15
  Time: 13:44
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="CSS/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="CSS/login/login.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="CSS/bootstrap/bootstrap-theme.min.css">

    <!-- Latest compiled and minified JavaScript -->
    <script src="JS/jquery-1.7.1.min.js"></script>
    <script src="JS/bootstrap/bootstrap.min.js"></script>
    <script src="JS/login.js"></script>
    <title>Struts 2 Demo - Login</title>
</head>
<body class="logBox">
<div class="container">
    <div class="row logBox">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Struts 2 Demo</h1>
            <h1 class="text-center login-title">Login</h1>
            <div class="account-wall">
                <div id="imagen">
                    <img class="profile-img" id="imagenPerfil" src="Images/usuarios/default.jpg" alt="">
                </div>
                <form class="form-signin">
                    <input type="text" name="userName" id="userName" class="form-control" onchange="cambiarImagen()" placeholder="Username" required autofocus>
                    <input type="password" name="password" class="form-control" placeholder="Password" required>
                    <button class="btn btn-lg btn-success btn-block" type="submit" formaction="registrarSesion" formmethod="post">
                        Login</button>
                    <label class="checkbox pull-left">
                        <input type="checkbox" value="remember-me">
                        Recordame
                    </label>
                </form>
            </div>

        </div>
    </div>
</div>
<label class="checkbox pull-left">
    <input class="btn btn-lg btn-warning btn-block" type="button" value="Registrarme"
           onclick="window.location='register.jsp'"/>
</label>


</body>
</html>
