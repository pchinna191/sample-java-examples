<!-- Tag Lib -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="springtag" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person Portal</title>
<style type="text/css">
.error{
color: red;
font-style: bold;
}
</style>
</head>
<body>
	<table align="center">
	<spring:form method="post" commandName="person" action="savePerson">
		<center>
			<table border="2">
				<tr>
					<td colspan="2" align="center"><springtag:message code="title"/></td>
				</tr>
				<tr>
					<td><springtag:message code="pid"/></td> <!-- Label Key -->
					<td><spring:input path="pid"/> <spring:errors path="pid" cssClass="error"/></td>
				</tr>
				<tr>
					<td><springtag:message code="fname"/></td>
					<td><spring:input path="fname"/> <spring:errors path="fname" cssClass="error"/></td>
				</tr>
				<tr>
					<td><springtag:message code="lname"/></td>
					<td><spring:input path="lname"/> <spring:errors path="lname" cssClass="error"/></td>
				</tr>	
				<tr>
					<td><springtag:message code="city"/></td>
					<td><spring:input path="city"/> <spring:errors path="city" cssClass="error"/></td>
				</tr>
				<tr>
					<td><springtag:message code="address"/></td>
					<td><spring:input path="address"/> <spring:errors path="address" cssClass="error"/></td>
				</tr>						
				<tr>
					<td colspan="2" align="center"><input type="submit" name="addPErson" value="Add"/></td>
				</tr>
				<%-- <input name="deviceID" type="hidden" value="${myDeviceData}" /> --%>
			</table>
		</center>		
	</spring:form>
	</table>
</body>
</html>