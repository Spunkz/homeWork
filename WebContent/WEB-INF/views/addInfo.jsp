<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<html>    
<head>    
    <title>Spring Tiles Contact Form</title>    
</head>    
<body>    
<h2>Contact Manager</h2>    
<form:form method="post" action="addInfo.html">  
<table>
		<tr>
			<th colspan="2">Kayıt Ekle</th>
		</tr>
		<tr>
		<form:hidden path="id" />
          <td><form:label path="firstName">İsim:</form:label></td>
          <td><form:input path="firstName" size="30" maxlength="50"></form:input></td>
        </tr>
		<tr>
			    <td><form:label path="lastName">Soyisim:</form:label></td>
          <td><form:input path="lastName" size="30" maxlength="50"></form:input></td>
		</tr>
		<tr>
			    <td><form:label path="bloodGroup">Kan Grubu:</form:label></td>
          <td><form:input path="bloodGroup" size="30" maxlength="100"></form:input></td>
		</tr>
		<tr>
			    <td><form:label path="telephone">Telefon:</form:label></td>
          <td><form:input path="telephone" size="30" maxlength="100"></form:input></td>
		</tr>
		<tr>
			    <td><form:label path="address">Adres:</form:label></td>
          <td><form:input path="address" size="30" maxlength="500"></form:input></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</body>
</html>
