<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix="v" uri="http://vdab.be/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<v:head title="Vlucht zoeken" />
<body>
	<v:menu />
	<h1>Vlucht zoeken</h1>
	<c:url value="/boeking/bestemmingsland" var="url"/>
	<form action="${url}" method="get">
	<select name='luchthavencode' id='luchthavenSelect' size='8'>
		<c:forEach items='${luchthavens}' var='luchthaven'>
			<option value='${luchthaven.code}'>${luchthaven.naam}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Volgende">
	</form>
</body>
</html>