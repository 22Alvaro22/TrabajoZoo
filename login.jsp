<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inicio de sesión</title>
    <style>
        body { font-family: sans-serif; background-color: #f0f0f0; text-align: center; padding-top: 80px; }
        form { background: white; padding: 30px; display: inline-block; border-radius: 8px; }
        input { margin: 10px; padding: 10px; width: 200px; }
        .error { color: red; }
    </style>
</head>
<body>
    <h2>Iniciar sesión</h2>
    <form method="post" action="login">
        <input type="text" name="usuario" placeholder="Usuario" required><br>
        <input type="password" name="clave" placeholder="Contraseña" required><br>
        <input type="submit" value="Entrar">
    </form>
    <%
        String error = (String) request.getAttribute("error");
        if (error != null) {
    %>
        <p class="error"><%= error %></p>
    <%
        }
    %>
</body>
</html>
