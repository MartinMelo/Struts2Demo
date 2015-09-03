<%@ taglib prefix="s" uri="/struts-tags" %>

La lista es: <s:property value="nombres"/>
<br>

Usando un Iterator
<ul>
<s:iterator value="%{nombres}" var="nombre" status="row">
    <li>
    <s:property value="nombre"/>
    </li>
</s:iterator>
</ul>
