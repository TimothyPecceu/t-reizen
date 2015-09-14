<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix="v" uri="http://vdab.be/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<v:head title="Vlucht zoeken" />
<body>
	<v:menu />
	<h1>Vlucht zoeken</h1>
	<c:url value="/boeking/bestemmingsluchthaven" var="url"/>
	<form action="${url}" method="get">
	<select name='stadid' id='stadSelect' size='8'>
		<c:forEach items='${steden}' var='stad'>
			<option value='${stad.id}'>${stad.naam}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Volgende">
	</form>
</body>
</html>