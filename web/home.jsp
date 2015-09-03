<%--
  Created by IntelliJ IDEA.
  User: Martin Alejandro
  Date: 28/08/2015
  Time: 01:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <script type="text/javascript" language="JavaScript" src="JS/Util.js"></script>
    <title></title>
  </head>
  <body>
  <input type="button"  value="Cargar Lista(Ajax Style)"
         onclick="javascript:cargarListaDeUsuarios('lista')"/>

  <div id="lista"> aca va la lista</div>

    <div>
     Presionando el siguiente Link se va a cargar el resultado en la pagina actual de ejecutar el Action.
      <s:url id="cambiar" action="ListaDeUsuarios">
          <s:param value="id"></s:param>
      </s:url>
      <s:a href="%{cambiar}">Ejecutar Action</s:a>
    </div>
  </body>
</html>
