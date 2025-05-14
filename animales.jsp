<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="conexion.Animal" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Listado de Animales</title>
</head>
<body>
    <h1>🐾 Animales del Zoo</h1>
    <table border="1">
        <tr>
            <th>ID</th><th>Nombre</th><th>Especie</th><th>Fecha Nac.</th><th>Recinto ID</th>
        </tr>
       <%
    List<Animal> lista = (List<Animal>) request.getAttribute("animales");
    if (lista != null && !lista.isEmpty()) {
        for (Animal a : lista) {
%>
        <tr>
            <td><%= a.getId() %></td>
            <td><%= a.getNombre() %></td>
            <td><%= a.getEspecie() %></td>
            <td><%= a.getFechaNacimiento() %></td>
            <td><%= a.getRecintoId() %></td>
        </tr>
<%
        }
    } else {
%>
        <tr><td colspan="5">No hay animales en la base de datos.</td></tr>
<%
    }
%>
    </table>
</body>
</html>
