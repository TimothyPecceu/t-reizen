<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix="v" uri="http://vdab.be/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<v:head title="Vluchten" />
<body>
	<v:menu />
	<h1>Vluchten</h1>
	<table>
	<thead>
	<tr><th>vertrek<th><th>bestemming</th><th>Carrier</th><th>Vlucht</th><th>Duur</th></tr>
	</thead>
	<tbody>
	<c:forEach items="${scheduleResource.schedule}" var="schedule">
	<tr><td>${schedule.flight.departure.airportCode}</td>
	<td>${schedule.flight.arrival.airportCode}</td>
	<td>${schedule.flight.marketingCarrier.airlineID}</td>
	<td>${schedule.flight.marketingCarrier.flightNumber}</td>
	<td>${schedule.totalJourney.duration}</td></tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>