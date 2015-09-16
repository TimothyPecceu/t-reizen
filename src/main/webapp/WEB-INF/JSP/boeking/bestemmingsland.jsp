<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix="v" uri="http://vdab.be/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<v:head title="Vlucht zoeken" />
<body>
	<v:menu />
	<h1>Vlucht zoeken</h1>
	<c:url value="/boeking" var="url"/>
	<form action="${url}" method="post">
	<select name='landcode' id='landSelect' size='8'>
		<c:forEach items='${landen}' var='land'>
			<option value='${land.code}'>${land.naam}</option>
		</c:forEach>
	</select>
	<input type="submit" value="Volgende" name="bestemmingsstad">
	</form>
</body>
</html>