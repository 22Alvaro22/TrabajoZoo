<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Bienvenido al ZooWeb</title>
    <style>
        body {
            background-color: #f0f8ff;
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 40px;
        }

        h1 {
            color: #2c3e50;
            font-size: 3em;
            margin-bottom: 10px;
        }

        p {
            color: #34495e;
            font-size: 1.2em;
        }

        .boton {
            display: inline-block;
            margin-top: 30px;
            padding: 15px 30px;
            font-size: 1em;
            color: white;
            background-color: #27ae60;
            text-decoration: none;
            border-radius: 10px;
            transition: background-color 0.3s;
        }

        .boton:hover {
            background-color: #2ecc71;
        }

        .logo {
            max-width: 300px;
            margin-bottom: 30px;
        }
    </style>
</head>
<body>

    <img src="https://cdn-icons-png.flaticon.com/512/1998/1998613.png" class="logo" alt="Logo del Zoo">

    <h1>Bienvenido a ZooWeb</h1>
    <p>Explora y gestiona los animales del zoológico desde esta plataforma educativa.</p>

    <a href="animales" class="boton">Ver Animales 🐾</a>
    <a href="login.jsp" class="boton" style="background-color:#2980b9;">Iniciar Sesión 🔐</a>
    

</body>
</html>