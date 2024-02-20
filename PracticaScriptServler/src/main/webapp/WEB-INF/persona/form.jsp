<%@ page import="mx.edu.utez.sda.practicascriptservler.control.PersonaServlet" %><%--
  Created by IntelliJ IDEA.
  User: joelh
  Date: 19/02/2024
  Time: 07:39 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Persona</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/PersonaServlet" method="POST">
    <p>
        <label for="nombre">Nombre</label>
        <input id="nombre" name="nombre" type="text">
    </p>
    <p>
        <label for="semblaza">Semblaza:</label>
        <textarea name="semblanza" id="semblaza" cols="30" rows="10"></textarea>
    </p>
    <button type="submit">Enviar</button>
</form>

</body>
</html>
