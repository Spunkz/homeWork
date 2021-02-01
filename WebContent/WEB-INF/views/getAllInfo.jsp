<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ETS Homework</title>
</head>
<body>
<h3>Kayit Listesi</h3>

<form:form method="post" action="getAllInfo.html">    
<c:if test="${!empty infoModelList}">
	<table class="tg">
	<tr>		
		<th width="120">İsim</th>
		<th width="120">Soyisim</th>
		<th width="120">Kan Grubu</th>
		<th width="120">Telefon</th>
		<th width="120">Adres</th>
	</tr>
	<c:forEach items="${infoModelList}" var="infoModel">
		<tr>
			<td>${infoModel.firstName}</td>
			<td>${infoModel.lastName}</td>
			<td>${infoModel.bloodGroup}</td>
			<td>${infoModel.telephone}</td>
			<td>${infoModel.address}</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</form:form>

</body>
</html>