<%@page contentType='text/html' pageEncoding='UTF-8' session='false'%>
<%@taglib prefix="v" uri="http://vdab.be/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<v:head title="Vluchten" />
<body>
	<v:menu />
	<h1>Vluchten</h1>
	<table>
		<thead>
			<tr>
				<th>Vertrek Tijd</th>
				<th>Vertrek Luchthaven</th>
				<th>Bestemming Luchthaven</th>
				<th>Duur Vlucht</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${vluchtenSchedule.scheduleResource.schedule}"
				var="schedule">
				<tr>
					<td>${schedule.flight[0].departure.scheduledTimeLocal.dateTime}</td>
					<td>${schedule.flight[0].departure.airportCode}</td>
					<td>${schedule.flight[0].arrival.airportCode}</td>
					<td>${schedule.totalJourney.formattedDuration}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>