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
	<h2>${info.datum}</h2>
	<c:url value="/boeking" var="url"/>
	<form:form action="${url}" method="post" commandName="vluchtinfo">
	<form:select name='luchthavencode' items="${luchthavens}" itemLabel="naam" itemValue="code" path="vertrekLuchthavenCode" id='luchthavenSelect' size='8'/>
	<input type="submit" value="Volgende" name="bestemmingsland">
	</form:form>
</body>
</html>