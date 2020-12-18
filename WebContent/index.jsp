<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${pageContext.request.isUserInRole('manager')}">
		<c:import url="/Pages/manager.jsp"/>
	</c:when>
	<c:when test="${pageContext.request.isUserInRole('responsible')}">
		<c:import url="/Pages/responsible.jsp"/>
	</c:when>
	<c:when test="${pageContext.request.isUserInRole('mechanician')}">
		<c:import url="/Pages/mechanician.jsp"/>
	</c:when>
	<c:otherwise>
		<c:import url="/Pages/error.jsp"/>
	</c:otherwise>
</c:choose>


</body>
</html>