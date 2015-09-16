<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix="v" uri="http://vdab.be/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>
<v:head title="Vlucht zoeken" />
<body>
	<v:menu />
	<h1>Vlucht zoeken</h1>
	<c:url value="/boeking" var="url"/>
	<form:form action="${url}" commandName="vluchtinfo">
	<select name='landcode' id='landSelect' size='8'>
		<c:forEach items='${landen}' var='land'>
			<option value='${land.code}'>${land.naam}</option>
		</c:forEach>
	</select>
	<form:label path="datum">Vertrekdatum: <form:input type="text" path="datum" /></form:label>
	<input type="submit" value="Volgende" name="vertrekstad">
	</form:form>
</body>
</html>